public class ControleFluxo4 {
    public static void main(String[] args) {
        /* ESTRUTURAS DE REPETIÇÃO

        while: comando de repetição, vai executar um bloco de codigo, enquanto
         o que estiver dento do parentese fo (true)*/

        int contador = 11;

        while (contador < 10) {
            System.out.println(++contador);
        }
        contador =0;
        do {//se a condição for , true ou false ele sera executado pelo menos uma vez
            System.out.println("Dentro do do while é " + contador++);
        } while (contador < 10);

        for (int i = 0; i < 10; i++) {//dentro do for temos 3 partes separados por ; (ponto e virgula)
            System.out.println("o valor de i é " + i);
            if(i==8){
                break;
            }

        }

    }
}
