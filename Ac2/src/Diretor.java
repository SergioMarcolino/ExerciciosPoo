public class Diretor extends FuncionarioBase implements Beneficios{
    private double bonusPercentual;
    private double auxilioMoradia;
    public Diretor(String nome, double salarioBase, double bonusPercentual, double auxilioMoradia) {
        super(nome, salarioBase);
        this.bonusPercentual = bonusPercentual;
        this.auxilioMoradia = auxilioMoradia;
    }
    public double getBonusPercentual() {
        return bonusPercentual;
    }
    public void setBonusPercentual(double bonusPercentual) {
        this.bonusPercentual = bonusPercentual;
    }
    public double getAuxilioMoradia() {
        return auxilioMoradia;
    }
    public void setAuxilioMoradia(double auxilioMoradia) {
        this.auxilioMoradia = auxilioMoradia;
    }

    @Override
    public double calcularSalario() {
       double salario;
       salario = salarioBase + (salarioBase * bonusPercentual) + auxilioMoradia;
        return salario;
    }

    @Override
    public double calcularSalario(double bonusAdicional) {
        return super.calcularSalario(bonusAdicional);
    }
    
    // métodos de interface beneficios.
    @Override
    public double calcularAuxilioMoradia(double valorFixado) {
        return valorFixado;
    }

    @Override
    public double calcularBonus(double percentual) {
        return getSalarioBase() * percentual;
    }
    @Override
    public String toString() {
        return "Diretor [nome=" + nome + ", bonusPercentual=" + bonusPercentual + ", salarioBase=" + salarioBase
                + ", auxilioMoradia=" + auxilioMoradia + ", getNome()=" + getNome() + ", getSalarioBase()="
                + getSalarioBase() + ", getBonusPercentual()=" + getBonusPercentual() + ", getAuxilioMoradia()="
                + getAuxilioMoradia() + ", calcularSalario()=" + calcularSalario() + "]";
    }
    
    
    
}
