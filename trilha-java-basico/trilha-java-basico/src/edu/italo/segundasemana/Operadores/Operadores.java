package edu.italo.segundasemana.Operadores;

public class Operadores {
    /*Operadores em Java
     == : Igual
     != : Diferente
     <  : Menor
     >  : Maior
     <= : Menor igual
     >= : Maior igual */


    //Operadores de Atribuição
    String nome = "Ítalo";
    int idade = 23;
    double peso = 94.5;
    char sexo = 'M';
    boolean doadorOrgao = false;
   // Date dataNascimento = new Date();


    //Operadores Aritméticos
    int some = 10 + 20;
    double subtração = 114.4 - 45;
    int multiplicação = 3 * 7;
    int divisão = 4 / 2;
    int modulo = 12 % 5;
    double resultado = (10 * 4) + (20/3);

    /*public static void main(String[] args){
    Se o operador de adição "+" for utilizado em variáveis do tipo String, ele realizará a "concatenação dos textos"
    String nomeCompleto = "ITALO " + "LUCIO";
    System.out.println(nomeCompleto);*/
    
    /*Operadores Unários são aplicados juntos à outros operadores aritméticos.
    Eles realizam alguns trabalhos básicos como: incrementar, decrementar, inverter valores númericos e booleanos.
    (+) Operador unário de valor positivo - números são positivos sem esse operador explicitamente.
    (-) Operador unário de valor negativo - nega um número ou expressão aritmética;
    (++) Operador unário de incremento de valor - incrementa o valor em 1 unidade;
    (==) Operador unário de decremento de valor - decrementa o valor em 1 unidade;
    (!) Operador unário lógico de negação - nega o valor de expressão booleana;*/

    /*public static void main(String[] args){
        boolean numero = true;

        System.out.println(! numero);*/
    
    /*Operador Ternário ( ?: ) é uma forma resumida para defini uma condição e escolher por um dentre dois
    valores. Você deve pensar numa condição ternária como se fosse uma condição IF normal, porém, de uma
    forma em que toda a sua estrutura estará escrita numa única linha.*/
    /*public static void main(String[] args){
        int a, b;
        
        a = 6;
        b = 6;

        String resultado = a==b ?"Verdadeiro!" : "Falso!";
        /*if(a==b)
            resultado = "Verdadeiro!";
        else
           resultado = "Falso!";   
        System.out.println(resultado);*/
    
    /*Operadores Relacionais avaliam a relação entre duas variáveis ou expressões.
    Neste caso, mais precisamente, definem se o operando à esquerda é igual, diferente, Menor,
    menor ou igual, maior ou maior ou igual ao da direita, retornando um valor booleano como resultado.
    == Quando desejamos verificar se uma variável é IGUAL A outra.
    ! = Quando desejamos verificar se uma variável é DIFERENTE DA outra.
    > Quando desejamos verificar se uma variável é MAIOR QUE A outra.
    >= "            " "           " "            " MAIOR OU IGUAL A  outra.
    < "             " "           " "            " MENOR QUE A outra.
    <= "            " "           " "            " MENOR OU IGUAL A outra.
    public static void main(String[] args){
        int numero1 = 2;
        int numero2 = 3;

        String resultado = numero1 < numero2 ? "Não!" : "Sim!";
        
        System.out.println("Numero1 é igual a numero2? " + resultado);
    
    Operadores lógicos representam o recurso que nos permite criar expressões lógicas maiores a partir da 
    junção de duas, ou mais expressões (tabela verdade).

    $$ - Operador lógico "E".
    || - Operador lógico "OU".*/
    public static void main(String[] args){
        int a = 2;
        int b = 2;
        int c = 3;
        int d = 3;

        if(a==b && c==d){
            System.out.println("Tá tudo certo!");
        }else{
            System.out.println("Deu ruim!");
        }
    }
}
