package com.johnny.hm.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UdpUtil {
    private static Logger logger = LoggerFactory.getLogger(UdpUtil.class);

    public final static String PROGRAM_CODE = "ffffffff"; //工程号

    public final static String TARGET_MODULE_CODE = "00";//目标模块

    public final static String TARGET_MAC_CODE = "01";

    public final static String SOURCE_MAC_CODE = "00";

    public final static String ASK = "01";

    public final static String EMPTY_SEQ = "0000";//无需响应的指令

    public static String getHeader(int seq, String macCode, int cmd) {
        String seqStr = seq <= 0 ? EMPTY_SEQ : HexUtil.toHexString(seq, 4);

        String header = UdpConfig.UDP_HEADER_CODE //TXPARK
                + TARGET_MAC_CODE//目标设备
                + SOURCE_MAC_CODE//原设备
                + seqStr//序列号
                + PROGRAM_CODE//工程号
                + TARGET_MODULE_CODE//目标模块
                + HexUtil.toHexString(cmd, 4)//指令编码
                + ASK//ASK
                + HexUtil.toHexString(Long.parseLong(macCode), 8);//机器码
        return header;
    }

    public static String toMsg(String header, String content) {
        StringBuffer result = new StringBuffer();
        int contentLength = content.length() / 2 + 1; //存储长度的1位byte
        int total = header.length() / 2 + contentLength + 2 + 2;// crc两位byte  头长度2位byte
        String totalStr = HexUtil.toHexString(total, 2);
        result.append(totalStr + totalStr);
        result.append(header);//头部 0-23
        result.append(HexUtil.toHexString(contentLength, 2));//记录长度
        result.append(content);
        int crc = CRC16.ccr16(result.toString());
        result.append(HexUtil.toHexString(crc, 4));
        return result.toString();
    }
}
