public class Main {

    public static void main(String[] args) {
	System.out.println("Primeira Linha para o app");//comentario
    System.out.println("Segunda  Linha para o app");
    System.out.println("terceira Linha para o app");

    double value1 =100.0d;
    double value2 = 50.0d;
    double result = 0.0d;
    char opCode = 's';

    if(opCode == 'a')
        result = value1 + value2;
    else if( opCode == 's')
        result = value1 - value2;
    else if (opCode == 'm')
        result = value1 * value2;
    else if( opCode == 'd')
        result = value1 / value2;
    System.out.println(result);

    







    }
}
