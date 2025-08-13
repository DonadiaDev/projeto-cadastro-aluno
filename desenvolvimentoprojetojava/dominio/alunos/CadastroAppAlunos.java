package desenvolvimentoprojetojava.dominio.alunos;

public class CadastroAppAlunos {
    String nome;
    int idade;
    String matricula;

    public CadastroAppAlunos(String nome, int idade, String matricula){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getMatricula(){
        return matricula;
    }

    public String toString(){
        return "CadastroAppAlunos{" + "nome='" + nome + '\'' + ", idade=" + idade + ", matricula='" + matricula + '\'' + '}';
    }
    }


