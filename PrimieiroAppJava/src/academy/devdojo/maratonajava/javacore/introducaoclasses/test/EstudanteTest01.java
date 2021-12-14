package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Estudante;
import jdk.swing.interop.SwingInterOpUtils;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Ana" ;
        estudante.idade=25;
        estudante.sexo = 'F';

        System.out.println("Meu nome é: " + estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
