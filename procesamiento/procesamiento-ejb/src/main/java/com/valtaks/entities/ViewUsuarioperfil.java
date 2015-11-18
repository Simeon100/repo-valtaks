/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valtaks.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "view_usuarioperfil", catalog = "dbvaltaks", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ViewUsuarioperfil.findAll", query = "SELECT v FROM ViewUsuarioperfil v"),
    @NamedQuery(name = "ViewUsuarioperfil.findById", query = "SELECT v FROM ViewUsuarioperfil v WHERE v.id = :id"),
    @NamedQuery(name = "ViewUsuarioperfil.findByIdUsuario", query = "SELECT v FROM ViewUsuarioperfil v WHERE v.idUsuario = :idUsuario"),
    @NamedQuery(name = "ViewUsuarioperfil.findByNombre", query = "SELECT v FROM ViewUsuarioperfil v WHERE v.nombre = :nombre"),
    @NamedQuery(name = "ViewUsuarioperfil.findByEmail", query = "SELECT v FROM ViewUsuarioperfil v WHERE v.email = :email"),
    @NamedQuery(name = "ViewUsuarioperfil.findByUsuario", query = "SELECT v FROM ViewUsuarioperfil v WHERE v.usuario = :usuario"),
    @NamedQuery(name = "ViewUsuarioperfil.findByPassword", query = "SELECT v FROM ViewUsuarioperfil v WHERE v.password = :password"),
    @NamedQuery(name = "ViewUsuarioperfil.findByIdEstUsuario", query = "SELECT v FROM ViewUsuarioperfil v WHERE v.idEstUsuario = :idEstUsuario"),
    @NamedQuery(name = "ViewUsuarioperfil.findByEstUsuario", query = "SELECT v FROM ViewUsuarioperfil v WHERE v.estUsuario = :estUsuario"),
    @NamedQuery(name = "ViewUsuarioperfil.findByIdPerfil", query = "SELECT v FROM ViewUsuarioperfil v WHERE v.idPerfil = :idPerfil"),
    @NamedQuery(name = "ViewUsuarioperfil.findByPerfil", query = "SELECT v FROM ViewUsuarioperfil v WHERE v.perfil = :perfil"),
    @NamedQuery(name = "ViewUsuarioperfil.findByIdEstPerfil", query = "SELECT v FROM ViewUsuarioperfil v WHERE v.idEstPerfil = :idEstPerfil"),
    @NamedQuery(name = "ViewUsuarioperfil.findByEstPerfil", query = "SELECT v FROM ViewUsuarioperfil v WHERE v.estPerfil = :estPerfil")})

public class ViewUsuarioperfil implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_USUARIO")
    private int idUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NOMBRE")
    private String nombre;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "USUARIO")
    private String usuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "PASSWORD")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_EST_USUARIO")
    private int idEstUsuario;
    @Size(max = 45)
    @Column(name = "EST_USUARIO")
    private String estUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PERFIL")
    private int idPerfil;
    @Size(max = 45)
    @Column(name = "PERFIL")
    private String perfil;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_EST_PERFIL")
    private int idEstPerfil;
    @Size(max = 45)
    @Column(name = "EST_PERFIL")
    private String estPerfil;

    public ViewUsuarioperfil() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public int getIdEstUsuario() {
        return idEstUsuario;
    }

    public void setIdEstUsuario(int idEstUsuario) {
        this.idEstUsuario = idEstUsuario;
    }

    public String getEstUsuario() {
        return estUsuario;
    }

    public void setEstUsuario(String estUsuario) {
        this.estUsuario = estUsuario;
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public int getIdEstPerfil() {
        return idEstPerfil;
    }

    public void setIdEstPerfil(int idEstPerfil) {
        this.idEstPerfil = idEstPerfil;
    }

    public String getEstPerfil() {
        return estPerfil;
    }

    public void setEstPerfil(String estPerfil) {
        this.estPerfil = estPerfil;
    }
    
}
