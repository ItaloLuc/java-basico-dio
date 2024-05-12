package edu.italo.primeirasemana.tiposvariaveis;

public class TiposVariaveis {
    
    public static void main(String [] args) throws Exception{

    //Exemplos tipos de variaveis
        byte idade = 123;
        short ano = 2024;
        int cep = 21070333; //caso comece com zero, talvez seja necessário trocar o tipo
        long cpf = 12312312312L; //caso comece com zero, talvez seja necessário trocar o tipo
        float pi = 3.14F;
        double salario = 1245.33;


    //Exemplo do quão tipado Java é
        short numeroCurto = 1;
        int numeroNormal1 = numeroCurto;
        short numeroCurto2 = numeroNormal1; //Possível solução: short = numeroNormal1;

    //Constantes
        final double SECULO = 2.1; //Por convenção, constantes serão escritas em CAPSLOCK

        SECULO = 22; //Como desclarei que "seculo" seria uma constante (utilizando a palavra reservada "final"), o java não me permite alterar seu valor posteriormente


    }
    
}
