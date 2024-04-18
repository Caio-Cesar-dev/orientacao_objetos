public class Ebook extends Livro implements Promocional{
    private String waterMark;

    public Ebook(Autor autor) {
        super(autor);
    }
    public void setWaterMark(String waterMark){
        this.waterMark =waterMark;
    }

    public String getWaterMark(){
        return waterMark;
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > (15)){
            return false;
        }
        double desconto = this.getValor() * (porcentagem/100);
        this.setValor(this.getValor() - desconto);
        return true;
    }
}
