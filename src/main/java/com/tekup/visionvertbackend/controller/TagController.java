package com.tekup.visionvertbackend.controller;

import com.tekup.visionvertbackend.entities.Tag;
import com.tekup.visionvertbackend.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tag")
public class TagController {

    @Autowired
    TagService roleService;

    @GetMapping("/")
    public List<Tag> getAllTags(){
        return roleService.getAllTags();
    }

    @PostMapping("/")
    public Tag insertTag(@RequestBody Tag role){
        return roleService.insertTag(role);
    }

    @PutMapping("/update")
    public Tag updateTag(@RequestBody Tag role){
        return roleService.updateTag(role);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id")Long id){
        roleService.deleteById(id);
    }

    @GetMapping("/{id}")
    public Tag getById(@PathVariable("id")Long id){
        return roleService.getById(id);
    }

}
