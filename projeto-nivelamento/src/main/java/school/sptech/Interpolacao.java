package school.sptech;

public class Interpolacao {

    public static void main(String[] args) {
        // Javascript -> let mensagem = `Meu nome é ${nome}`
        String nome = "Lucas";
        Integer idade = 21;
        Double altura = 1.85;

        String mensagem = "Meu nome é: %s, eu tenho %d anos e %.2f de altura. Teste de porcentagem: 25%%".formatted(nome, idade, altura);
        System.out.println(mensagem);

        String mensagem2 = String.format("Meu nome é: %s, eu tenho %d anos e %.2f de altura. Teste de porcentagem: 25%%",  nome, idade, altura);
        System.out.println(mensagem2);

        // Text block/String block
        String texto = """
                    Meu nome é %s
                    Tenho %.2f de altura
                        Testando espaço
                            #JavaMelhorQueJS
                """.formatted(nome, altura);
        System.out.println(texto);

        // souf
        System.out.printf("Meu nome é %s, tenho %d anos e %.2f de altura.", nome, idade, altura);
    }
}
