package br.com.casadocodigo.livraria.testes;

import br.com.casadocodigo.livraria.produtos.GerenciadorDeCupons;

public class ConsultaDeDesconto {

    public static void main(String[] args) {
        GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();
        Double desconto = gerenciador.validaCupon("cab11");

        if (desconto != null){
            System.out.println("Cupon de desconto válido");
            System.out.println("Valor " + desconto);
        } else {
            System.out.println("Esse cupon não exite!");
        }
    }
}
