package edu.leo.operadores;

public class OperadoresSeis {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 3;

        String nome1 = "Leo";
        String nome2 = new String("Leo");

        System.out.println(nome1 == nome2);
        System.out.println(nome1.equals(nome2));

        boolean simNao = numero1 == numero2;
        System.out.println("Numero 1 é igual a numero 2? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("Numero 1 é diferente de numero 2? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("Numero 1 é maior que numero 2? " + simNao);
        
        simNao = numero1 < numero2;
        System.out.println("Numero 1 é menor que numero 2? " + simNao);



    }
}
