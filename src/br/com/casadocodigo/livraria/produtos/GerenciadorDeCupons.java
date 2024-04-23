package br.com.casadocodigo.livraria.produtos;

import java.util.*;

public class GerenciadorDeCupons {

    private Map<String, Double> cupons;

    public GerenciadorDeCupons (){
        this.cupons = new HashMap<>();
        cupons.put("cab11", 10.0);
        cupons.put("cab22", 12.0);
        cupons.put("cab33", 13.0);
        cupons.put("cab44", 14.0);
    }

//    public boolean validaCupon(String cupom){
//        return this.cupons.containsKey(cupom);
//    }

    public Double validaCupon(String cupom){
        return this.cupons.get(cupom);
    }
}
