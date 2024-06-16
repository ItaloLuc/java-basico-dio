package edu.italo.terceirasemana.Debbuging;

import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Italo", "Carla", "Pedro"};

        double media = calculaMediaDaTurma(alunos, scan);

        System.out.printf("Média da turma %f", media);
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner){

        int soma = 0;
        for(String aluno : alunos){
            System.out.printf("Nota do aluno %s: ", aluno);
            int nota = scanner.nextInt();
            soma += nota;
        }

        return (double) soma / alunos.length;
    }

}

