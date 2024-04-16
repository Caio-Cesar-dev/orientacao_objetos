public class RegrasDeDesconto {
    public static void main(String[] args) {

        Autor autor = new Autor();
        Livro livro = new Livro(autor);

        livro.setValor(59.90);

        System.out.println("Valor atual: R$ " + livro.getValor());

        if(!livro.aplicaDescontoDe(25)){
            System.out.println("Desconto não pode ser maior que 30%");
        }else {
            System.out.println("Valor com desconto: " + livro.getValor());
        }
        //---------------------------------------------
        Ebook ebook = new Ebook(autor);
        ebook.setValor(29.90);

        System.out.println("Valor atual: " + ebook.getValor());

        if(!ebook.aplicaDescontoDe(10)){
            System.out.println("Desconto não pode ser maior que 30%");
        }else {
            System.out.println("Valor com desconto: R$ " + ebook.getValor());
        }



    }
}
