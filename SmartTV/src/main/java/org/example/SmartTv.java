package org.example;

public class SmartTv {
    boolean ligada = true;
    int canal = 1;
    int volume = 10;

    public void mudarCanal(int novoCanal){
        canal =  novoCanal;
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando o canal para: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuindo o canal para: " + canal);
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);

    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar(boolean ligaDesliga){

        ligada = ligaDesliga;
    }

    public void desligar(){

        ligada = true;
    }
}
