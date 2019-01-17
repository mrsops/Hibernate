/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author mrsops
 */
public class Seguro implements Serializable{
    private int idSeguro;
    private String nif;
    private String nombre;
    private String ape1;
    private String ape2;
    private int edad;
    private int sexo;
    private int casado;
    private int numHijos;
    private int embarazada;
    private int oftalmologia;
    private int dental;
    private int fecundacionInVitro;
    private int corazon;
    private int estomacal;
    private int rinyones;
    private int alergia;
    private String nombreAlergia;
    private Date fechaCreacion;

    public Seguro() {
    }

    public Seguro(int idSeguro, String nif, String nombre, String ape1, String ape2, int edad, int sexo, int casado, int numHijos, int embarazada, int oftalmologia, int dental, int fecundacionInVitro, int corazon, int estomacal, int rinyones, int alergia, String nombreAlergia, Date fechaCreacion) {
        this.idSeguro = idSeguro;
        this.nif = nif;
        this.nombre = nombre;
        this.ape1 = ape1;
        this.ape2 = ape2;
        this.edad = edad;
        this.sexo = sexo;
        this.casado = casado;
        this.numHijos = numHijos;
        this.embarazada = embarazada;
        this.oftalmologia = oftalmologia;
        this.dental = dental;
        this.fecundacionInVitro = fecundacionInVitro;
        this.corazon = corazon;
        this.estomacal = estomacal;
        this.rinyones = rinyones;
        this.alergia = alergia;
        this.nombreAlergia = nombreAlergia;
        this.fechaCreacion = fechaCreacion;
    }

    public int getIdSeguro() {
        return idSeguro;
    }

    public void setIdSeguro(int idSeguro) {
        this.idSeguro = idSeguro;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe1() {
        return ape1;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public String getApe2() {
        return ape2;
    }

    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getCasado() {
        return casado;
    }

    public void setCasado(int casado) {
        this.casado = casado;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public int getEmbarazada() {
        return embarazada;
    }

    public void setEmbarazada(int embarazada) {
        this.embarazada = embarazada;
    }

    public int getOftalmologia() {
        return oftalmologia;
    }

    public void setOftalmologia(int oftalmologia) {
        this.oftalmologia = oftalmologia;
    }

    public int getDental() {
        return dental;
    }

    public void setDental(int dental) {
        this.dental = dental;
    }

    public int getFecundacionInVitro() {
        return fecundacionInVitro;
    }

    public void setFecundacionInVitro(int fecundacionInVitro) {
        this.fecundacionInVitro = fecundacionInVitro;
    }

    public int getCorazon() {
        return corazon;
    }

    public void setCorazon(int corazon) {
        this.corazon = corazon;
    }

    public int getEstomacal() {
        return estomacal;
    }

    public void setEstomacal(int estomacal) {
        this.estomacal = estomacal;
    }

    public int getRinyones() {
        return rinyones;
    }

    public void setRinyones(int rinyones) {
        this.rinyones = rinyones;
    }

    public int getAlergia() {
        return alergia;
    }

    public void setAlergia(int alergia) {
        this.alergia = alergia;
    }

    public String getNombreAlergia() {
        return nombreAlergia;
    }

    public void setNombreAlergia(String nombreAlergia) {
        this.nombreAlergia = nombreAlergia;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    
    
    
}
