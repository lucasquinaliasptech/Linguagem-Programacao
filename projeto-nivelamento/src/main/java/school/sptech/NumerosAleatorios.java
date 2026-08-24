package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class NumerosAleatorios {

    public static void main(String[] args) {
        // o bound é excludente
        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(11);
        System.out.println("Número aleatório: " + numeroAleatorio);

        Integer numeroAleatorio2 = ThreadLocalRandom.current().nextInt(10, 20);
        System.out.println("Número aleatório2: " + numeroAleatorio2);

        Double numeroAleatorio3 = ThreadLocalRandom.current().nextDouble(11);
        System.out.printf("Número aleatório3: %.2f", numeroAleatorio3);
    }
}
