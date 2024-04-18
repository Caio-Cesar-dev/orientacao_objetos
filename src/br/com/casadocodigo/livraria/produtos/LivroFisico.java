package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

public class LivroFisico extends Livro implements Promocional{

    public LivroFisico(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if(porcentagem > 0.3) {
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        System.out.println("Aplicando desconto no br.com.casadocodigo.livraria.produtos.LivroFisico");
        return true;
    }

    public double getTaxaDeImpressao(){
        return this.getValor() * 0.05;
    }
}