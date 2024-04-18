public class CarrinhoDeCompra {

    private double total;
    //estamos usando o polimorfismo
    public void adiciona(Produto produto){
        System.out.println("Adicionando: " + produto);
        //livro.aplicaDescontoDe(5);
        total += produto.getValor();
    }

    public double getTotal() {
        return total;
    }
}
