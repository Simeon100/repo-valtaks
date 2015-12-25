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

public class Maestra implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Integer mstpkMaestra;
    private String mstDato;
    private String mstDescripcion;

    public Maestra() {
    }

    public Maestra(Integer mstpkMaestra) {
        this.mstpkMaestra = mstpkMaestra;
    }

    public Maestra(Integer mstpkMaestra, String mstDato, String mstDescripcion) {
        this.mstpkMaestra = mstpkMaestra;
        this.mstDato = mstDato;
        this.mstDescripcion = mstDescripcion;
    }

    public Integer getMstpkMaestra() {
        return mstpkMaestra;
    }

    public void setMstpkMaestra(Integer mstpkMaestra) {
        this.mstpkMaestra = mstpkMaestra;
    }

    public String getMstDato() {
        return mstDato;
    }

    public void setMstDato(String mstDato) {
        this.mstDato = mstDato;
    }

    public String getMstDescripcion() {
        return mstDescripcion;
    }

    public void setMstDescripcion(String mstDescripcion) {
        this.mstDescripcion = mstDescripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mstpkMaestra != null ? mstpkMaestra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Maestra)) {
            return false;
        }
        Maestra other = (Maestra) object;
        if ((this.mstpkMaestra == null && other.mstpkMaestra != null) || (this.mstpkMaestra != null && !this.mstpkMaestra.equals(other.mstpkMaestra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.valtaks.entities.Maestra[ mstpkMaestra=" + mstpkMaestra + " ]";
    }
    
}
