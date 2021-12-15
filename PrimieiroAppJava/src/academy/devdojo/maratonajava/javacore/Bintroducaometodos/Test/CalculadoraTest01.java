package academy.devdojo.maratonajava.javacore.Bintroducaometodos.Test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calcular = new Calculadora();
        calcular.somaDoisNumeros();
        System.out.println("Finalizando soma");

        calcular.subtraiDoisNumeros();

    }
}
