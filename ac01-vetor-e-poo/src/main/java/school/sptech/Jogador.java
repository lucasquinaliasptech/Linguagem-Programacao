package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    String nome;
    Double saldo;
    Integer quantidadeFichas;
    Integer quantidadePartidas;
    Integer vitorias;

    Boolean validarJogador() {
        if (nome == null || saldo == null || saldo < 0) {
            return false;
        }

        return true;
    }

    void registrarPartida(Boolean vitoria) {
        quantidadePartidas++;

        if (vitoria) {
            vitorias++;
        }
    }

    Boolean consumirFicha(Integer quantidadeFichasParaConsumo) {
        if (quantidadeFichasParaConsumo == null ||  quantidadeFichasParaConsumo < 0 || quantidadeFichasParaConsumo > quantidadeFichas) {
            return false;
        }

        quantidadeFichas -= quantidadeFichasParaConsumo;
        return true;
    }

    Boolean comprarFichas(Integer quantidadeFichasParaCompra) {
        if (quantidadeFichasParaCompra == null || quantidadeFichasParaCompra < 0) {
            return false;
        }

        Integer valorCompra = 0;

        if (quantidadeFichasParaCompra <= 5) {
            valorCompra = quantidadeFichasParaCompra * 5;
        } else if (quantidadeFichasParaCompra <= 10) {
            valorCompra = quantidadeFichasParaCompra * 4;
        } else {
            valorCompra = quantidadeFichasParaCompra * 3;
        }

        if (valorCompra > saldo) {
            return false;
        }

        saldo -= valorCompra;
        quantidadeFichas += quantidadeFichasParaCompra;
        return true;
    }

    Integer encontrarMaiorPontuacao(Integer[] pontuacoes) {
        if (pontuacoes == null || pontuacoes.length == 0) {
            return null;
        }

        Integer indice = 0;

        for (int i = 0; i < pontuacoes.length; i++) {
            if (pontuacoes[i] > pontuacoes[indice]) {
                indice = i;
            }
        }

        return pontuacoes[indice];
    }

    Integer contarPontuacoesAcimaDaMedia(Integer[] pontuacoes) {
        if (pontuacoes == null || pontuacoes.length == 0) {
            return 0;
        }

        Integer media = 0;

        for (Integer pontuacao : pontuacoes) {
            media += pontuacao;
        }

        media /= pontuacoes.length;

        Integer contador = 0;

        for (Integer pontuacao : pontuacoes) {
            if (pontuacao > media) {
                contador++;
            }
        }

        return contador;
    }

    Integer encontrarMaiorSequenciaDeVitorias(Boolean[] resultados) {
        if (resultados == null || resultados.length == 0) {
            return 0;
        }

        Integer contador = 0;

        List<Integer> contadores = new ArrayList<>();

        for (int i = 0; i < resultados.length; i++) {
            if (resultados[i]) {
                contador++;
            } else {
                contadores.add(contador);
                contador = 0;
            }
        }

        contadores.add(contador);

        Integer indice = 0;

        for (int i = 0; i < contadores.size(); i++) {
            if (contadores.get(i) > contadores.get(indice)) {
                indice = i;
            }
        }

        return contadores.get(indice);
    }
}