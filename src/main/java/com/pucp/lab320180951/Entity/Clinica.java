package com.pucp.lab320180951.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="clinica")
public class Clinica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "direccion", nullable = false)
    private String direccion;

    @Column(name = "telefono", nullable = false)
    private String telefono;

    public int getid(){return id; }
    public void setId(int id){this.id=id; }

    public String getNombre(){return nombre; }
    public void setNombre(String id){this.nombre=nombre; }

    public String getdireccion(){return direccion; }
    public void setDireccion(String id){this.direccion=direccion; }



}
