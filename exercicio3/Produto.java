package exercicio3;
public class Produto {
    String nome;
    double preço;
    int quantidade;

    public Produto (String nome, double preço, int quantidade){
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }
    public String getnome(){
        return nome;
    }
    public double getpreço(){
        return preço;
    }
    public int getquantidade (){
        return quantidade;
    }
}
