package school.sptech;

public class Auxiliar {

    // Métodos, não funções
    void dizerBomDia() {
        System.out.println("Bom dia!");
    }

    void dizerBomDia(String nome) {
        System.out.println("Bom dia " + nome);
    }

    void dizerBomDia(Integer qtd) {
        for (int i = 0; i < qtd; i++) {
            System.out.println("Bom dia " + i);
        }
    }

    void dizerBomDia(String nome, Integer qtd) {
        for (int i = 0; i < qtd; i++) {
            System.out.println("Bom dia " + nome + i);
        }
    }
}
