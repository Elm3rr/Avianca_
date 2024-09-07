package com.grupo_3.Avianca.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupo_3.Avianca.model.Roles;

public interface RolesRepository extends JpaRepository<Roles, Integer>{
    Optional<Roles> findByName(String name);
}
