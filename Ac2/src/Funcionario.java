public class Funcionario extends FuncionarioBase {

    public Funcionario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    
    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }

    @Override
    public double calcularSalario(double bonusAdicional) {
        return super.calcularSalario(bonusAdicional);
    }


    @Override
    public String toString() {
        return "Funcionario []";
    }


  

    
    
}
