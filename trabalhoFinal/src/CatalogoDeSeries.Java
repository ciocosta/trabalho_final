import java.util.ArrayList;

public class CatalogoDeSeries {
    private ArrayList<Serie> series;

    public CatalogoDeSeries() {
        this.series = new ArrayList<>();
    }

    public void adicionarSerie(Serie serie) {
        series.add(serie);
    }

    public void listarSeries() {
        for (Serie serie : series) {
            System.out.println(serie);
        }
    }
}