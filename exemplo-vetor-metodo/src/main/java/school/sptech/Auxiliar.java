package school.sptech;

public class Auxiliar {

    // void -> o método não retorna nada

    // métodos
    // Geralmente nome do método é uma ação, um verbo
    void dizerBomDia() {
        System.out.println("Bom dia!");
    }

    // Polimorfismo: várias formas
    // Sobrecarga
    // Posso ter metodos com nomes iguais, desde que:
    // os tipos dos argumentos sejam diferentes!
    // a quantidade de argumentos também conta!
    void dizerBomDia(String nome) {
        System.out.println("Bom dia, " + nome);
    }

    // Dará erro!
    //    void dizerBomDia(String local) {
//
//    }

    void dizerBomDia(String nome, String local) {
        System.out.println("Bom dia, " + nome);
        System.out.println("Você está em: " + local);
    }

    void dizerBomDia(Integer quantidade) {
        // quantidade.fori
        for (Integer i = 0; i < quantidade; i++) {
            System.out.println("Bom dia!");
        }
    }
}
