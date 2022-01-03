package academy.devdojo.maratonajava.javacore.Bintroducaometodos.Test;


import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.multiplicaDoisNumeros(10,20);
        System.out.println("Finalizar multiplicação");
        System.out.println("__________________________________");
        calculadora.MultiplicaVariosNumeros(2,6,8,1);
        System.out.println("Finaliza Diversas Multiplicações");
    }

}
