package  exercicio3;
public class App {
    public static void main(String[] args) {
        Produto c1Produto = new Produto("maça",10.0, 1);
        Produto c2Produto = new Produto("uva",12.0, 6);
        Produto c3Produto = new Produto("limão",13.0, 3);

        System.out.println(" O prodturo " + c1Produto.getnome() + " preço " + c1Produto.getpreço() + " quantidade " + c1Produto.getquantidade());
        System.out.println(" O prodturo " + c2Produto.getnome() + " preço " + c2Produto.getpreço() + " quantidade " + c2Produto.getquantidade());
        System.out.println(" O prodturo " + c3Produto.getnome() + " preço " + c3Produto.getpreço() + " quantidade " + c3Produto.getquantidade());
    }
}
