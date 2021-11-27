import java.util.function.BinaryOperator;

public class ControleFluxo1 {
    public static void main(String[] args) {
        /*IF: Dentro do parentese precisa de um valor bolaeno(true ou false);
         * se dentro do parentese  instrução for TRUE sempre retornara o IF.  */

        //idade< 15 Categoria infantil
        //idade>=15 && idade <18 juvenil
        //idade >= 18 adulto

       /* int idade = 17;


        if (idade <15) {
            System.out.println("Categoria infantil ");
        } else if (idade >=15 && idade >18 ){
            System.out.println("Categoria Juvenil");
        }else{
            System.out.println("Categoria adulto");

        };*/
        int idade = 11;
        String categoria;


        if (idade <15) {
            categoria= "Categoria infantil";
        } else if (idade >=15 && idade <18 ){
            categoria= "Categoria Juvenil";
        }else{
            categoria= "Categoria Adulto";
        }
        System.out.println(categoria);


    }
}
