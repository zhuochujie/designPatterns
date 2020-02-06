package com.mashibing.chainOfResponsibility.v7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.msg = "大家好:) <script>,欢迎访问 mashibing.com 996";
        FilterChain fc = new FilterChain();
        fc.add(new HtmlFilter());
        fc.add(new FaceFilter());

        FilterChain fc2 = new FilterChain();
        fc2.add(new SensltiveFilter());
        fc2.add(new URLFilter());
        fc.add(fc2);
        fc.doFilter(msg);
        System.out.println(msg.msg);
    }
}

class Msg{
    String msg;
}

interface Filter{
    boolean doFilter(Msg m);
}

class HtmlFilter implements Filter {
    @Override
    public boolean doFilter(Msg m) {
        m.msg = m.msg.replace("<","[");
        m.msg = m.msg.replace(">","]");
        return true;
    }
}

class FaceFilter implements Filter {
    @Override
    public boolean doFilter(Msg m) {
        m.msg = m.msg.replace(":)","^v^");
        return true;
    }
}

class SensltiveFilter implements Filter {
    @Override
    public boolean doFilter(Msg m) {
        m.msg = m.msg.replace("996","955");
        return false;
    }
}

class URLFilter implements Filter {
    @Override
    public boolean doFilter(Msg m) {
        m.msg = m.msg.replace("mashibing.com","http://wwww.mashibing.com");
        return true;
    }
}

class FilterChain implements Filter {
    List<Filter> filters = new ArrayList<>();
    public FilterChain add(Filter filter){
        filters.add(filter);
        return this;
    }
    @Override
    public boolean doFilter(Msg msg){
        for (Filter filter : filters) {
            if (! filter.doFilter(msg)) return false;
        }
        return true;
    }
}