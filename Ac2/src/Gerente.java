public class Gerente extends FuncionarioBase implements Beneficios{
    protected double bonusPercentual;

    public Gerente(String nome, double salarioBase, double bonusPercentual) {
        super(nome, salarioBase);
        this.bonusPercentual = bonusPercentual;
    }

    public double getBonusPercentual() {
        return bonusPercentual;
    }

    public void setBonusPercentual(double bonusPercentual) {
        this.bonusPercentual = bonusPercentual;
    }

    @Override
    public double calcularSalario() {
    double salario;
        salario =  salarioBase * bonusPercentual + salarioBase;
        return salario;
    }

    @Override
    public double calcularSalario(double bonusAdicional) {
        return super.calcularSalario(bonusAdicional);
    }

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
        StringBuilder sb = new StringBuilder();
        sb.append("Gerente{");
        sb.append("bonusPercentual=").append(bonusPercentual);
        sb.append('}');
        return sb.toString();
    }

    

    
}
