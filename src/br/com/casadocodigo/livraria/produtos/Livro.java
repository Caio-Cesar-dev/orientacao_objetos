package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

public abstract class Livro implements Produto {

    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor; //A classe autor pode ser um atributo da classe br.com.casadocodigo.livraria.produtos.Livro

    public Livro(Autor autor){
        this.autor = autor;
        this.isbn = "000-00-00000-0";
    }

    //Este método verifica se exite autor, caso não, só será apresentado os dados
    //do livro conforme condição no 'método mostarDetalhes()'.
    boolean temAutor(){
        return this.autor != null;
    }

    public void mostrarDetalhes(){
        System.out.println("Mostrando detalhes do livro");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        if (this.temAutor()){
            autor.mostrarDetlhes();
        }
        System.out.println("--------------------");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public int compareTo (Produto outro){

        if (this.getValor() < outro.getValor()){
            return 1;
        }
        if (this.getValor() > outro.getValor()){
            return 1;
        }
        return 0;
    }


}
