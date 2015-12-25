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
@Table(name = "tipo", catalog = "dbvaltaks", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipo.findAll", query = "SELECT t FROM Tipo t"),
    @NamedQuery(name = "Tipo.findByTippkTipo", query = "SELECT t FROM Tipo t WHERE t.tippkTipo = :tippkTipo"),
    @NamedQuery(name = "Tipo.findByTipCodigo", query = "SELECT t FROM Tipo t WHERE t.tipCodigo = :tipCodigo"),
    @NamedQuery(name = "Tipo.findByTipNombre", query = "SELECT t FROM Tipo t WHERE t.tipNombre = :tipNombre")})
public class Tipo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tip_pkTipo")
    private Integer tippkTipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "tip_codigo")
    private String tipCodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "tip_nombre")
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
