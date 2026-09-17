package school.sptech.ex01;

import java.util.List;

public class Carrinho {
    private String cliente;
    private List<Produto> produtos;

    public Integer getQuantidade() {
        return produtos.size();
    }

    public void adicionar(Produto produto) {
        produtos.add(produto);
    }

    public Boolean existsPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }

        return false;
    }

    public Integer getQuantidadePorCategoria(String nome) {
        Integer quantidade = 0;

        for (Produto produto : produtos) {
            if (produto.getCategoria().equalsIgnoreCase(nome)) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public void limpar() {
        produtos.clear();
    }

    public void removerPorNome(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equalsIgnoreCase(nome)) {
                produtos.remove(produtos.get(i));
                i--;
            }
        }
    }

    public Produto getPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }

        return null;
    }

    public Double getValorTotal() {
        Double valorTotal = 0.0;

        for (Produto produto : produtos) {
            valorTotal += produto.getPreco();
        }

        return valorTotal;
    }
}
