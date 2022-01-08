package academy.devdojo.maratonajava.javacore.Bintroducaometodos.Test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome= "Angela";
        funcionario.idade= 25;
        funcionario.salario= new double[]{1.500,2.700,6.800};

        funcionario.imprime();
        funcionario.imprimeMediaSalarial();


    }
}
