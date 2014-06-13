package com.example.business.coffee.boundary;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

/**
 * Created with IntelliJ IDEA.
 * User: jcheng
 * Date: 6/9/14
 * Time: 7:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class CallTracer {

    @AroundInvoke
    public Object trace(InvocationContext ic) throws Exception {
        System.out.println("-- " + ic.getMethod());
        return ic.proceed();
    }
}
