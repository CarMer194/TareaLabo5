package com.kilmar.labo5g1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Carlos on 22/4/2018.
 */

public class Listas {
    List<Planeta> planetaList;
    List<Planeta> listAUX;
    boolean favorito;

    public Listas() {
        planetaList = fillList();
        listAUX = fillList();

    }

    public ArrayList<Planeta> fillList(){
        ArrayList<Planeta> l = new ArrayList<>();
        String desc= " Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin vitae enim tristique, auctor nunc a, porta lorem. Aliquam egestas ullamcorper imperdiet. Praesent quis elit tristique, mollis est id, venenatis lectus. Cras eu maximus dolor, non tempor leo. Etiam cursus sapien sit amet eros cursus porttitor. Fusce diam nibh, tincidunt a lectus non, elementum viverra nisl. Nulla venenatis neque nec risus convallis maximus. Mauris vel enim eu mauris blandit maximus.\n" +
                "\n" +
                "Vivamus sed ex interdum, condimentum ligula sed, hendrerit tellus. Integer eu vehicula diam. Donec tempus nibh lectus, nec interdum risus suscipit in. Vestibulum dignissim imperdiet lorem, a maximus arcu maximus a. Quisque vel elementum ipsum. Phasellus rutrum ut elit pulvinar aliquam. Praesent sagittis elit a tortor bibendum, sodales pellentesque tortor sollicitudin. Nam posuere volutpat dolor vitae vehicula. Nulla commodo augue mi, vitae accumsan enim ullamcorper a. Integer vitae bibendum libero, ac fermentum eros. Vivamus consectetur orci nisi, rhoncus aliquet odio viverra sed. Maecenas efficitur rutrum aliquet. Vivamus sed risus blandit, pharetra justo placerat, cursus orci. Vivamus sit amet vestibulum diam. Vivamus vel fermentum neque. ";
        l.add(new Planeta(1,"una pelicula",desc));
        l.add(new Planeta(2,"otra pelicula",desc));
        l.add(new Planeta(3,"otra otra pelicula",desc));

        return l;
    }

    public List<Planeta> getPlanetaList() {
        return planetaList;
    }

    public void setPlanetaList(List<Planeta> planetaList) {
        this.planetaList = planetaList;
    }

    public List<Planeta> getListAUX() {
        return listAUX;
    }

    public void setListAUX(List<Planeta> listAUX) {
        System.out.println("se seteo");
        this.listAUX = listAUX;
        System.out.println("info de aux: "+this.listAUX.get(0).getIdPlaneta());
    }

    public void capturarFavsAux(){
        for (int i=0; i<planetaList.size();i++){
            if (planetaList.get(i).isFavorito()){
                listAUX.get(i).setFavorito(true);
            }
            else {
                listAUX.get(i).setFavorito(false);
            }
        }
    }

    public void reconstruirLista(){
        planetaList = fillList();
        for (int i=0;i<listAUX.size();i++){
            if (listAUX.get(i).isFavorito()){
                planetaList.get(i).setFavorito(true);
            }
            else{
                planetaList.get(i).setFavorito(false);
            }
        }
    }

}
