package com.tekup.visionvertbackend.controller;


import com.tekup.visionvertbackend.entities.Role;
import com.tekup.visionvertbackend.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    RoleService roleService;

    @GetMapping("/")
    public List<Role> getAllRoles(){
        return roleService.getAllRoles();
    }

    @PostMapping("/")
    public Role insertRole(@RequestBody Role role){
        return roleService.insertRole(role);
    }

    @PutMapping("/update")
    public Role updateRole(@RequestBody Role role){
        return roleService.updateRole(role);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id")Long id){
        roleService.deleteById(id);
    }

    @GetMapping("/{id}")
    public Role getById(@PathVariable("id")Long id){
        return roleService.getById(id);
    }

}
