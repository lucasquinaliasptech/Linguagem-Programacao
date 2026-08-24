package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Loteria {

    public static void main(String[] args) {

        System.out.println("""
        LOTERIA!!!
        Escolha um número de 0 até 10 e teste a sua sorte!
        """);

        Integer numero = 0;
        Integer sorteio = 999;
        Integer contador = 0;

        while (numero != sorteio) {
            contador++;
            sorteio = ThreadLocalRandom.current().nextInt(0, 11);
            System.out.println("Número sorteado: " + sorteio);

            if (numero.equals(sorteio)) {
                System.out.println("Número sorteado encontrado!");
                if (contador <= 3) {
                    System.out.println("Você é MUITO sortudo");
                } else if (contador <= 10) {
                    System.out.println("Você é sortudo");
                } else {
                    System.out.println("É melhor você parar de apostar e ir trabalhar");
                }
            }
        }
    }
}
