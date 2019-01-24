/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.instituto;

import java.io.Serializable;

/**
 *
 * @author mrsops
 */
public class Nombre implements Serializable {

    private String nombre;
    private String ape1;
    private String ape2;

    public Nombre() {
    }

    public Nombre(String nombre, String ape1, String ape2) {
        this.nombre = nombre;
        this.ape1 = ape1;
        this.ape2 = ape2;
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

    public String getNombreCompleto() {
        StringBuilder sb = new StringBuilder();
        if (this.ape1 != null && (this.ape1.trim().length() > 0)) {
            sb.append(this.ape1);
        }
        if (this.ape2 != null && (this.ape2.trim().length() > 0)) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(this.ape2);
        }
        if (this.nombre != null && (this.nombre.trim().length() > 0)) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(this.nombre);
        }
        return sb.toString();
    }

    public String getIniciales() {
        StringBuilder sb = new StringBuilder();
        if ((this.nombre != null) && (this.nombre.trim().length() > 0)) {
            sb.append(this.nombre.substring(0, 1));
        }
        if ((this.ape1 != null) && (this.ape1.trim().length() > 0)) {
            sb.append(this.ape1.substring(0, 1));
        }
        if ((this.ape2 != null) && (this.ape2.trim().length() > 0)) {
            sb.append(this.ape2.substring(0, 1));
        }
        
        return sb.toString();

    }
}
