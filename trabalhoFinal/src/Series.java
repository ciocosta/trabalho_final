public class Series extends Filmes {

    private int temporadas;

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

    @Override
    public String toString() {
        return super.toString() + "quantidade de temporadas: " + temporadas;
    }
}
