package edu.curso.model;

public class Videogame {
    private String marca;
    private String nome;
    private int qntMemoria = 800;
    private String[] jogos = new String[10];
    private String tempoGarantia;

    public void ligar() {
        System.out.println("Ligando " + nome);
    }

    public void baixarJogo(String nomeJogo){
        for(int i = 0; i < jogos.length; i++){
            if(jogos[i] == null){
                jogos[i] = nomeJogo;
                this.qntMemoria -= 100;

            }
        }
    }
}
