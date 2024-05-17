package edu.italo.segundasemana.Metodos;

public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);


        smartTv.mudarCanal(13);
        System.out.println("Canal Atual? " + smartTv.canal);

        smartTv.ligar ();
        System.out.println("Novo Status --> TV Ligada? " + smartTv.ligada);

        smartTv.desligar ();
        System.out.println("Novo Status --> TV Ligada? " + smartTv.ligada);
        
        smartTv.aumentarVolume ();
        System.out.println("Novo Status --> Volume Alterado Para? " + smartTv.volume);

        smartTv.diminuirVolume ();
        System.out.println("Novo Status --> Volume Alterado Para? " + smartTv.volume);

        smartTv.trocarCanalCima ();
        System.out.println("Novo Status --> Novo Canal é? " + smartTv.canal);
        
        smartTv.trocarCanalBaixo ();
        System.out.println("Novo Status --> Novo Canal é? " + smartTv.canal);
    
    
    }
}
