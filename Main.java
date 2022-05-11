/*
Crie um programa que pode receber no mínimo dois números
(parâmetros) para efetuar uma soma e no máximo 4 números,
utilize os construtores para fazer esse exercício;
 */

public class Main {
    public static void main(String[] args) {
        Calculo calculo = new Calculo(1.0,2.0);
        Calculo calculo2 = new Calculo(1.0,2.0,3.0);
        Calculo calculo3 = new Calculo(1.0,2.0,3.0,4.0);
        
        System.out.println(calculo.Soma());
        System.out.println("\n\n");
        System.out.println(calculo2.Soma());
        System.out.println("\n\n");
        System.out.println(calculo3.Soma());
    }
}
