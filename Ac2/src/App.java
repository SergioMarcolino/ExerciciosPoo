public class App {
    public static void main(String[] args) throws Exception {
        //Departamentos
        Departamento Tecnologia = new Departamento("Tecnologia");

       Funcionario f1 = new Funcionario("João", 3000.0);
       Gerente g1 = new Gerente("Maria", 3000.0, 0.2);
       Diretor d1 = new Diretor("Carlos", 10000.0, 0.3, 2000);

       Tecnologia.adicionarFuncionario(f1);
       Tecnologia.adicionarFuncionario(g1);
       Tecnologia.adicionarFuncionario(d1);

       System.out.println("O total da folha de pagamento do departamento é " + Tecnologia.calcularFolhaDePagamento());
       Tecnologia.imprimirSalariosFuncionario();


       

    }
}
