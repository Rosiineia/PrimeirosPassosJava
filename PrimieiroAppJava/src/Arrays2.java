public class Arrays2 {
    public static void main(String[] args) {
        /* quado não tem valor os valores que são preenchidos par a cada
        tipo: byte;int;log; double é zero
         para array tipo char será: -  valor vazio
         para boolean será false; para reference será null;*/

        String[] nomes = new String[4];

        nomes[0] = "Ana";
        nomes[1] = "Maria";
        nomes[2] = "Paula";
        nomes[3] = "Jose";
        for (int i = 0; i < nomes.length; i++)

            System.out.println("Meu nome é, " + nomes[i]);
    }
}
