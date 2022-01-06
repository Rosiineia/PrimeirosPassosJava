package academy.devdojo.maratonajava.javacore.Bintroducaometodos.Test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import jdk.swing.interop.SwingInterOpUtils;

public class EstudanteTest01 {
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

        System.out.println("Nome: " + estudante01.nome);
        System.out.println("Idade: " + estudante01.idade + " anos");
        System.out.println("Sexo: " + estudante01.sexo);

        System.out.println("______________________________");

        System.out.println("Nome: " + estudante02.nome);
        System.out.println("Idade: " + estudante02.idade);
        System.out.println("Sexo: " + estudante02.sexo);
        System.out.println("________________________________");

        System.out.println("Nome: " + estudante03.nome);
        System.out.println("Idade: " + estudante03.idade + " anos");
        System.out.println("Sexo: " + estudante03.sexo);



    }
}
