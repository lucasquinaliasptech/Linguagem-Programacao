package school.sptech;

public class Potencia {

    public static void main(String[] args) {

        Integer base = 2;
        Integer expoente = 5;
        Integer resultado = base;

        for (Integer i = 1; i < expoente; i++) {
            resultado *= base;
        }

        System.out.printf("%d elevado a %d = %d", base, expoente, resultado);
    }
}
