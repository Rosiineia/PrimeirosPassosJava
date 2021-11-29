public class ExercicoControleFluxo {
    public static void main(String[] args) {
        /* Crie uma variavel salario e imprima seu imposto
        imposto:
        salario < 1000 5%
        salario >= 1000 && salario < 2000 10%
        salario >=2000 && salario < 4000 15%
        salario >5000 20%

        */

        double salario = 10000;

        double totalImposto = 0;
        totalImposto = salario * 0.05;

        if (salario < 1000) {
            totalImposto = salario * 0.05;
        } else if (salario >= 1000 && salario < 2000) {
            totalImposto = salario * 0.10;
        } else if (salario >= 2000 && salario < 4000) {
            totalImposto = salario * 0.15;
        } else {
            totalImposto = totalImposto = salario * 0.20;
        }
        System.out.println("O Total de imposto é :" +" R$ " + totalImposto);
    }
}
