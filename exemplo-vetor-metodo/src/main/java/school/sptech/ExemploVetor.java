package school.sptech;

import java.util.Arrays;

public class ExemploVetor {

    public static void main(String[] args) {
        // em js...
        // let numeros = []

        // No java o vetor é estático
        int[] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        // sout
        System.out.println(Arrays.toString(numeros));

        Integer[] idades = new Integer[5];
        idades[0] = 60;
        idades[1] = 30;
        idades[2] = 45;
        idades[3] = 10;
        idades[4] = 20;
        // Dará erro!
        // idades[5] = 50;
        System.out.println(Arrays.toString(idades));
        System.out.println("Tamanho vetor idades: " + idades.length);

        // em js...
        // let frutas = ["banana","melancia"]

        // String[] frutas = new String[] {"banana", "melancia"};
        String[] frutas = {"Banana", "Melancia", "Pera"};
        System.out.println("Tamanho vetor frutas: " + frutas.length);
        System.out.println(Arrays.toString(frutas));

        // Iterar
        // Atalho: idades.fori
        // For-i -> for tradicional
        for (int i = 0; i < idades.length; i++) {
            Integer idadeDaVez = idades[i];
            System.out.println("Idade: " + idadeDaVez);
        }

        // Enhanced for
        // For aprimorado
        // Sempre varre a array inteiro!
        // não dá para ir de trás para frente!
        // atalho: idades.for
        for (Integer idadeDaVez : idades) {
            System.out.println("Idade da vez: " + idadeDaVez);
        }

        System.out.println("For voltando");
        // idades.forr
        for (int i = idades.length - 1; i >= 0; i--) {
            System.out.println("Idade: " + idades[i]);
        }

        // frutas.for
        for (String fruta : frutas) {
            System.out.println("Fruta da vez: " + fruta);
        }

        // Boolean[] likes = new Boolean[5];
        Boolean[] likes = {true, false, false, true};
        for(Boolean likeDaVez : likes) {
            String mensagem = likeDaVez ? "Deu like :)" : "Deslike :(";
            System.out.println(mensagem);
        }

        String[] nomes = new String[3];
        // index: 0, 1, 2
        // length: 3
        int indexDigitado = 5;

        if(indexDigitado >= 0 && indexDigitado < nomes.length) {
            nomes[indexDigitado] = "Lucas";
        } else {
            System.out.println("Index invalido!");
        }

    }
}