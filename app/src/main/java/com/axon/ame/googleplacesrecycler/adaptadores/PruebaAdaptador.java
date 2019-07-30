package com.axon.ame.googleplacesrecycler.adaptadores;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.axon.ame.googleplacesrecycler.R;
import com.axon.ame.googleplacesrecycler.modelos.PruebaModelo;
import com.axon.ame.googleplacesrecycler.utilidades.TiposLugar;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class PruebaAdaptador extends RecyclerView.Adapter<PruebaAdaptador.ViewHolderPrueba> {
    private Context mContext;
    private ArrayList<PruebaModelo> mArrayData;
    private ArrayList<PruebaModelo> mArraySelect;
    private OnItemClickListenerLugar mListener;
    private RequestOptions opcionesImg;

    public PruebaAdaptador(Context mContext, ArrayList<PruebaModelo> mArrayData, ArrayList<PruebaModelo> mArraySelect, OnItemClickListenerLugar mListener) {
        this.mContext = mContext;
        this.mArrayData = mArrayData;
        this.mArraySelect = mArraySelect;
        this.mListener = mListener;
        this.opcionesImg = new RequestOptions()
                .centerCrop()
                .placeholder(R.color.colorAccent)
                .error(R.color.colorAccent);
    }

    @NonNull
    @Override
    public ViewHolderPrueba onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista = LayoutInflater.from(mContext).inflate(R.layout.item_lugar, viewGroup, false);
        return new ViewHolderPrueba(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPrueba viewHolderPrueba, int position) {
        viewHolderPrueba.bind(mArrayData.get(position), mListener);
    }

    @Override
    public int getItemCount() {
        return mArrayData.size();
    }

    class ViewHolderPrueba extends RecyclerView.ViewHolder {
        ImageView mImg;
        TextView mNombre;
        TextView mDomicilio;

        ViewHolderPrueba(@NonNull View itemView) {
            super(itemView);
            mImg = itemView.findViewById(R.id.imgLugar);
            mNombre = itemView.findViewById(R.id.nombreLugar);
            mDomicilio = itemView.findViewById(R.id.domicilioLugar);
        }

        void bind(final PruebaModelo modelo, final OnItemClickListenerLugar listener) {
            //Glide.with(mContext).applyDefaultRequestOptions(opcionesImg).load(modelo.getIcon()).into(this.mImg);
            new TiposLugar(modelo, mImg);
            mNombre.setText(modelo.getNombre());
            mDomicilio.setText(modelo.getDomicilio());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClickLugar(modelo, getAdapterPosition());
                }
            });
        }
    }

    public interface OnItemClickListenerLugar {
        void onItemClickLugar(PruebaModelo modelo, int position);
    }
}
