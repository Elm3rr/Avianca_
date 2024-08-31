package com.grupo_3.Avianca.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Usuario {
    @Id
    private Long id;
    private String nombres;
    private String apellidos;
    private String DPI;
    private String NIT;
    private String Rol;
    private String Contraseña;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getDPI() {
        return DPI;
    }
    public void setDPI(String dPI) {
        DPI = dPI;
    }
    public String getNIT() {
        return NIT;
    }
    public void setNIT(String nIT) {
        NIT = nIT;
    }
    public String getRol() {
        return Rol;
    }
    public void setRol(String rol) {
        Rol = rol;
    }
    public String getContraseña() {
        return Contraseña;
    }
    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    } 
    
}
