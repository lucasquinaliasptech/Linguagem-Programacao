package school.sptech.ex6;

import java.util.List;

public class ListaDeCompras {
    String nomeLista;
    Integer capacidadeMaxima;
    List<String> itens;

    void adicionarItem(String item) {
        if (itens.size() == capacidadeMaxima) {
            return;
        }

        for (String itemDaVez : itens) {
            if (itemDaVez.equals(item)) {
                return;
            }
        }

        itens.add(item);
    }

    Boolean removerItem(String item) {
        Boolean contem = false;

        for (String itemDaVez : itens) {
            if (itemDaVez.equals(item)) {
                itens.remove(item);
                return true;
            }
        }

        return false;
    }

    String obterItem(Integer indice) {
        if (indice >= itens.size() || indice < 0) return null;

        return itens.get(indice);
    }

    Boolean substituirItem(Integer indice, String novoItem) {
        if (indice >= itens.size() || indice < 0) return false;

        for (String itemDaVez : itens) {
            if (itemDaVez.equals(novoItem)) {
                return false;
            }
        }

        itens.set(indice, novoItem);
        return true;
    }

    Integer calcularVagasRestantes() {
        return capacidadeMaxima - itens.size();
    }

    String removerItemNaPosicao(Integer indice) {
        if (indice >= itens.size() || indice < 0) return null;

        String removido = itens.get(indice);
        itens.remove(removido);
        return removido;
    }

    Integer removerItensDuplicados() {
        Integer contador = 0;

        for (int i = 0; i < itens.size(); i++) {
            for (int j = 1; j + i < itens.size(); j++) {
                if (j + i + 1 < itens.size()) {
                    if (itens.get(i).equals(itens.get(j + i + 1))) {
                        itens.remove(j + i + 1);
                        contador++;
                    }
                }

                if (itens.get(i).equals(itens.get(j + i))) {
                    itens.remove(j + i);
                    contador++;
                }
            }
        }

        return contador;
    }
}