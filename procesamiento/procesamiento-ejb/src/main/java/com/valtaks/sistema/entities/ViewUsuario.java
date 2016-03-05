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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Simeon
 */
@Entity
@Table(name = "view_usuario", catalog = "db", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ViewUsuario.findAll", query = "SELECT v FROM ViewUsuario v"),
    @NamedQuery(name = "ViewUsuario.findById", query = "SELECT v FROM ViewUsuario v WHERE v.id = :id"),
    @NamedQuery(name = "ViewUsuario.findByNombre", query = "SELECT v FROM ViewUsuario v WHERE v.nombre = :nombre"),
    @NamedQuery(name = "ViewUsuario.findByUsuario", query = "SELECT v FROM ViewUsuario v WHERE v.usuario = :usuario"),
    @NamedQuery(name = "ViewUsuario.findByPassword", query = "SELECT v FROM ViewUsuario v WHERE v.password = :password"),
    @NamedQuery(name = "ViewUsuario.findByIdModulo", query = "SELECT v FROM ViewUsuario v WHERE v.idModulo = :idModulo"),
    @NamedQuery(name = "ViewUsuario.findByModulo", query = "SELECT v FROM ViewUsuario v WHERE v.modulo = :modulo"),
    @NamedQuery(name = "ViewUsuario.findByIdEstado", query = "SELECT v FROM ViewUsuario v WHERE v.idEstado = :idEstado"),
    @NamedQuery(name = "ViewUsuario.findByEstado", query = "SELECT v FROM ViewUsuario v WHERE v.estado = :estado")})
public class ViewUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ID")
    private int id;
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "USUARIO")
    private String usuario;
    @Basic(optional = false)
    @Column(name = "PASSWORD")
    private String password;
    @Basic(optional = false)
    @Column(name = "ID_MODULO")
    private int idModulo;
    @Column(name = "MODULO")
    private String modulo;
    @Basic(optional = false)
    @Column(name = "ID_ESTADO")
    private int idEstado;
    @Column(name = "ESTADO")
    private String estado;

    public ViewUsuario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(int idModulo) {
        this.idModulo = idModulo;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
