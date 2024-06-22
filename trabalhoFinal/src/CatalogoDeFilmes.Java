import java.util.ArrayList;

public class CatalogoDeFilmes {
    private ArrayList<Filme> filmes;

    public CatalogoDeFilmes() {
        this.filmes = new ArrayList<>();
    }

    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
    }

    public void listarFilmes() {
        for (Filme filme : filmes) {
            System.out.println(filme);
        }
    }
}
