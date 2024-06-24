package view;
import controller.CatalogoDeFilmes;
import controller.CatalogoDeSeries;
import model.Filmes;
import model.Series;

public class Principal {

    public static void menu(){
        System.out.println("\nmenu de escolhas: ");
        System.out.println("\n1)Cadastrar um filme: ");
        System.out.println("\n2)Cadastrar uma serie: ");
        System.out.println("\n3)Buscar um filme: ");
        System.out.println("\n4)Buscar uma serie: ");
        System.out.println("\n5)Listar todos: ");
        System.out.println("\n6)Excluir Filme: ");
        System.out.println("\n7)Excluir Serie: ");
        System.out.println("\n0)sair: ");
    }

    private static void CadastrarFilme(){
        
        System.out.println("Informe os dados do filme: ");
        String titulo = Console.lerString("Titulo: ");
        String Diretor = Console.lerString("Diretor: ");
        String Categoria = Console.lerString("Categoria: ");
        int ano = Console.lerInt("ano: ");

        Filmes NovoFilme = new Filmes(titulo, Diretor, Categoria, ano);
        CatalogoDeFilmes.adicionarFilme(NovoFilme);
        System.out.println("\nFilme Cadastrado com sucesso");

    }
    private static void CadastrarSerie(){

        System.out.println("Informe os dados da serie: ");
        String titulo = Console.lerString("Titulo: ");
        String Diretor = Console.lerString("Diretor: ");
        String Categoria = Console.lerString("Categoria: ");
        int ano = Console.lerInt("ano: ");
        int temporadas = Console.lerInt("Temporadas: ");

        Series NovaSerie = new Series(titulo, Diretor, Categoria, ano, temporadas);
        CatalogoDeSeries.adicionarSerie(NovaSerie);
        System.out.println("\nSerie cadastrada com sucesso");
    }
    private static void BuscarFilme(){
        
        try{
            CatalogoDeFilmes.verificarListaVazia();
            String titulo = Console.lerString("\nInforme o titlo do filme: ");
            Filmes CatalogoFilme = CatalogoDeFilmes.buscarFilme(titulo);

            System.out.println("\nFilme encontrado: " + CatalogoFilme.ExibirDadosFilme());
        }
        
        catch (Exception exception) {

            System.out.println(exception.getMessage());
        }
    }
    private static void BuscarSerie(){

        try{
            CatalogoDeSeries.verificarListaVazia();
            String titulo = Console.lerString("\nInforme o titlo da serie:  ");
            Series CatalogoSerie = CatalogoDeSeries.buscarSerie(titulo);

            System.out.println("\nSerie encontrada: " + CatalogoSerie.ExibirDadosSeries());
        }
        
        catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

    }
    private static void ListarTodos(){
       
        try {

            CatalogoDeFilmes.verificarListaVazia();
            CatalogoDeSeries.verificarListaVazia();

            System.out.println("\nFilmes e Series Cadastrados:");

            for(Filmes tempFilmes : CatalogoDeFilmes.getListaFilmes()) {

                System.out.println(tempFilmes.ExibirDadosFilme());
            }
            for(Series tempSeries : CatalogoDeSeries.getListaSeries()){

                System.out.println(tempSeries.ExibirDadosSeries());
            }
        } 
        
        catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

    }
    private static void ExcluirFilme(){
        
        try {

            CatalogoDeFilmes.verificarListaVazia();

            String titulo = Console.lerString("informe o titulo do filme que deseja excluir: ");

            Filmes CatalogoFilme = CatalogoDeFilmes.buscarFilme(titulo);

            CatalogoDeFilmes.removerFilme(CatalogoFilme);

            System.out.println("\nFilme Removido");

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }
    }

    private static void ExcluirSerie(){
       
        try {

            CatalogoDeSeries.verificarListaVazia();

            String titulo = Console.lerString("informe o titulo da Serie que deseja excluir: ");

            Series CatalogoSerie = CatalogoDeSeries.buscarSerie(titulo);

            CatalogoDeSeries.removerSerie(CatalogoSerie);

            System.out.println("\nSerie Removida");

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }
    }

    private static void OP(int op){

        switch (op) {
            case 1:
                CadastrarFilme();
                break;
            case 2: 
                CadastrarSerie();
                break;
            case 3: 
                BuscarFilme();           
                break;
            case 4: 
                BuscarSerie();
                break;
            case 5:
                ListarTodos();
                break;
            case 6: 
                ExcluirFilme();
                break;
            case 7: 
                ExcluirSerie();
                break;
            case 0:
                System.out.println("\nsistema finalizado");
                System.exit(0);
                break;

            default: 
                System.out.println("\nopcao invalida, tente novamente: ");
                break;
        }

    }
    public static void main(String[] args) {
        while (true) {
            menu();
            int op = Console.lerInt("Informe sua opcao: ");
            OP(op);
        }
    }
}