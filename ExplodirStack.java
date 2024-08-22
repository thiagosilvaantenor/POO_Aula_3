package edu.curso.controller;

public class ExplodirStack {
    public static int contador = 1;
    public static void main(String[] args) {
        //MemoriaHeap = instancias
        //MemoriaStack = chamadas de funções

        //exemplo de estouro de Memoria Stack:
        //System.out.printf("Executando o main: %d%n", contador++);
        //System.out.println("Você quis dizer: recursividade");
        //main(args);
        
        //Exemplo de Var-args
        teste(200.0,100.0,500.0,200.0);
        
    }
    //Em uma função o maximo de parametros é 2
    //Usar var-args caso necessite de +2 parametros
    public static void teste(double ...val){
        double soma = 0;
        for (double d : val) {
            double v = d;
            soma += v;
        }
    }
}
