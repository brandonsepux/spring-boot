package com.forge.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity // spring boot, realiza pesistencia
@Table(name = "Person") //relaciona la tabla con la clase
public class Person {

    @Id// primary key
    @Column(name = "id_person") // nombre de la clumna
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrementable
    private Long id;

    @Column(name = "nombre")
    @NotNull
    private String nombre;

    @Column(name = "apellido")
    @NotNull
    private String apellido;

    @Column(name = "rut")
    @NotNull
    private String rut;

    @Column(name = "celular")
    @NotNull
    private int celular;

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getRut() {
        return rut;
    }

    public int getCelular() {
        return celular;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
