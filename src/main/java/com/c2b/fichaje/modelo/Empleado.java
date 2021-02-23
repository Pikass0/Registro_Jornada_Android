package com.c2b.fichaje.modelo;

import java.io.Serializable;
import java.util.Objects;

public class Empleado implements Serializable {

    private String nombre, apellidos, dni, password, email;
    private Float jornada;
//    No necesito estos dos para al app
//    private Boolean admin, activo;

    public Empleado() {
    }

    public Empleado(String dni, String password) {
        this.dni = dni;
        this.password = password;
    }

    public Empleado(String nombre, String apellidos, String dni, String password, String email, Float jornada) {
        this(dni, password);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.jornada = jornada;
    }

    //GETTERS/SETTTERS


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Float getJornada() {
        return jornada;
    }

    public void setJornada(Float jornada) {
        this.jornada = jornada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(dni, empleado.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}
