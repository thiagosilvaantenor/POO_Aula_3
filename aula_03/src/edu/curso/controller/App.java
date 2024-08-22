package edu.curso.controller;

import edu.curso.model.Cachorro;
import edu.curso.model.Videogame;

public class App {
    private Videogame videogame;
   

    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Totó";
        cachorro1.raca = "Generica";

        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome = "Rex";
        cachorro2.raca = "Pastor Alemão";

        Cachorro cachorro3 = cachorro1;
        cachorro3.nome = "Nevinha";
        cachorro3.raca = "Shiba";

        System.out.println("Cachorro 1: " + cachorro1.nome);
        System.out.println("Cachorro 2: " + cachorro2.nome);
        System.out.println("Cachorro 3: " + cachorro3.nome);

    }
}
