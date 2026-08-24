package school.sptech;

public class CalculoMedia {

    public static void main(String[] args) {

        String nome = "Lucas";
        Double nota1 = 9.5;
        Double nota2 = 6.0;

        Double media = (nota1 + nota2) / 2;

        System.out.printf("Olá, %s. Sua média foi de %.2f", nome, media);
    }
}
