package model;
public class Filmes {
    protected String titulo;
    protected String Diretor;
    protected String Categoria;
    protected int ano;
 
    public Filmes() {
    }

    public Filmes(String titulo, String diretor, String catagoria, int ano) {
        this.titulo = titulo;
        Diretor = diretor;
        Categoria = catagoria;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return Diretor;
    }

    public void setDiretor(String diretor) {
        Diretor = diretor;
    }

    public String getCatagoria() {
        return Categoria;
    }

    public void setCatagoria(String catagoria) {
        Categoria = catagoria;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String ExibirDadosFilme() {
        return "\nnome do filme: " + titulo + "\nnome do diretor: " + Diretor + 
        "\ncategoria: " + Categoria + "\nano do filme: " + ano;
    }
    
}