import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

public class ControleFluxo3 {
    public static void main(String[] args) {
        byte dia = 5;
        /* tipos de variaveis que poder ir dentro do switch : char;int;byte;short;enum;String*/

        switch (dia) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
        }
        char sexo = 'G';
        switch (sexo) {
            case 'F':
                System.out.println("Feminino");
                break;
            case 'M':
                System.out.println("Masculino");
                break;
            default:
                System.out.println("Prefiro não responder");


        }


    }
}
