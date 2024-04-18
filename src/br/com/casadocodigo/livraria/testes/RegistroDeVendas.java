package br.com.casadocodigo.livraria.testes;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.LivroFisico;

public class RegistroDeVendas {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Mauricio Ancine");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");
        fisico.setValor(59.90);
        if(fisico.aplicaDescontoDe10Porcento()){
            System.out.println("O valor agora é: " + fisico.getValor());
        }

//        br.com.casadocodigo.livraria.produtos.Ebook ebook = new br.com.casadocodigo.livraria.produtos.Ebook(autor);
//        ebook.setNome("Test-Driven Development");
//        ebook.setValor(29.90);

        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();

        carrinho.adiciona(fisico);
        //carrinho.adiciona(ebook);

        System.out.println("total: " + carrinho.getTotal());


    }
}
