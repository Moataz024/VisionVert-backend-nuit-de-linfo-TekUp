package com.tekup.visionvertbackend.service;


import com.tekup.visionvertbackend.entities.Role;

import java.util.List;

public interface IRoleService {

    Role insertRole(Role post);

    List<Role> getAllRoles();

    Role updateRole(Role post);

    void deleteById(Long id);

    Role getById(Long id);
}
