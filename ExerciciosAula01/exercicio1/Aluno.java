package exercicio1;

public class Aluno{
    String nome, matricula, curso;

    //construtor
    public Aluno ( String nome, String  matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }
    public String getnome(){
        return nome;
    }
    public String getmatricula () {
        return matricula;
    }
    public String getcurso (){
        return curso;
    }
}
