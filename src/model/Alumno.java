/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author mrsops
 */
public class Alumno {
    private int id;
    private String nombre;
    private double sueldo;
    private boolean registrado;
    private Date fechaNac;
    private Date horaTutoria;
    private Date fechaResgistro;
    private String observaciones;

    public Alumno(String nombre, double sueldo, boolean registrado, Date fechaNac, Date horaTutoria, Date fechaResgistro, String observaciones) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.registrado = registrado;
        this.fechaNac = fechaNac;
        this.horaTutoria = horaTutoria;
        this.fechaResgistro = fechaResgistro;
        this.observaciones = observaciones;
    }

    public Alumno() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isRegistrado() {
        return registrado;
    }

    public void setRegistrado(boolean registrado) {
        this.registrado = registrado;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Date getHoraTutoria() {
        return horaTutoria;
    }

    public void setHoraTutoria(Date horaTutoria) {
        this.horaTutoria = horaTutoria;
    }

    public Date getFechaResgistro() {
        return fechaResgistro;
    }

    public void setFechaResgistro(Date fechaResgistro) {
        this.fechaResgistro = fechaResgistro;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
    
}
