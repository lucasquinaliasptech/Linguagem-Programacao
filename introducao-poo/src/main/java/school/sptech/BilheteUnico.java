package school.sptech;

// Classe é a forma do bolo
public class BilheteUnico {

    // Características em POO: atributos (Fields)
    String titular;
    String numero;
    Double saldo;
    Boolean isIdoso;
    Boolean isEstudante;
    String cor;

    Boolean recarregar(Double valor) {
        // Sempre validar NULO PRIMEIRO! (Para evitar nullPointerException)
        if (valor == null || valor <= 0) {
            System.out.println("Valor inválido para recarga");
            return false;
        }

        saldo += valor;
        System.out.println("Recarga realizada com sucesso!");
        return true;
    }

    Boolean passarBilhete() {
        if (isIdoso) {
            System.out.println("Subsídio aplicado");
            return true;
        }

        Double tarifaVigente = 5.4;
        Double valorAPagar = isEstudante ? tarifaVigente / 2 : tarifaVigente;

        if (valorAPagar > saldo) {
            System.out.println("Saldo insuficiente");
            return false;
        }

        saldo -= valorAPagar;
        System.out.println("Passou com sucesso!");
        return true;
    }

    void printarInformacoes() {
        System.out.printf("""
                -----------------
                Titular: %s
                Número: %s
                Saldo: %.2f
                Cor: %s
                isIdoso: %b
                isEstudante: %b
                -----------------
                """, titular, numero, saldo, cor, isIdoso, isEstudante);
    }
}
