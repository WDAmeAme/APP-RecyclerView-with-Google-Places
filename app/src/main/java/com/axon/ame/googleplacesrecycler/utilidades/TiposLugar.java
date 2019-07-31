package com.axon.ame.googleplacesrecycler.utilidades;

import android.widget.ImageView;

import com.axon.ame.googleplacesrecycler.R;
import com.axon.ame.googleplacesrecycler.modelos.PruebaModelo;

public class TiposLugar {
    private PruebaModelo modelo;
    private ImageView mImg;

    public TiposLugar(PruebaModelo modelo, ImageView mImg) {
        this.modelo = modelo;
        this.mImg = mImg;

        switch (modelo.getTipoLugar()) {
            case "accounting":
                mImg.setImageResource(R.drawable.ic_contador);
                break;
            case "airport":
                mImg.setImageResource(R.drawable.ic_aeropuerto);
                break;
            case "amusement_park":
                mImg.setImageResource(R.drawable.ic_punto_interes);
                break;
            case "aquarium":
                mImg.setImageResource(R.drawable.ic_acuario);
                break;
            case "art_gallery":
                mImg.setImageResource(R.drawable.ic_galeria);
                break;
            case "atm":
                mImg.setImageResource(R.drawable.ic_atm);
                break;
            case "bakery":
                mImg.setImageResource(R.drawable.ic_pastel);
                break;
            case "bank":
                mImg.setImageResource(R.drawable.ic_banco);
                break;
            case "bar":
                mImg.setImageResource(R.drawable.ic_bar);
                break;
            case "beauty_salon":
                mImg.setImageResource(R.drawable.ic_spa);
                break;
            case "bicycle_store":
                mImg.setImageResource(R.drawable.ic_compra);
                break;
            case "book_store":
                mImg.setImageResource(R.drawable.ic_compra);
                break;
            case "bowling_alley":
                mImg.setImageResource(R.drawable.ic_boliche);
                break;
            case "bus_station":
                mImg.setImageResource(R.drawable.ic_autobus);
                break;
            case "cafe":
                mImg.setImageResource(R.drawable.ic_cafe);
                break;
            case "campground":
                mImg.setImageResource(R.drawable.ic_campo);
                break;
            case "car_dealer":
                mImg.setImageResource(R.drawable.ic_auto);
                break;
            case "car_rental":
                mImg.setImageResource(R.drawable.ic_auto);
                break;
            case "car_repair":
                mImg.setImageResource(R.drawable.ic_auto);
                break;
            case "car_wash":
                mImg.setImageResource(R.drawable.ic_auto);
                break;
            case "casino":
                mImg.setImageResource(R.drawable.ic_dinero);
                break;
            case "cemetery":
                mImg.setImageResource(R.drawable.ic_cementerio);
                break;
            case "church":
                mImg.setImageResource(R.drawable.ic_iglesia);
                break;
            case "city_hall":
                mImg.setImageResource(R.drawable.ic_dependencia);
                break;
            case "clothing_store":
                mImg.setImageResource(R.drawable.ic_tienda);
                break;
            case "convenience_store":
                mImg.setImageResource(R.drawable.ic_tienda);
                break;
            case "courthouse":
                mImg.setImageResource(R.drawable.ic_dependencia);
                break;
            case "dentist":
                mImg.setImageResource(R.drawable.ic_hospital);
                break;
            case "department_store":
                mImg.setImageResource(R.drawable.ic_tienda);
                break;
            case "doctor":
                mImg.setImageResource(R.drawable.ic_hospital);
                break;
            case "electrician":
                mImg.setImageResource(R.drawable.ic_electricidad);
                break;
            case "electronics_store":
                mImg.setImageResource(R.drawable.ic_tienda);
                break;
            case "embassy":
                mImg.setImageResource(R.drawable.ic_dependencia);
                break;
            case "fire_station":
                mImg.setImageResource(R.drawable.ic_bomberos);
                break;
            case "finance":
                mImg.setImageResource(R.drawable.ic_dependencia);
                break;
            case "florist":
                mImg.setImageResource(R.drawable.ic_flor);
                break;
            case "funeral_home":
                mImg.setImageResource(R.drawable.ic_cementerio);
                break;
            case "furniture_store":
                mImg.setImageResource(R.drawable.ic_tienda);
                break;
            case "gas_station":
                mImg.setImageResource(R.drawable.ic_gasolinera);
                break;
            case "gym":
                mImg.setImageResource(R.drawable.ic_gimnasio);
                break;
            case "hair_care":
                mImg.setImageResource(R.drawable.ic_spa);
                break;
            case "hardware_store":
                mImg.setImageResource(R.drawable.ic_tienda);
                break;
            case "hindu_temple":
                mImg.setImageResource(R.drawable.ic_iglesia);
                break;
            case "home_goods_store":
                mImg.setImageResource(R.drawable.ic_tienda);
                break;
            case "hospital":
                mImg.setImageResource(R.drawable.ic_hospital);
                break;
            case "insurance_agency":
                mImg.setImageResource(R.drawable.ic_contador);
                break;
            case "jewelry_store":
                mImg.setImageResource(R.drawable.ic_diamante);
                break;
            case "laundry":
                mImg.setImageResource(R.drawable.ic_lavanderia);
                break;
            case "lawyer":
                mImg.setImageResource(R.drawable.ic_dependencia);
                break;
            case "library":
                mImg.setImageResource(R.drawable.ic_libro);
                break;
            case "liquor_store":
                mImg.setImageResource(R.drawable.ic_compra);
                break;
            case "local_government_office":
                mImg.setImageResource(R.drawable.ic_dependencia);
                break;
            case "locality":
                mImg.setImageResource(R.drawable.ic_ubicacion);
                break;
            case "locksmith":
                mImg.setImageResource(R.drawable.ic_llave);
                break;
            case "lodging":
                mImg.setImageResource(R.drawable.ic_hotel);
                break;
            case "meal_delivery":
                mImg.setImageResource(R.drawable.ic_tienda);
                break;
            case "meal_takeaway":
                mImg.setImageResource(R.drawable.ic_tienda);
                break;
            case "mosque":
                mImg.setImageResource(R.drawable.ic_iglesia);
                break;
            case "movie_rental":
                mImg.setImageResource(R.drawable.ic_cine);
                break;
            case "movie_theater":
                mImg.setImageResource(R.drawable.ic_cine);
                break;
            case "moving_company":
                mImg.setImageResource(R.drawable.ic_cine);
                break;
            case "museum":
                mImg.setImageResource(R.drawable.ic_dependencia);
                break;
            case "night_club":
                mImg.setImageResource(R.drawable.ic_bar);
                break;
            case "painter":
                mImg.setImageResource(R.drawable.ic_galeria);
                break;
            case "park":
                mImg.setImageResource(R.drawable.ic_campo);
                break;
            case "parking":
                mImg.setImageResource(R.drawable.ic_auto);
                break;
            case "pet_store":
                mImg.setImageResource(R.drawable.ic_animal);
                break;
            case "pharmacy":
                mImg.setImageResource(R.drawable.ic_hospital);
                break;
            case "physiotherapist":
                mImg.setImageResource(R.drawable.ic_hospital);
                break;
            case "plumber":
                mImg.setImageResource(R.drawable.ic_hotel);
                break;
            case "point_of_interest":
                mImg.setImageResource(R.drawable.ic_punto_interes);
                break;
            case "police":
                mImg.setImageResource(R.drawable.ic_policia);
                break;
            case "post_office":
                mImg.setImageResource(R.drawable.ic_dependencia);
                break;
            case "real_estate_agency":
                mImg.setImageResource(R.drawable.ic_dependencia);
                break;
            case "restaurant":
                mImg.setImageResource(R.drawable.ic_restaurante);
                break;
            case "roofing_contractor":
                mImg.setImageResource(R.drawable.ic_construccion);
                break;
            case "route":
                mImg.setImageResource(R.drawable.ic_ubicacion);
                break;
            case "rv_park":
                mImg.setImageResource(R.drawable.ic_campo);
                break;
            case "school":
                mImg.setImageResource(R.drawable.ic_dependencia);
                break;
            case "shoe_store":
                mImg.setImageResource(R.drawable.ic_tienda);
                break;
            case "shopping_mall":
                mImg.setImageResource(R.drawable.ic_tienda);
                break;
            case "spa":
                mImg.setImageResource(R.drawable.ic_spa);
                break;
            case "stadium":
                mImg.setImageResource(R.drawable.ic_estadio);
                break;
            case "storage":
                mImg.setImageResource(R.drawable.ic_almacenamiento);
                break;
            case "store":
                mImg.setImageResource(R.drawable.ic_tienda);
                break;
            case "sublocality_level_1":
                mImg.setImageResource(R.drawable.ic_ubicacion);
                break;
            case "subway_station":
                mImg.setImageResource(R.drawable.ic_tren);
                break;
            case "supermarket":
                mImg.setImageResource(R.drawable.ic_tienda);
                break;
            case "synagogue":
                mImg.setImageResource(R.drawable.ic_iglesia);
                break;
            case "taxi_stand":
                mImg.setImageResource(R.drawable.ic_spa);
                break;
            case "train_station":
                mImg.setImageResource(R.drawable.ic_tren);
                break;
            case "transit_station":
                mImg.setImageResource(R.drawable.ic_alto);
                break;
            case "travel_agency":
                mImg.setImageResource(R.drawable.ic_hotel);
                break;
            case "veterinary_care":
                mImg.setImageResource(R.drawable.ic_animal);
                break;
            case "zoo":
                mImg.setImageResource(R.drawable.ic_animal);
                break;
        }
    }
}
