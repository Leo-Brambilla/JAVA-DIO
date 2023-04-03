package edu.leo.operadores;

public class OperadoresSete {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As 2 condições são verdadeiras");
        }
        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
        if(condicao1 && ( 7 > 3)){
            System.out.println("Uma das condições é verdadeira");
        }

        System.out.println("Fim ");
    }
}
