package academy.devdojo.maratonajava.javacore.Bintroducaometodos.Test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        Estudante estudante03 = new Estudante();



        estudante01.nome = "Maria Clara";
        estudante01.idade = 19;
        estudante01.sexo = 'F';

        estudante02.nome = " Paulo";
        estudante02.idade = 12;
        estudante02.sexo = 'M';

        estudante03.nome = " Marta";
        estudante03.idade = 18;
        estudante03.sexo = 'F';


    }
}
