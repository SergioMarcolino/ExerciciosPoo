package exercicio2;

public class Livro{
    String titulo, autor;
    int paginas;

    public Livro (String titulo, String autor, int paginas){
        this.paginas = paginas;
        this.titulo = titulo;
        this.autor = autor;

    }
    public String getautor(){
        return autor;
    }
    public String gettitulo (){
        return titulo;
    }
    public int getpaginas(){
        return paginas;
    }
    
}

