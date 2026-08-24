package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Acumulador {

    public static void main(String[] args) {

        Integer sorteio = 999;
        Integer soma = 0;

        while (sorteio != 0) {
            sorteio = ThreadLocalRandom.current().nextInt(0, 11);
            soma += sorteio;
            System.out.println("Número sorteado: " + sorteio);

            if (sorteio.equals(0)) {
                System.out.println("A soma dos números é " + soma);
            }
        }
    }
}
