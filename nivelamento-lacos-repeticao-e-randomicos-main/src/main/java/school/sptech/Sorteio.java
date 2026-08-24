package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {

    public static void main(String[] args) {

        Integer numero = 99;
        Integer indice = null;
        Integer pares = 0;
        Integer impares = 0;

        for (Integer i = 1; i <= 200; i++) {
            Integer sorteio = ThreadLocalRandom.current().nextInt(1, 101);

            if (sorteio.equals(numero) && indice == null) {
                indice = i;
            }

            if (sorteio % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.printf("""
            Quantidade de números pares sorteados: %d
            Quantidade de números ímpares sorteados: %d
            """, pares, impares);

        if (indice != null) {
            System.out.printf("O número %d foi sorteado pela primeira vez no chute de número %d", numero, indice);
        } else {
            System.out.printf("O número %d não foi sorteado", numero);
        }
    }
}
