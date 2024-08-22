package edu.curso.model;

public class Cachorro {

     public String nome;
     public String raca;

    public void dormir(){
        System.out.println("O Cachorro " + this.nome + " está dormindo...");
    }

    public void morder(){
        System.out.println("O Cachorro " + this.nome + " está mordendo ....");
    }

    public void latir(){
        System.out.printf("O Cachorro %s está latindo Au au%n", nome);
    }

}
