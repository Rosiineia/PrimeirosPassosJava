import javax.swing.*;
import java.net.SocketOption;

public class Operadores {
    public static void main(String [] args){
       int numero1 =10;
       int numero2 =20;
       int soma = numero1+numero2;
        /*se usar o operador + antes de um a string ele vai concatenar e não realizar a soma, se quiser
        fazer a operação usanso a soma e a string basca acrescentar o parentese.
         Ex: System.out.println( "A soma é:" + numero1+numero2)*/

      System.out.println( "A soma é:" + soma);
      /*Operador resto da divisão*/

        int numeroInteiro =20;
        long numerolong = 200000L;

        double numeroDouble = 10d;
        float numeroFloat = (float) numeroDouble;
        System.out.println("Resto da divisão é: " + (22%2));/* Assim podemos descobrir se o numero é par ou impar*/
         System.out.print(numeroDouble);

                     /* +	operador de adição
                        -	operador subtração
                        *	operador de multiplicação
                        /	operador de divisão
                        %	operador de módulo (ou resto da divisão)*/

    }


}
