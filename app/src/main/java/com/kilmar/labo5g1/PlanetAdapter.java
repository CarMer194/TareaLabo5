package com.kilmar.labo5g1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by uca on 04-16-18.
 */

public class PlanetAdapter extends RecyclerView.Adapter<PlanetAdapter.PlanetViewHolder>{
    Context mCtx;
    List<Planeta> planetaList;

    public PlanetAdapter(Context mCtx, List<Planeta> planetaList) {
        this.mCtx = mCtx;
        this.planetaList = planetaList;
        System.out.println("Se seteo planetadapter");
    }

    @Override
    public PlanetAdapter.PlanetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(mCtx);
        View v= inflater.inflate(R.layout.cuadroinfo,null);


        return new PlanetViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PlanetViewHolder holder, final int position) {
        holder.titleTxtView.setText(planetaList.get(position).getNombrePlaneta());
        holder.sndTxtView.setText(planetaList.get(position).getInformacion());
        holder.b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("clic en: "+ position);
                planetaList.get(position).setFavorito();
            }
        });
    }



    @Override
    public int getItemCount() {
        return planetaList.size();
    }

    public List<Planeta> getPlanetaList() {
        return planetaList;
    }

    protected class PlanetViewHolder extends RecyclerView.ViewHolder{
        TextView titleTxtView, sndTxtView;
        ImageView img;
        Button b;

        public PlanetViewHolder(View view){
            super(view);

            titleTxtView = view.findViewById(R.id.texto);
            sndTxtView = view.findViewById(R.id.texto2);
            img=view.findViewById(R.id.imagen);
            b= view.findViewById(R.id.botonfav);

        }


    }
}
