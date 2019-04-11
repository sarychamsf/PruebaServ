/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkyong.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloWorldService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String iterar() {

        int n = 1000000000;
        long num = (long) (Math.random() * n) + 1;
        System.out.println("El número es: " + num + ".");
        System.out.println("Comenzamos a iterar.");

        for (int i = 0; i < (long) num; i++) {

        }

        return "Terminé de Iterar hasta " + num + ".";

    }

}
