//package com.example.demo.rest;
//
//import com.example.demo.db.dto.User;
//import com.example.demo.service.UserService;
//import jakarta.inject.Inject;
//import jakarta.ws.rs.GET;
//import jakarta.ws.rs.Path;
//import jakarta.ws.rs.PathParam;
//import jakarta.ws.rs.Produces;
//import jakarta.ws.rs.core.MediaType;
//
//@Path("/users")
//public class UserResource {
//
//    @Inject
//    private UserService userService;
//
//    @GET
//    @Path("/{username}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public User getUser(@PathParam("username") String username) {
//        return userService.getUserByUsername(username);
//    }
//}
