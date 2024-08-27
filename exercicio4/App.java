package exercicio4;

public class App {
    public static void main(String[] args) {
        Carro c1 = new Carro("toyota", "oi", 1999);
        Carro c2 = new Carro("chevrolet", "opa", 1936);
        Carro c3 = new Carro("nissan", "olá", 1980);

    System.out.println(" Marca " + c1.getmarca() + " modelo " + c1.getmodelo() + " ano " + c1.getano());
    System.out.println(" Marca " + c2.getmarca() + " modelo " + c2.getmodelo() + " ano " + c2.getano());
    System.out.println(" Marca " + c3.getmarca() + " modelo " + c3.getmodelo() + " ano " + c3.getano());
        
    }
}
