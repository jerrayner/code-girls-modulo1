package br.com.dio;

public class TiposDeDados {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        // short s2 = 4000000; * Valor muito grande para ser declarado como short;

        // int i1 = -1000000000000; * * Valor muito grande para ser declarado como int;
        int i2 = 20500;

        long l1 = 1000000000000000004l;
        // long l2 = 20400500050001500000; * Valores do tipo long devem terminar com a letra 'l' no final;

        // float f1 = 4.5; * Quando não se coloca o f no final de um número float, ele é interpretado como tipo double, então vai dar erro porque ele não cabe dentro do float;
        float f2 = 10.60f;

        double d1 = 85.69;
        double d2 = 99.040;

        char c1 = 'w';
        // char c2 = 'fn'; * Char somente armazena um caracter, gerando erro de compilação caso tente atribuir 2 caracteres;
        char c3 = '\u0057'; // Código unicode que representa o caractere 'w';

        String st1 = "Fulano";
        String st2 = "Ciclano;";
        String st3 = "08/07/2022";

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(l1);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);
    }
}
