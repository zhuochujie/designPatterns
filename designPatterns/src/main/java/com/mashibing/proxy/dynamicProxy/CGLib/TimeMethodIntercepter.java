package com.mashibing.proxy.dynamicProxy.CGLib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class TimeMethodIntercepter implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(o.getClass().getSuperclass().getName());
        long startTime = System.currentTimeMillis();
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println(o.getClass().getSuperclass().getName() +"的"+ method.getName() +"方法耗费时间（ms）："+ (System.currentTimeMillis() - startTime));
        return result;
    }
}
