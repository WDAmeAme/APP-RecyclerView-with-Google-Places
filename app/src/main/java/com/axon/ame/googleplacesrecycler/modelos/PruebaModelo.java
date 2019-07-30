package com.axon.ame.googleplacesrecycler.modelos;

public class PruebaModelo {
    String id;
    String nombre;
    String icon;
    String domicilio;
    double latitud;
    double longitud;

    public PruebaModelo(String id, String nombre, String icon, String domicilio, double latitud, double longitud) {
        this.id = id;
        this.nombre = nombre;
        this.icon = icon;
        this.domicilio = domicilio;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
}
