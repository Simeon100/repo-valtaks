/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valtaks.sistema.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Simeon
 */
@Entity
@Table(name = "maestra", catalog = "dbvaltaks", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Maestra.findAll", query = "SELECT m FROM Maestra m"),
    @NamedQuery(name = "Maestra.findByMstpkMaestra", query = "SELECT m FROM Maestra m WHERE m.mstpkMaestra = :mstpkMaestra"),
    @NamedQuery(name = "Maestra.findByMstDato", query = "SELECT m FROM Maestra m WHERE m.mstDato = :mstDato"),
    @NamedQuery(name = "Maestra.findByMstDescripcion", query = "SELECT m FROM Maestra m WHERE m.mstDescripcion = :mstDescripcion")})
public class Maestra implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "mst_pkMaestra")
    private Integer mstpkMaestra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "mst_dato")
    private String mstDato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "mst_descripcion")
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
