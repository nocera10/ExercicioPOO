import java.util.ArrayList;

public class Curso {

    private String nome;
    private int codigo;
    private Professor professorTitular;
    private Professor professorAdjunto;
    private int quantidadeAluno;
    private ArrayList<Aluno> listaAlunoDoCurso;

    public Curso(String nome, int codigo, ProfessorTitular professorTitular, ProfessorAdjunto professorAdjunto, int quantidadeAlunos) {
        this.nome = nome;
        this.codigo = codigo;
        this.professorTitular = professorTitular;
        this.professorAdjunto = professorAdjunto;
        this.quantidadeAluno = quantidadeAlunos;
        this.listaAlunoDoCurso = new ArrayList<Aluno>();
    }

    public Curso(String nome, int codigo, int quantidadeAlunos) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidadeAluno = quantidadeAlunos;
        this.listaAlunoDoCurso = new ArrayList<Aluno>();
    }

    public Boolean adicionarUmAluno(Aluno umAluno) {
        if (listaAlunoDoCurso.size() < quantidadeAluno) {
            listaAlunoDoCurso.add(umAluno);
            return true;
        } else {
            return false;
        }
    }

    public void excluirAluno(Aluno umAluno) {
        listaAlunoDoCurso.remove((Aluno)umAluno);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (!(obj instanceof Curso)) {
            return false;
        } else {
            return this.getCodigo() == ((Curso)obj).getCodigo();
        }
    }

    public Professor getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(Professor professorAdujunto) {
        this.professorAdjunto = professorAdujunto;
    }

    public int getQuantidadeAluno() {
        return quantidadeAluno;
    }

    public void setQuantidadeAluno(int quantidadeAluno) {
        this.quantidadeAluno = quantidadeAluno;
    }

    public ArrayList<Aluno> getListaAluno() {
        return listaAlunoDoCurso;
    }

    public void setListaAluno(ArrayList<Aluno> listaAluno) {
        this.listaAlunoDoCurso = listaAluno;
    }

    public Professor getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(Professor professorTitular) {
        this.professorTitular = professorTitular;
    }
}
