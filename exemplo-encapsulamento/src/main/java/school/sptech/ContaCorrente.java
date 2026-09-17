package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class ContaCorrente {

    // Encapsulamento: técnica para proteger a nossa regra de negócio
    // Modificadores de acesso:
    // default -> apenas o pacote pode acessar
    // private -> apenas a própria classe pode acessar
    // public -> pode ser acessado de qualquer lugar
    // protected -> apenas o pacote ou subclasses podem acessar (não vamos falar por hora)
    private String numero;
    private String titular;
    private Double saldo;
    private String telefone;
    private String email;

    public ContaCorrente(String telefone) {
        this.telefone = telefone;
    }

    public ContaCorrente() {

    }

    // Construtor: "método especial" responsável por criar novos objetos
    // Precisa ter o mesmo nome da classe
    // Quando não criamos um, o Java cria um "vazio" automaticamente
    // this: palavra chave que significa "dessa classe", ou melhor, referencia essa instância
    public ContaCorrente(String titular, String email) {
        this.titular = titular;
        this.email = email;
        this.saldo = 0.0;
        this.numero = ThreadLocalRandom.current().nextInt(1000,2001) + "";
    }

    // Posso ter sobrecarga no construtor
    // Posso chamar um construtor dentro do outro utilizando this()
    public ContaCorrente(String titular, String email, String telefone) {
        this(titular, email);
        this.telefone = telefone;
    }

    private Boolean valorInvalido(Double valor) {
        return valor == null || valor <= 0;
    }

    public void depositar(Double valor) {
        if (valorInvalido(valor)) {
            System.out.println("Valor inválido para depósito!");
            return;
        }

        saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
    }

    public void sacar(Double valor) {
        if (valor == null || valor <= 0) {
            System.out.println("Valor inválido para saque!");
            return;
        }

        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
            return;
        }

        saldo -= valor;
        System.out.println("Saque realizado com sucesso!");
    }

    // Getters e Setters
    // Métodos públicos com regra de negócio ou não que vão alterar atributos privados


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setTelefone(String telefone) {
        if (telefone == null || telefone.length() != 11) {
            System.out.println("Telefone inválido!");
            return;
        }

        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "numero='" + numero + '\'' +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
