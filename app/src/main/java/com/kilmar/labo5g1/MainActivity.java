package com.kilmar.labo5g1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public RecyclerView recyclerView;
    public PlanetAdapter adapter;
    public Listas lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Planeta> planetaList;
        lista = new Listas();
        System.out.println("se crea");
        planetaList = lista.getPlanetaList();

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        adapter = new PlanetAdapter(this,planetaList);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);


    }

    public void cambiarVista1(View view){
        List<Planeta> planetaList;
        try {
            if (lista.getListAUX() == null){
                System.out.println("llega nulo");
            }
            System.out.println("lista "+lista.getListAUX().get(0).getIdPlaneta());
        }
        catch (IndexOutOfBoundsException e){
                e.getCause();
        }

        planetaList = lista.getListAUX();
        System.out.println("vista 1");

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        adapter = new PlanetAdapter(this,planetaList);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }



    public void cambiarVista2(View view){
        List<Planeta> planetaList;
        lista.setListAUX(adapter.getPlanetaList());
        System.out.println("jusdo despues de setear: "+lista.getListAUX().get(0).getInformacion());
        planetaList = fillList2();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        adapter = new PlanetAdapter(this,planetaList);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);

    }

    public ArrayList<Planeta> fillList2(){
        ArrayList<Planeta> l = (ArrayList<Planeta>) adapter.getPlanetaList();
        System.out.println("la lista temporal recoje: "+l.get(0).getIdPlaneta());
        int i=0;
        System.out.println("size es: "+l.size());

        for (i=0;i<l.size();i++){
            System.out.println("paso "+i);
            if (!l.get(i).isFavorito()){
                l.remove(i);
                i--;
            }
        }

        return l;

    }



}
