package br.com.casadocodigo.livraria.produtos;

public interface Produto {

    double getValor();

    int compareTo(Produto outro);
}
// como todoo método sem corpo de uma Interface é abstrato, o uso do modificador abstract
//é opcional. não precisamos tambem adcionar o modificador public, pois tb é public por padrão