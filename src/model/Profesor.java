/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Set;

/**
 *
 * @author mrsops
 */
public class Profesor implements Serializable {

    private int id;
    private Nombre nombre;
    private Set<CorreoElectronico> correosElectronicos;
    private TipoFuncionario tipoFuncionario;
    

    public Profesor() {
    }

    public Profesor(Nombre nombre) {
        this.nombre = nombre;
    }

    public Profesor(int id, Nombre nombre) {
        this.id = id;
        this.nombre = nombre;
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

    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }
}
