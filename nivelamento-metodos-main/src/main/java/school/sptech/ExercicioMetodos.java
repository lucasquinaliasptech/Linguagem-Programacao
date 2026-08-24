package school.sptech;

public class ExercicioMetodos {

    Boolean verificarMaioridade(Integer idade) {
        if (idade >= 18) {
            return true;
        }
        return false;
    }

    Double calcularMedia(Double valor1, Double valor2, Double valor3) {
        Double media = (valor1 + valor2 + valor3) / 3;

        return media;
    }

    Integer maiorNumero(Integer valor1, Integer valor2, Integer valor3) {
        if (valor1 >= valor2 && valor1 >= valor3) {
            return valor1;
        } else if (valor2 >= valor3 && valor2 >= valor1) {
            return valor2;
        }

        return valor3;
    }

    Integer calcularFatorial(Integer valor) {
        Integer fatorial = 1;

        for (int i = valor; i > 0; i--) {
            fatorial *= i;
        }

        return fatorial;
    }

    /*
    Boolean verificarPrimo(Integer valor) {
        Boolean primo = false;
        Integer contador = 0;

        for (int i = 1; i <= valor; i++) {
            if (valor % i == 0) {
                contador++;
            }
        }

        if (contador == 2) {
            primo = true;
        }

        return primo;
    }
     */

    // Versão Yugui
    Boolean verificarPrimo(Integer valor) {
        Integer contador = 0;

        for (int i = 1; i <= valor; i++) {
            if (valor % i == 0) {
                contador++;
            }
        }

        return contador == 2;
    }

    Integer calcularPotencia(Integer base, Integer expoente) {
        Integer resultado = base;

        for (int i = 1; i < expoente; i++) {
            resultado *= base;
        }

        if (expoente == 0) {
            resultado = 1;
        }

        return resultado;
    }

    Integer calcularTrocoEmBalas(Double valorCompra, Double valorRecebido) {
        Double diferenca = valorRecebido - valorCompra;
        Integer qtdBalas = 0;

        if (diferenca > 0) {
            for (Double i = 0.25; i <= diferenca; i += 0.25) {
                qtdBalas++;
            }
        }

        return qtdBalas;
    }

    Boolean verificarPalindromo(String palavra) {
        palavra = palavra.replaceAll(" ", "");
        palavra = palavra.toLowerCase();

        Boolean palindromo = false;

        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == palavra.charAt(palavra.length() - i - 1)) {
                palindromo = true;
            } else {
                palindromo = false;
                return palindromo;
            }
        }

        return palindromo;
    }
    /*
    charAt obtém um caractere do texto.
     */
}