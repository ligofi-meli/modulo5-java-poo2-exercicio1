package gomes.filipe;

public class Exercicio {
    public static void main(String[] args) {
        String[] cidades = {
                "Londres", "Madrid", "Nova York", "Buenos Aires", "Asunción",
                "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"
        };
        int[][] temperaturas = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};

        for (int i = 0; i < cidades.length; i++){
            System.out.println("Cidade:" + cidades[i]);
            System.out.println("Temperatura mais alta: " + temperaturas[i][0] + "°C");
            System.out.println("Temperatura mais alta: " + temperaturas[i][1] + "°C");
            System.out.println("");
        }
    }
}
