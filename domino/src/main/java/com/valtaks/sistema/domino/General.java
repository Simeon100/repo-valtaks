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

public class General implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Integer genpkGeneral;
    private String genCodigo;
    private String genAbreviatura;
    private String genNombre;
    private Tipo genfkTipo;

    public General() {
    }

    public General(Integer genpkGeneral) {
        this.genpkGeneral = genpkGeneral;
    }

    public General(Integer genpkGeneral, String genCodigo, String genNombre) {
        this.genpkGeneral = genpkGeneral;
        this.genCodigo = genCodigo;
        this.genNombre = genNombre;
    }

    public Integer getGenpkGeneral() {
        return genpkGeneral;
    }

    public void setGenpkGeneral(Integer genpkGeneral) {
        this.genpkGeneral = genpkGeneral;
    }

    public String getGenCodigo() {
        return genCodigo;
    }

    public void setGenCodigo(String genCodigo) {
        this.genCodigo = genCodigo;
    }

    public String getGenAbreviatura() {
        return genAbreviatura;
    }

    public void setGenAbreviatura(String genAbreviatura) {
        this.genAbreviatura = genAbreviatura;
    }

    public String getGenNombre() {
        return genNombre;
    }

    public void setGenNombre(String genNombre) {
        this.genNombre = genNombre;
    }

    public Tipo getGenfkTipo() {
        return genfkTipo;
    }

    public void setGenfkTipo(Tipo genfkTipo) {
        this.genfkTipo = genfkTipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (genpkGeneral != null ? genpkGeneral.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof General)) {
            return false;
        }
        General other = (General) object;
        if ((this.genpkGeneral == null && other.genpkGeneral != null) || (this.genpkGeneral != null && !this.genpkGeneral.equals(other.genpkGeneral))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.valtaks.entities.General[ genpkGeneral=" + genpkGeneral + " ]";
    }
    
}
