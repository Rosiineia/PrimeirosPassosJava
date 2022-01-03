package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void  somaDoisNumeros(){
        System.out.println(10+10);

    }
    public void subtraiDoisNumeros(){
        System.out.println(20 - 10);
    }
    public void  multiplicaDoisNumeros(int num, int num2){
        System.out.println(num * num2);

    }
    public  void MultiplicaVariosNumeros(int n1, int n2, int n3, int n4){
        System.out.println(n1 * n2);
        System.out.println(n1 * n3);
        System.out.println(n1 * n4);
        System.out.println(n1 * n1);
    }
    public double divideDoisNumeros(double n1, double n2){
        return n1/n2;

    }

}
