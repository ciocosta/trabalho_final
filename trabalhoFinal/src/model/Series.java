package model;
public class Series extends Filmes {

    protected int temporadas;

    public Series(int temporadas) {
        this.temporadas = temporadas;
    }

    public Series(String titulo, String diretor, String catagoria, int ano, int temporadas) {
        super(titulo, diretor, catagoria, ano);
        this.temporadas = temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public String ExibirDadosSeries() {
        return  "\nnome do filme: " + titulo + "\nnome do diretor: " + Diretor + 
        "\ncategoria: " + Categoria + "\nano de lancamento: " + ano + 
        "\nquantidade de temporadas: " + temporadas;
    }
}
