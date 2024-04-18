public class Revista implements Produto, Promocional {
    private String nome;
    private String descricao;
    private double valor;
    private Editora edirora;

    public boolean aplicaDescontoDe(double porcentagem){
        if(porcentagem > 10){
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        return true;
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

    public Editora getEdirora() {
        return edirora;
    }

    public void setEdirora(Editora edirora) {
        this.edirora = edirora;
    }
}
