package school.sptech;

public class Main {

    public static void main(String[] args) {
        ContaCorrente conta01 = new ContaCorrente("Bob", "bob@email.com");

        System.out.println(conta01);
        conta01.depositar(100.0);
        conta01.sacar(200.0);

        ContaCorrente conta02 = new ContaCorrente("Ana", "ana@email.com", "11988887777");
        System.out.println(conta02);

        conta01.setTelefone("11988887777");
        System.out.println("Telefone alterado com sucesso! Novo telefone: " + conta01.getTelefone());

        // Ao colocar o objeto dentro do print, o toString() é automaticamente chamado
        System.out.println(conta02);
    }
}
