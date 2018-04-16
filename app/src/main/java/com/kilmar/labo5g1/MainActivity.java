package com.kilmar.labo5g1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Planeta> planetaList;
    RecyclerView recyclerView;
    PlanetAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        planetaList = fillList();

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        adapter = new PlanetAdapter(this,planetaList);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);


    }

    private ArrayList<Planeta> fillList(){
        ArrayList<Planeta> l = new ArrayList<>();
        String desc= " Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin vitae enim tristique, auctor nunc a, porta lorem. Aliquam egestas ullamcorper imperdiet. Praesent quis elit tristique, mollis est id, venenatis lectus. Cras eu maximus dolor, non tempor leo. Etiam cursus sapien sit amet eros cursus porttitor. Fusce diam nibh, tincidunt a lectus non, elementum viverra nisl. Nulla venenatis neque nec risus convallis maximus. Mauris vel enim eu mauris blandit maximus.\n" +
                "\n" +
                "Vivamus sed ex interdum, condimentum ligula sed, hendrerit tellus. Integer eu vehicula diam. Donec tempus nibh lectus, nec interdum risus suscipit in. Vestibulum dignissim imperdiet lorem, a maximus arcu maximus a. Quisque vel elementum ipsum. Phasellus rutrum ut elit pulvinar aliquam. Praesent sagittis elit a tortor bibendum, sodales pellentesque tortor sollicitudin. Nam posuere volutpat dolor vitae vehicula. Nulla commodo augue mi, vitae accumsan enim ullamcorper a. Integer vitae bibendum libero, ac fermentum eros. Vivamus consectetur orci nisi, rhoncus aliquet odio viverra sed. Maecenas efficitur rutrum aliquet. Vivamus sed risus blandit, pharetra justo placerat, cursus orci. Vivamus sit amet vestibulum diam. Vivamus vel fermentum neque. ";
        l.add(new Planeta(1,"una nueva ella",desc));
        l.add(new Planeta(2,"ella contraataca",desc));
        l.add(new Planeta(3,"El retorno de ella",desc));

        return l;

    }

}
