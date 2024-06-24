import java.util.ArrayList;
import java.util.List;

public class CatalogoDeSeries {
    
    private static List<Series> listaSeries = new ArrayList<>();

    public static void adicionarSerie(Series serie)  {
        
        try {
        listaSeries.add(serie);
        }
        catch (NullPointerException nullPointerException) {
            System.out.println(nullPointerException.getMessage());
        }
    }

    public static Series buscarSerie(String Titulo) throws Exception{
       
        for (Series tempSerie : listaSeries) {

            if (tempSerie.getTitulo().equals(Titulo)) {
                return tempSerie;
            }
        }
        throw new Exception("\nFilme com o titulo " + Titulo + " não localizado.");
    }

    public static List<Series> getListaSeries() {

        return listaSeries;
        
    }

    public static void removerSerie(Series serie) {

        listaSeries.remove(serie);
    }

    public static void verificarListaVazia() throws ListaVaziaException{
        if (listaSeries.isEmpty()) {
            throw new ListaVaziaException("\nNão há Series cadastradas");
        }
    }
}