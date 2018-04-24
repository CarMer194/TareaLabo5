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
        //Aqui hay que llenar de nuevo la lista y agarrar los favoritos
        lista.reconstruirLista();
        planetaList = lista.getPlanetaList();
        System.out.println("vista 1");

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        adapter = new PlanetAdapter(this,planetaList);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }



    public void cambiarVista2(View view){
        List<Planeta> listatemp;

        //Aqui tengo que agarrar los favoritos de la otra lista
        lista.capturarFavsAux();
        listatemp = fillList2();
        System.out.println("despues de hacer la vista 2:"+ lista.getListAUX().get(0).getIdPlaneta());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        adapter = new PlanetAdapter(this,listatemp);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);



    }

    public ArrayList<Planeta> fillList2(){
        ArrayList<Planeta> listatemp = (ArrayList<Planeta>) adapter.getPlanetaList();
        int i=0;
        System.out.println("size es: "+listatemp.size());

        for (i=0;i<listatemp.size();i++){
            System.out.println("paso "+i);
            if (!listatemp.get(i).isFavorito()){
                listatemp.remove(i);
                i--;
            }
        }

        return listatemp;

    }



}
