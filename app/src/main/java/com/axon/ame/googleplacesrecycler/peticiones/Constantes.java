package com.axon.ame.googleplacesrecycler.peticiones;

import com.axon.ame.googleplacesrecycler.modelos.PruebaModelo;
import java.util.ArrayList;

public class Constantes {
    public static final String URL_LUGARES_GOOGLE = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?";
    public static final String TAG_OBTENER_LUGARES = "obtenergooglelugares";
    public static ArrayList<PruebaModelo> mdataLugar = new ArrayList<>();
    public static ArrayList<PruebaModelo> mselectLugar = new ArrayList<>();
}
