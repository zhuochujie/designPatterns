package com.mashibing.chainOfResponsibility.v1;

public class Main {
    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.msg = "大家好:) <script>,欢迎访问 mashibing.com";
        msg.msg = msg.msg.replace("<","[");
        msg.msg = msg.msg.replace(">","]");
        System.out.println(msg.msg);
    }
}
class Msg{
    String msg;
}
