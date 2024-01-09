/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.botiga;

/**
 *
 * @author lleyton.camram.dam_i
 */
public class Productes {
    private String nombre;
    private float precio;
    private String descripcion;
    
     public Productes(String nombre, float precio, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }
      public String getnombre() {
        return nombre;
    }

    public float getprecio() {
        return precio;
    }

    public String getdescripcion() {
        return descripcion;
    }
}
