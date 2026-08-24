package school.sptech;

public class LacosRepeticao {

    public static void main(String[] args) {
        // while, for e do-while

        // Atalho: fori
        for (int i = 0; i < 10; i++) {
            //System.out.println("Número da vez: " + (i + 1));
        }

        // Atalho: forr (Quando tiver vetor)
        for (int i = 9; i >= 0; i--) {
            System.out.println("Número da vez: " + i);
        }

        System.out.println("Exemplo com while");
        int contador = 10;
        while (contador < 10) {
            System.out.println("Número while da vez: " + contador);
            contador++;
        }

        int contadorDoWhile = 10;
        do {
            System.out.println("Número do-while da vez: " + contadorDoWhile);
            contadorDoWhile++;
        } while (contadorDoWhile < 10);
    }
}
