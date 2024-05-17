package edu.italo.segundasemana.Metodos;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;


    public void aumentarVolume(){
        volume++;
    }
    
    public void diminuirVolume(){
        volume--;
    }
    
    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
    public void trocarCanalCima(){
        canal++;
    }
    public void trocarCanalBaixo(){
        canal--;
    }
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
}
