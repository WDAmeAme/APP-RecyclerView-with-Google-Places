package com.axon.ame.googleplacesrecycler.modelos;

public class PruebaModelo {
    boolean seleccionar;
    String id;
    String nombre;
    String icon;
    String tipoLugar;
    String domicilio;
    double latitud;
    double longitud;

    public PruebaModelo(boolean seleccionar, String id, String nombre, String icon, String tipoLugar, String domicilio, double latitud, double longitud) {
        this.seleccionar = seleccionar;
        this.id = id;
        this.nombre = nombre;
        this.icon = icon;
        this.tipoLugar = tipoLugar;
        this.domicilio = domicilio;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public boolean isSeleccionar() {
        return seleccionar;
    }

    public void setSeleccionar(boolean seleccionar) {
        this.seleccionar = seleccionar;
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

    public String getTipoLugar() {
        return tipoLugar;
    }

    public void setTipoLugar(String tipoLugar) {
        this.tipoLugar = tipoLugar;
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
