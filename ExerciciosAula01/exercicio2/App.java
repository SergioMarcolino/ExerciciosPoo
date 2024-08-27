package exercicio2;

public class App{
    public static void main(String[] args) {
        Livro c1 = new Livro( "fdds"," cleber ",  1 );
        Livro c2 = new Livro( "pé de feijão2","cleber2", 1);
        Livro c3 = new Livro( "pé de feijão3","cleber3", 1);

        System.out.println(c1.gettitulo() + c1.getautor() + c1.getpaginas());
        System.out.println(c2.gettitulo() + c2.getautor() + c2.getpaginas());
        System.out.println(c3.gettitulo() + c3.getautor() + c3.getpaginas());
    }


}
