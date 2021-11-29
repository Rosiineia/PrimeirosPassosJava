public class ExercicioControleFluxo2 {
    public static void main(String[] args) {
        /* Crie um switch que dado valor de 1 a 7
         * considerando 1 domingo imprima se é dia util ou fim de samana*/

        //byte dia =5;

      /*  switch (dia){
            case 1:
                System.out.println("Domingo, Final de semana");
                break;
            case 2:
                System.out.println("Segunda, dia util");
                break;
            case 3:
                System.out.println("Terça, dia util");
                break;
            case 4:
                System.out.println("Quarta, dia util");
                break;
            case 5:
                System.out.println("Quinta, dia util");
                break;
            case 6:
                System.out.println("Sexta, dia util");
                break;
            case 7:
                System.out.println("Sabado, Final de semana");

        }*/
        byte dia = 8;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
                break;
            default:
                System.out.println("Opção invalida");
        }


    }
}
