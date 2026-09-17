package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class ExemploLista {
    public static void main(String[] args) {
        // No Java, o vetor é estático
        // String[] nomes = new String[10];

        // List -> ArrayList é dinâmico
        List<String> nomes = new ArrayList<>();
        nomes.add("Bob");
        nomes.add("Ana");
        nomes.add("Jacob");
        nomes.add("Bruno");
        nomes.add("Bruno");
        nomes.add("Lucas");
        System.out.println(nomes);

        // .size() != .length | size é quantidade de elementos e length é tamanho do vetor
        System.out.println(nomes.size());

        // Remover um nome
        nomes.remove(0);
        System.out.println(nomes);

        // Remover um nome -> pelo valor -> primeira ocorrência
        nomes.remove("Bruno");
        System.out.println(nomes);

        // Pegar um elemento especifíco
        String nome01 = nomes.get(0);
        System.out.println("Primeiro nome: " + nome01);

        String ultimoNome = nomes.get(nomes.size() - 1);
        System.out.println(ultimoNome);

        // Atualizar um valor
        System.out.println(nomes);
        // Primeiro o index, depois o valor
        nomes.set(1, "Ian");
        System.out.println(nomes);


        // Criar lista com valores
        // String[] frutas = {"Banana"}; | Era assim

        List<String> frutas = new ArrayList<>(List.of("Banana", "Pera", "Maçã"));
        // List.of -> Cria uma lista imutável, caso não esteja dentro de um ArrayList!
        // Listas imutáveis são utéis para quando vários processos estão olhando para a mesma lista.
        frutas.add("Melancia");
        frutas.remove("Banana");
        frutas.addAll(List.of("Mamão", "Laranja"));

        System.out.println(frutas);

        // Iterar um ArrayLista
        for (int i = 0; i < frutas.size(); i++) {
            String frutaDaVez = frutas.get(i);
            System.out.println("Fruta da vez: " + frutaDaVez);
        }

        // Enhaced For
        for (String fruta : frutas) {
            System.out.println("Fruta da vez aprimorada: " + fruta);
        }

        // Remover frutas que começam com "M"
        // Não posso remover no for aprimorado
        // No for tradicional deve voltar uma posição com i--
        for (int i = 0; i < frutas.size(); i++) {
            String frutaDaVez = frutas.get(i);
            if (frutaDaVez.startsWith("M")) {
                frutas.remove(frutaDaVez);
                i--;
            }
        }
        System.out.println(frutas);

        // List não aceita primitivo, apenas classes!!!
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(2);
        numeros.add(3);

        System.out.println(numeros);

        // Tudo que é classe, é Object
        Integer paraRemover = 2;
        numeros.remove(paraRemover);
        System.out.println(numeros);
    }
}
