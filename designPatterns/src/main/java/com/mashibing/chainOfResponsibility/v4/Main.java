package com.mashibing.chainOfResponsibility.v4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.msg = "大家好:) <script>,欢迎访问 mashibing.com";
        List<Filter> filters = new ArrayList<>();
        filters.add(new HtmlFilter());
        filters.add(new FaceFilter());
        for (Filter filter : filters) {
            filter.doFilter(msg);
        }
        System.out.println(msg.msg);
    }
}

class Msg{
    String msg;
}

interface Filter{
    void doFilter(Msg m);
}

class HtmlFilter implements Filter {
    @Override
    public void doFilter(Msg m) {
        m.msg = m.msg.replace("<","[");
        m.msg = m.msg.replace(">","]");
    }
}

class FaceFilter implements Filter {
    @Override
    public void doFilter(Msg m) {
        m.msg = m.msg.replace(":)","^v^");
    }
}