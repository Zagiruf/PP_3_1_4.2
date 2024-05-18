package ru.kata.spring.boot_security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.repository.RoleRepository;

import java.util.List;
import java.util.Set;

@Service
public class RoleService {
    RoleRepository roleRepository;
    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }
    public void saveRole(Role role) {
        roleRepository.save(role);
    }

    public List<Role> findRoles() {
       return roleRepository.findAll();
    }
//    public List <Role> roseId (Long idRole) {
//       returry.n roleReposito
//    }


}