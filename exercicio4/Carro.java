package exercicio4;

public class Carro {
    String marca;
    String modelo;
    int ano;

    public Carro(String marca, String modelo, int ano) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;

    }
    public String getmarca(){
        return marca;
    }
    public String getmodelo (){
        return modelo;
    }
    public int getano(){
        return ano;
    }
}
