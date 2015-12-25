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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "general", catalog = "dbvaltaks", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "General.findAll", query = "SELECT g FROM General g"),
    @NamedQuery(name = "General.findByGenpkGeneral", query = "SELECT g FROM General g WHERE g.genpkGeneral = :genpkGeneral"),
    @NamedQuery(name = "General.findByGenCodigo", query = "SELECT g FROM General g WHERE g.genCodigo = :genCodigo"),
    @NamedQuery(name = "General.findByGenAbreviatura", query = "SELECT g FROM General g WHERE g.genAbreviatura = :genAbreviatura"),
    @NamedQuery(name = "General.findByGenNombre", query = "SELECT g FROM General g WHERE g.genNombre = :genNombre")})
public class General implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "gen_pkGeneral")
    private Integer genpkGeneral;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "gen_codigo")
    private String genCodigo;
    @Size(max = 5)
    @Column(name = "gen_abreviatura")
    private String genAbreviatura;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "gen_nombre")
    private String genNombre;
    @JoinColumn(name = "gen_fkTipo", referencedColumnName = "tip_pkTipo")
    @ManyToOne(optional = false)
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
