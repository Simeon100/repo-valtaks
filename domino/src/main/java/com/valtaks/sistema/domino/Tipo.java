/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valtaks.sistema.domino;

import java.io.Serializable;

/**
 *
 * @author Simeon
 */

public class Tipo implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Integer tippkTipo;
    private String tipCodigo;
    private String tipNombre;

    public Tipo() {
    }

    public Tipo(Integer tippkTipo) {
        this.tippkTipo = tippkTipo;
    }

    public Tipo(Integer tippkTipo, String tipCodigo, String tipNombre) {
        this.tippkTipo = tippkTipo;
        this.tipCodigo = tipCodigo;
        this.tipNombre = tipNombre;
    }

    public Integer getTippkTipo() {
        return tippkTipo;
    }

    public void setTippkTipo(Integer tippkTipo) {
        this.tippkTipo = tippkTipo;
    }

    public String getTipCodigo() {
        return tipCodigo;
    }

    public void setTipCodigo(String tipCodigo) {
        this.tipCodigo = tipCodigo;
    }

    public String getTipNombre() {
        return tipNombre;
    }

    public void setTipNombre(String tipNombre) {
        this.tipNombre = tipNombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tippkTipo != null ? tippkTipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipo)) {
            return false;
        }
        Tipo other = (Tipo) object;
        if ((this.tippkTipo == null && other.tippkTipo != null) || (this.tippkTipo != null && !this.tippkTipo.equals(other.tippkTipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.valtaks.entities.Tipo[ tippkTipo=" + tippkTipo + " ]";
    }
    
}
