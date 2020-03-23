package com.johnny.udpserver.model;

public class RabbitMqMsg {
    private String ip;
    private int port;
    private String msg;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "RabbitMqMsg{" +
                "ip='" + ip + '\'' +
                ", port='" + port + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
