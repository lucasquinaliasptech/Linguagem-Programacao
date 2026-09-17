package school.sptech.ex05;

import java.util.concurrent.ThreadLocalRandom;

public class Adivinhador {

    private Integer tentativas;

    public void adivinharNumero(Integer numero) {
        Integer num = -1;
        Integer contador = 0;

        while (num != numero) {
            num = ThreadLocalRandom.current().nextInt(0, 51);
            contador++;

            System.out.println(contador);
            System.out.println(num);
        }

        System.out.printf("O número %d foi sorteado após %d tentativas.%n", num, contador);
    }

    public Integer getTentativas() {
        return tentativas;
    }
}
