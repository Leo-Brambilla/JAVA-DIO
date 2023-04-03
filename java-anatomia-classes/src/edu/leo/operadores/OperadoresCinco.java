package edu.leo.operadores;

public class OperadoresCinco {

    public static void main(String[] args) {
        int a, b;
        a = 3;
        b = 5;

        String resultado = "";
        if (a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado);

        int c, d;

        c = 9;
        d = 9;

        String total = c == d ? "verdadeiro" : "falso";

        System.out.println(total);
    }

}
