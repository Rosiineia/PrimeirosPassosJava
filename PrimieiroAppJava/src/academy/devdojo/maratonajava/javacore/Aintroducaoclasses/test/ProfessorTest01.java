package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.nome = "Marta";
        professor.idade = 56;
        professor.sexo = 'F';

        System.out.println("Nome do docente: " + professor.nome);
        System.out.println("Idade do docente: " + professor.idade);
        System.out.println("Genero do docente: " + professor.sexo);

        System.out.println("A docente " + professor.nome + " Tem " + professor.idade + " e é do sexo " + professor.sexo);


    }
}
