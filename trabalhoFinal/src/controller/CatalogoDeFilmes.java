package controller;
import java.util.ArrayList;
import java.util.List;

import model.Filmes;

public abstract class CatalogoDeFilmes {

    private static List<Filmes> listaFilmes = new ArrayList<>();

    public static void adicionarFilme(Filmes filme)  {
        
        try {
            listaFilmes.add(filme);
        
        } catch (NullPointerException nullPointerException) {
            
            System.out.println(nullPointerException.getMessage());
        }
    }

    public static Filmes buscarFilme(String Titulo) throws Exception{
       
        for (Filmes tempFilme : listaFilmes) {

            if (tempFilme.getTitulo().equals(Titulo)) {
                return tempFilme;
            }
        }
        throw new Exception("\nFilme com o titulo " + Titulo + " não licalizado.");
    }

    public static List<Filmes> getListaFilmes() {

        return listaFilmes;
        
    }

    public static void removerFilme(Filmes filme) {

        listaFilmes.remove(filme);
    }

    public static void verificarListaVazia() throws ListaVaziaException{
        if (listaFilmes.isEmpty()) {
            throw new ListaVaziaException("\nNão há Filmes cadastrados");
        }
    }
}
