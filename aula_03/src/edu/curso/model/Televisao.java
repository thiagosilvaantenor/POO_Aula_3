package model;

public class Televisao {
    private String controle;
    private boolean estado;
    private String canal;
    private float polegadas;
    private Double peso;

    public void ligar(){
        this.estado = true;
        System.out.println("A televisão foi ligada!");
    }

    public void mudarCanal(String canal){
        if(estado){
            this.canal = canal;
            System.out.println("A televisão está no canal " + canal);
        } else {
            System.out.println("A televisão precisa estar ligada para mudar de canal!");
        }
    }

    public void polegadas(float polegadas){
        System.out.println("A televisão tem " + polegadas);
    }

}
