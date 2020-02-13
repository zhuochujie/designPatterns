package com.mashibing.chainOfResponsibility.v8.v1;

import java.util.ArrayList;
import java.util.List;

public class Main_Servlet {
    public static void main(String[] args) {
        Request request = new Request();
        Response response = new Response();
        request.str = "大家好:) <script>,欢迎访问 mashibing.com 996";
        response.str = "response";
        FilterChain fc = new FilterChain();
        fc.add(new HtmlFilter()).add(new FaceFilter()).doFilter(request,response,fc);
        System.out.println(request.str);
        System.out.println(response.str);
    }
}

class Msg{
    String msg;
}
class Request{
    String str;
}
class Response{
    String str;
}
interface Filter{
    boolean doFilter(Request request,Response response,FilterChain filterChain);
}

class HtmlFilter implements Filter {
    @Override
    public boolean doFilter(Request request,Response response,FilterChain filterChain) {
        request.str = request.str.replace("<","[").replace(">","]");
        filterChain.doFilter(request,response,filterChain);
        response.str = response.str + "--HtmlFilter";
        return true;
    }
}

class FaceFilter implements Filter {
    @Override
    public boolean doFilter(Request request,Response response,FilterChain filterChain) {
        request.str = request.str.replace(":)","^v^");
        filterChain.doFilter(request,response,filterChain);
        response.str = response.str + "--FaceFilter";
        return true;
    }
}


class FilterChain implements Filter{
    List<Filter> filters = new ArrayList<>();
    int index = 0;
    public FilterChain add(Filter filter){
        filters.add(filter);
        return this;
    }
    @Override
    public boolean doFilter(Request request,Response response,FilterChain chain){
            if (index == filters.size()) return false;
            Filter f = filters.get(index);
            index ++;
            return f.doFilter(request,response,chain);
    }
}