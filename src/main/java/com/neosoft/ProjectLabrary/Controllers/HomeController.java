package com.neosoft.ProjectLabrary.Controllers;

import com.neosoft.ProjectLabrary.Entity.Users;
import com.neosoft.ProjectLabrary.UserServices.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    private Services services;

    @PostMapping("/save")
    public String save(@RequestBody Users users) {
        return services.save(users);
    }

    @GetMapping("/get/{Id}")
    public Users get(@PathVariable Long Id){
        return services.get(Id);
    }

    @GetMapping("/getAll")
    public List<Users> getAll(){
        return services.getAll();
    }
}
