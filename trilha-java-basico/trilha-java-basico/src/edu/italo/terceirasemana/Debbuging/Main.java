package terceirasemana.Debbuging;

public class Main {
    public static void main(String[] args){
        System.out.println("Iniciou o programa no método main.");
        a();
        System.out.println("Finaliziou o programa no método main.");

    }

    static void a(){
        System.out.println("Entrou no método a.");
        b();
        System.out.println("Saiu do método a.");
    }

    static void b(){
        System.out.println("Entrou no método b.");
        for(int i = 0; i <= 4; i++) System.out.println(i);
        c();
        System.out.println("Saiu do método b.");
    }

    static void c(){
        System.out.println("Entrou no método C.");
        Thread.dumpStack();
        System.out.println("Saiu do método c.");
    }





}
