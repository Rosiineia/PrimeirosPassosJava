package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();//variavel de referencia tipo "estudante" para cirar o
        // objeto precisamos do newe o nome do objeto que quer criar
        estudante.nome = "Ana Maria";
        estudante.idade = 25;
        estudante.sexo = 'F';

        System.out.println("Nome completo: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo: " + estudante.sexo);
    }
}
