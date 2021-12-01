public class Arrays1 {
    public static void main(String[] args) {
        /*Arrays todo array em java é considerando objeto, sempre que for criar um array é preciso passar o tamanho*/

        int[] idades= new int[3];//so usar a palavra new quando criar arrays, pois é usada pra criar objetos
        idades[0]=20;
        idades[1]=15;
        idades[2]=30;

        System.out.println("Sua idade é: " + idades[0]);

        String [] nomes= new String[4];

        nomes[0]= "Ana";
        nomes[1]= "Maria";
        nomes[2]= "Paula";
        nomes[3]= "Jose";

        System.out.println("Meu nome é: " + nomes[2]);






    }
}
