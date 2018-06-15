import java.time.LocalDate;
import java.util.Date;

public class Matricula {

    private Aluno aluno;
    private Curso curso;
    private LocalDate data;

    public Matricula(Aluno aluno, Curso curso, LocalDate data) {
        this.aluno = aluno;
        this.curso = curso;
        this.data = data;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
