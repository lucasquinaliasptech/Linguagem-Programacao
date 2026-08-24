package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Votacao {

    public static void main(String[] args) {

        Integer mussarela = 0;
        Integer calabresa = 0;
        Integer quatroQueijos = 0;

        for (Integer i = 0; i < 10; i++) {
            Integer sorteio = ThreadLocalRandom.current().nextInt(1, 4);

            if (sorteio == 1) {
                mussarela++;
            } else if (sorteio == 2) {
                calabresa++;
            } else {
                quatroQueijos++;
            }
        }

        String favorito = null;

        if (mussarela > calabresa && mussarela > quatroQueijos) {
            favorito = "mussarela";
        } else if (calabresa > mussarela && calabresa > quatroQueijos) {
            favorito = "calabresa";
        } else if (quatroQueijos > mussarela && quatroQueijos > calabresa) {
            favorito = "quatro queijos";
        } else {
            favorito = "não determinado, houve empate";
        }

        System.out.printf("""
                Quantidade de votos na mussarela: %d
                Quantidade de votos na calabresa: %d
                Quantidade de votos na quatro queijos: %d
                
                Sabor favorito: %s
                """, mussarela, calabresa, quatroQueijos, favorito);
    }
}
