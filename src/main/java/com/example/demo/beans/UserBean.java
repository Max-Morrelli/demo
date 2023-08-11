package com.example.demo.beans;

import com.example.demo.service.UserService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@RequestScoped
public class UserBean {
    private String name;
    private Integer age;
    @Inject
    private UserService userService;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String save() {
        userService.createUser(this.name, this.age);
        return "success"; // Ritorna la stringa "success" per navigare verso una pagina successiva
    }
}
