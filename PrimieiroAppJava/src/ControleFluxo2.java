public class ControleFluxo2 {
    public static void main(String[] args) {

        /*Saber se é maior de idade*/

        /*int idade= 10;

        if (idade <18){
            System.out.println("Você é de menor");
        }else {
        System.out.println( " Você de maior");
        }*/
        int idade= 17;
        String status;

        if (idade <=17){
            status = "Você é de menor";
        }else if(idade >=18 && idade <=64 ) {
            status = "Você Adulto";
        }else{
            status = " Idoso";
        }
        System.out.println(status);

    }
}
