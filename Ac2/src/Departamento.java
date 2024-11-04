
import java.util.ArrayList;

public class Departamento {
    private String nome;
    private ArrayList<FuncionarioBase> Funcionarios;
    //construtor
    public Departamento(String nome) {
        this.nome = nome;
        this.Funcionarios = new ArrayList<>();
    }

    //get and set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<FuncionarioBase> getFuncionario() {
        return Funcionarios;
    }

    public void setFuncionario(ArrayList<FuncionarioBase> funcionario) {
        Funcionarios = funcionario;
    }

    //métodos do ArrayList
    public void adicionarFuncionario(FuncionarioBase funcionario){
         Funcionarios.add(funcionario); 
    }

    public void removerFuncionario(FuncionarioBase funcionario){
        Funcionarios.remove(funcionario);
    }

    public double calcularFolhaDePagamento(){
        double total = 0;
        for(FuncionarioBase funcionario : Funcionarios){
            total += funcionario.calcularSalario();
        }
        return total;
    }

    //Metodo com poloimorfismo imprimirSalari
    public void imprimirSalariosFuncionario(){
        for(FuncionarioBase funcionario : Funcionarios){
            System.out.println("Nome " + funcionario.getNome() + " salário " + funcionario.calcularSalario());  
        }
    }


}
