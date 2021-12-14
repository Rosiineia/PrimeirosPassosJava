package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carros;

public class CarrosTest01 {
    public static void main(String[] args) {


        Carros carros = new Carros();
        Carros carros1 = new Carros();

        carros.nome = "Fusca";
        carros.modelo = "Fusca 01";
        carros.ano = 1950;

        carros1.nome = "Sport";
        carros1.modelo = "Sport 01";
        carros1.ano = 1980;

        System.out.println( "Nome do carro: " + carros.nome + " Modelo: " +carros.modelo+ " Ano " + carros.ano);
        System.out.println("===============================");
        System.out.println("Nome do carro: " + carros1.nome + " Modelo: " +carros1.modelo+ " Ano " + carros1.ano);

    }

}
