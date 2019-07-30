package com.axon.ame.googleplacesrecycler.utilidades;


import android.annotation.SuppressLint;
import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class MySingleton {
    @SuppressLint("StaticFieldLeak")
    private static MySingleton miInstancia;
    private RequestQueue requestQueue;
    @SuppressLint("StaticFieldLeak")
    private static Context mcontext;

    private MySingleton(Context context) {
        mcontext = context;
        requestQueue = getRequestQueue();
    }

    private RequestQueue getRequestQueue() {
        if (requestQueue == null) {
            requestQueue = Volley.newRequestQueue(mcontext.getApplicationContext());
        }
        return requestQueue;
    }

    public static synchronized MySingleton getInstance(Context context) {
        if (miInstancia == null) {
            miInstancia = new MySingleton(context);
        }
        return miInstancia;
    }

    public <T> void agregarAlaRequestQueue(Request<T> request) {
        getRequestQueue().add(request);
    }
}

