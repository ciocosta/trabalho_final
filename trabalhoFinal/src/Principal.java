public class Principal {

    public static void menu(){
        System.out.println("\nmenu de escolhas: ");
        System.out.println("\n1)Cadastrar um filme: ");
        System.out.println("\n2)Cadastrar uma serie: ");
        System.out.println("\n3)Buscar um filme: ");
        System.out.println("\n4)Buscar uma serie: ");
        System.out.println("\n5)Listar todos: ");
        System.out.println("\n6)Excluir");
        System.out.println("\n0)sair: ");
    }

    private static void CadastrarFilme(){
        
        System.out.println("Informe os dados do filme: ");
        String titulo = Console.lerString("Titulo: ");
        String Diretor = Console.lerString("Diretor: ");
        String Categoria = Console.lerString("Categoria: ");
        int ano = Console.lerInt("ano: ");

        Filmes NovoFilme = new Filmes(titulo, Diretor, Categoria, ano);

    }
    private static void CadastrarSerie(){

        System.out.println("Informe os dados do filme: ");
        String titulo = Console.lerString("Titulo: ");
        String Diretor = Console.lerString("Diretor: ");
        String Categoria = Console.lerString("Categoria: ");
        int temporadas = Console.lerInt("Temporadas: ");
        int ano = Console.lerInt("ano: ");

        Series NovaSerie = new Series(titulo, Diretor, Categoria, temporadas, ano);
    }
    private static void BuscarFilme(){
    }
    private static void BuscarSerie(){
    }
    private static void ListarTodos(){
    }
    private static void Excluir(){
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
                Excluir();
                break; 
            case 0:
                System.out.println("\nsistema finalizado");
                break;

            default: 
                System.out.println("\nopcao invalida, tente novamente.");
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