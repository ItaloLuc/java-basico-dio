package edu.italo.terceirasemana.ControleDeCandidatos.Candidatura;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        String[] candidatos = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", 
                               "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE"};

        int maxEntrevistas = 5;
        double salarioBase = 2000.0;
        int entrevistasRealizadas = 0;
        
        // Lista para armazenar os nomes dos candidatos selecionados
        ArrayList<String> candidatosSelecionados = new ArrayList<>();
        
        System.out.println("Selecionando candidatos para entrevista:");
        
        for (String candidato : candidatos) {
            double salarioPretendido = valorPretendido();
            
            if (salarioPretendido <= salarioBase && entrevistasRealizadas < maxEntrevistas) {
                System.out.println("Candidato " + candidato + " selecionado para entrevista");
                candidatosSelecionados.add(candidato); // Adiciona o candidato selecionado à lista
                entrevistasRealizadas++;
            }
            
            if (entrevistasRealizadas == maxEntrevistas) {
                break; // Já selecionamos o máximo de candidatos necessários
            }
        }
        
        // Verifica se ainda não foram selecionados o número máximo de entrevistas
        if (entrevistasRealizadas < maxEntrevistas) {
            System.out.println("Ainda há menos de " + maxEntrevistas + " candidatos qualificados para entrevista.");
        }
        
        // Simulação de tentativas de contato com os candidatos selecionados
        for (String candidato : candidatosSelecionados) {
            boolean contatoEstabelecido = simularTentativasDeContato(candidato);
            if (contatoEstabelecido) {
                System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " APÓS **_** TENTATIVA(S)");
            } else {
                System.out.println("NÃO CONSEGUIMOS CONTATO COM O " + candidato);
            }
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static boolean simularTentativasDeContato(String candidato) {
        int tentativasMaximas = 3;
        boolean contatoEstabelecido = false;
        
        for (int tentativa = 1; tentativa <= tentativasMaximas; tentativa++) {
            // Simulação de sucesso de contato (50% de chance)
            if (ThreadLocalRandom.current().nextBoolean()) {
                contatoEstabelecido = true;
                break; // Sai do loop se o contato for estabelecido
            }
        }
        
        return contatoEstabelecido;
    }
}
