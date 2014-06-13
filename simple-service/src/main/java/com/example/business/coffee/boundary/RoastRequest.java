package com.example.business.coffee.boundary;

import com.example.business.coffee.entity.Bean;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.core.Response;

/**
 * Created with IntelliJ IDEA.
 * User: jcheng
 * Date: 6/9/14
 * Time: 6:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class RoastRequest {
    private Bean bean;
    private AsyncResponse ar;

    public RoastRequest(Bean bean, AsyncResponse ar) {
        this.bean = bean;
        this.ar = ar;
    }

    public Bean getBean() {
        return bean;
    }

    public void sendMessage(String result) {
        Response response = Response.ok(result).build();
        ar.resume(response);
    }

    public void errorHappened(Exception ex) {
        ar.resume(ex);
    }
}
