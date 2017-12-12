package com.example.lolo.examenmanuelmorilla;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Lolo on 12/12/2017.
 */

public class Producto implements Serializable {

    private int idProducto;
    private String nombreProducto;
    private int imagen;
    private double precio;
    private String descripcion;
    private ArrayList galeriaImagenes;

    public Producto(int idProducto, String nombreProducto, int imagen, double precio, String descripcion, ArrayList galeriaImagenes) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.imagen = imagen;
        this.precio = precio;
        this.descripcion = descripcion;
        this.galeriaImagenes = galeriaImagenes;
    }


    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList getGaleriaImagenes() {
        return galeriaImagenes;
    }

    public void setGaleriaImagenes(ArrayList galeriaImagenes) {
        this.galeriaImagenes = galeriaImagenes;
    }
}
