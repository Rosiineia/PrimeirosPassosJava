public class ControleDeFluxo5 {
    public static void main(String[] args) {
        /*dado valor em um carro desubra em quantas vezes ele pode ser parcelado
        porem as parcelas não podem ser menores que R$1000*/

        double valorTotal =30000;
        for (int parcela =1; parcela<= valorTotal; parcela++){
            double valorParcela = valorTotal/parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println( "Parcela " + parcela + " R$" + valorParcela);
        }

    }
}
