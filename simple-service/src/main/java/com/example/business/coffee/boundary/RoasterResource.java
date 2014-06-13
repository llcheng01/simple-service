package com.example.business.coffee.boundary;

import com.example.business.coffee.entity.Bean;
import com.example.business.coffee.entity.RoastType;

import java.util.logging.Level;
import java.util.logging.Logger;


import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.Response;

/**
 * Created with IntelliJ IDEA.
 * User: jcheng
 * Date: 6/9/14
 * Time: 7:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class RoasterResource {

    @PathParam("id")
    private String id;


    @POST
    public void roast(@Suspended AsyncResponse ar, Bean bean) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(RoasterResource.class.getName()).log(Level.SEVERE, null, ex);
        }
        bean.setType(RoastType.DARK);
        bean.setName(id);
        bean.setBlend(bean.getBlend() + ": The dark side of the bean");
        Response response = Response.ok(bean).header("x-roast-id", id).build();
        ar.resume(response);
    }

}
