package main.java.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemCompra;

    public CarrinhoDeCompras() {
        this.itemCompra = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemCompra.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemCompra.isEmpty()) {
            for (Item c : itemCompra) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(c);
                }
            }
            itemCompra.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista de compras está vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemCompra.isEmpty()) {
            for (Item c : itemCompra) {
                double valorItem = c.getPreco() * c.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista de compras está vazia!");
        }
    }

    public void exibirItens() {
        if (!itemCompra.isEmpty()) {
            System.out.println(this.itemCompra);
        } else {
            System.out.println("A lista de compras está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + itemCompra +
                '}';
    }

    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caneta", 2d, 12);
        carrinhoDeCompras.adicionarItem("Caderno", 15d, 8);
        carrinhoDeCompras.adicionarItem("Borracha", 3d, 5);
        carrinhoDeCompras.adicionarItem("Régua 50 cm", 36d, 2);
        carrinhoDeCompras.adicionarItem("Lapiseira", 15d, 2);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Lápis");
        carrinhoDeCompras.exibirItens();

        System.out.println("O valor total da compra é R$ " + carrinhoDeCompras.calcularValorTotal());

    }
}
