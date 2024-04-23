package br.com.casadocodigo.livraria.testes;

import br.com.casadocodigo.livraria.produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {

    private double total;
    private ArrayList<Produto> produtos;

    public CarrinhoDeCompra(){
        this.produtos = new ArrayList<>();
    }
    public void adiciona(Produto produto){
        this.produtos.add(produto);
    }

    public void remove(int posicao){
        this.produtos.remove(posicao);
    }

    public double getTotal() {
        return total;
    }

    public List<Produto> getProdutos(){
        return produtos;
    }

}
