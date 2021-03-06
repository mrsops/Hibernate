/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.instituto;

import java.io.Serializable;
import java.util.Set;

/**
 *
 * @author mrsops
 */
public class Profesor implements Serializable {

    private int id;
    private String nombre;
    private String ape1;
    private String ape2;
    private Set<CorreoElectronico> correosElectronicos;
    private TipoFuncionario tipoFuncionario;
    

    public Profesor() {
    }

    public Profesor(String nombre, String ape1, String ape2, TipoFuncionario funcionario) {
        this.nombre = nombre;
        this.ape1 = ape1;
        this.ape2 = ape2;
        this.tipoFuncionario = funcionario;
    }
    
    public Set<CorreoElectronico> getCorreosElectronicos() {
        return correosElectronicos;
    }

    public void setCorreosElectronicos(Set<CorreoElectronico> correosElectronicos) {
        this.correosElectronicos = correosElectronicos;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoFuncionario getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(TipoFuncionario tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
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

    
    
}
