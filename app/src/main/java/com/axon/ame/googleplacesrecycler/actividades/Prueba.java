package com.axon.ame.googleplacesrecycler.actividades;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.axon.ame.googleplacesrecycler.R;
import com.axon.ame.googleplacesrecycler.adaptadores.PruebaAdaptador;
import com.axon.ame.googleplacesrecycler.modelos.PruebaModelo;
import com.axon.ame.googleplacesrecycler.peticiones.Constantes;
import com.axon.ame.googleplacesrecycler.utilidades.MySingleton;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Prueba extends AppCompatActivity {
    public RecyclerView recyclerPrueba;
    public PruebaAdaptador adaptador;
    public RecyclerView.LayoutManager layoutM;

    public EditText btnBuscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba);

        recyclerPrueba = findViewById(R.id.recyclerLugares);
        btnBuscar = findViewById(R.id.btnBuscar);
        construirURL("");
        configurarLista(getApplicationContext(), layoutM, recyclerPrueba, adaptador, Constantes.mdataLugar, Constantes.mselectLugar);
        btnBuscar.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence textBus, int start, int before, int count) {
                final StringBuilder sb = new StringBuilder(textBus.length());
                sb.append(textBus);
                construirURL(sb.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public static void configurarLista(final Context context, RecyclerView.LayoutManager lm, RecyclerView recycler, RecyclerView.Adapter madaptador, final ArrayList<PruebaModelo> dataArray, final ArrayList<PruebaModelo> dataSelect) {
        madaptador = new PruebaAdaptador(context, dataArray, dataSelect, new PruebaAdaptador.OnItemClickListenerLugar() {
            @Override
            public void onItemClickLugar(PruebaModelo modelo, int position) {
                Toast.makeText(context, "LATITUD: " + modelo.getLatitud() + ", LONGITUD: " + modelo.getLongitud(), Toast.LENGTH_SHORT).show();
            }
        });
        recycler.setAdapter(madaptador);
        madaptador.notifyDataSetChanged();
        lm = new LinearLayoutManager(context);
        recycler.setLayoutManager(lm);
        //Log.d(Constantes.TAG_OBTENER_LUGARES, "si configura la lista local");
    }

    public void construirURL(String palabraClave) {
        String URL = Constantes.URL_LUGARES_GOOGLE +
                "location=21.0133587,-89.6125396" +
                "&radius=" + 10000 +
                "&keyword=" + palabraClave +
                "&key=" + getString(R.string.GOOGLE_API_KEY);
        getLugaresWeb(URL);
        Log.d(Constantes.TAG_OBTENER_LUGARES, URL);
    }

    public void getLugaresWeb(String URL) {
        JsonObjectRequest peticion = new JsonObjectRequest(
                Request.Method.GET,
                URL,
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONArray resultados = response.getJSONArray("results");
                            Log.i(Constantes.TAG_OBTENER_LUGARES, "no of results: " + resultados.length());
                            Log.i(Constantes.TAG_OBTENER_LUGARES, "no of results: " + resultados);
                            if (resultados.length() > 0) {
                                for (int i = 0; i < resultados.length(); i++) {
                                    JSONObject googleLugar = resultados.getJSONObject(i);
                                    JSONArray tiposEstab = googleLugar.getJSONArray("types");
                                    PruebaModelo modeloPP = new PruebaModelo(
                                            googleLugar.getString("id"),
                                            googleLugar.getString("name"),
                                            googleLugar.getString("icon"),
                                            tiposEstab.getString(0),
                                            googleLugar.getString("vicinity"),
                                            googleLugar.getJSONObject("geometry").getJSONObject("location").getDouble("lat"),
                                            googleLugar.getJSONObject("geometry").getJSONObject("location").getDouble("lng"));
                                    Constantes.mdataLugar.add(modeloPP);
                                    Log.e(Constantes.TAG_OBTENER_LUGARES, "Tipo Lugar: " + tiposEstab.getString(0));
                                    configurarLista(getApplicationContext(), layoutM, recyclerPrueba, adaptador, Constantes.mdataLugar, Constantes.mselectLugar);
                                }
                                if (Constantes.mdataLugar != null) {
                                    Constantes.mdataLugar.clear();
                                    for (int i = 0; i < resultados.length(); i++) {
                                        JSONObject googleLugar = resultados.getJSONObject(i);
                                        JSONArray tiposEstab = googleLugar.getJSONArray("types");
                                        PruebaModelo modeloPP = new PruebaModelo(
                                                googleLugar.getString("id"),
                                                googleLugar.getString("name"),
                                                googleLugar.getString("icon"),
                                                tiposEstab.getString(0),
                                                googleLugar.getString("vicinity"),
                                                googleLugar.getJSONObject("geometry").getJSONObject("location").getDouble("lat"),
                                                googleLugar.getJSONObject("geometry").getJSONObject("location").getDouble("lng"));
                                        Constantes.mdataLugar.add(modeloPP);
                                        Log.e(Constantes.TAG_OBTENER_LUGARES, "Tipo Lugar: " + tiposEstab.getString(0));
                                        configurarLista(getApplicationContext(), layoutM, recyclerPrueba, adaptador, Constantes.mdataLugar, Constantes.mselectLugar);
                                    }
                                }
                                Log.i(Constantes.TAG_OBTENER_LUGARES, "Datos get: " + Constantes.mdataLugar);
                            }
                        } catch (JSONException e) {
                            Log.e(Constantes.TAG_OBTENER_LUGARES, "Error occurred while getting places", e);
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.i(Constantes.TAG_OBTENER_LUGARES, "Error " + error);
                Toast.makeText(getApplicationContext(), "No hay conexión=", Toast.LENGTH_SHORT).show();
            }
        });
        MySingleton.getInstance(getApplicationContext()).agregarAlaRequestQueue(peticion);
    }
}
