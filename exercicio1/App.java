package exercicio1;
public class App{
    public static void main(String[] args) throws Exception {
       Aluno  c1 = new Aluno ("joão", "1", "ads");
       Aluno  c2 = new Aluno ("luiz", "2", "spa");
       Aluno  c3 = new Aluno ("marcus", "3", "sps"); 

       System.out.println("Aluno1");
       System.out.println(" o aluno " + c1.getnome() + " está no curso " + c1.getcurso() + " com a matricula: " + c1.getmatricula());
       System.out.println(" o aluno " + c2.getnome() + " está no curso " + c2.getcurso() + " com a matricula: " + c2.getmatricula());
       System.out.println(" o aluno " + c3.getnome() + " está no curso " + c3.getcurso() + " com a matricula: " + c3.getmatricula());
    }
}