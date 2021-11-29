public class ControleFluxo2 {
    public static void main(String[] args) {

        /*Saber se é maior de idade*/

       /*int idade= 10;

        if (idade <18){
            System.out.println("Você é de menor");
        }else {
        System.out.println( " Você de maior");
        }*/
        int idade= 64;
        String status;

        if (idade <=17){
            status = " Menor";
        }else if(idade >=18 && idade <=64 ) {
            status = "Adulto";
        }else{
            status = " Idoso";
        }
        System.out.println(status);


        int num=99;
        String numero;

        if(num >=100 && num<=200){
            numero =" Você digitou um numero entre 100 e 200";
        }else {
         numero="Seu numero não está entre 100 e 200";
        }
        System.out.println(numero);

        int nota1 =3;
        int nota2=3;
        int nota3=7;
        int media=(nota1+nota2+nota3)/3;


        if(media >=7){
            System.out.println( "Aluno aprovado, Parabéns!!");
        }else if(media >=5 && media <7) {
            System.out.println(" Aluno em exame final!!");
        }else {
            System.out.println("Aluno reprovado");
        }

    }
}
