package com.mashibing.chainOfResponsibility.v2;

public class Main {
    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.msg = "大家好:) <script>,欢迎访问 mashibing.com";
        //处理msg
        new HtmlFilter().doFilter(msg);
        System.out.println(msg.msg);
    }
}
class Msg{
    String msg;
}
interface Filter{
    void doFilter(Msg m);
}
class HtmlFilter implements Filter{

    @Override
    public void doFilter(Msg m) {
        m.msg = m.msg.replace("<","[");
        m.msg = m.msg.replace(">","]");
    }
}