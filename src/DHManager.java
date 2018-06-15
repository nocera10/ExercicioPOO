import java.time.LocalDate;
import java.util.ArrayList;

public class DHManager {

    private ArrayList<Aluno> listaTotalAluno;
    private ArrayList<Professor> listaProfessor;
    private ArrayList<Curso> listaCurso;
    private ArrayList<Matricula> listaMatricula;

    public DHManager() {
        this.listaTotalAluno = new ArrayList<Aluno>();
        this.listaProfessor = new ArrayList<Professor>();
        this.listaCurso = new ArrayList<Curso>();
        this.listaMatricula = new ArrayList<Matricula>();
    }

    public void registrarCurso(String nome, int codigoCurso, int quantidadeMaximaDeAlunos) {
        Curso curso = new Curso(nome, codigoCurso, quantidadeMaximaDeAlunos);
        listaCurso.add(curso);
    }

    public void excluirCurso(int codigoCurso) {
        for (int i = 0; i < listaCurso.size(); i++) {
            if(listaCurso.get(i).getCodigo() == (codigoCurso)) {
                listaCurso.remove(listaCurso.get(i));
            }
        }
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, int codigoProfessor, int quantidadeDeHoras) {
        ProfessorAdjunto professorAdjunto = new ProfessorAdjunto(nome, sobrenome, 0, codigoProfessor, quantidadeDeHoras);
        listaProfessor.add(professorAdjunto);
    }

    public void registrarProfessorTitular(String nome, String sobrenome, int codigoProfessor, String especialidade) {
        ProfessorTitular professorTitular = new ProfessorTitular(nome, sobrenome, 0, codigoProfessor, especialidade);
        listaProfessor.add(professorTitular);
    }

    public void excluirProfessor(int codigoProfessor) {
        for (int i = 0; i < listaProfessor.size(); i++) {
            if(listaProfessor.get(i).getCodigo() == (codigoProfessor)) {
                listaProfessor.remove(listaProfessor.get(i));
            }
        }
    }

    public void cadastrarAluno(String nome, String sobrenome, int codigo) {
        Aluno aluno = new Aluno(nome, sobrenome, codigo);
        listaTotalAluno.add(aluno);
    }

    public void matricularAluno(int codigoAluno, int codigoCurso) {
        for (int i = 0; i < listaCurso.size(); i++) {
            if (listaCurso.get(i).getCodigo() == codigoCurso) {
                for (int j = 0; j < listaTotalAluno.size(); j++) {
                    if(listaTotalAluno.get(j).getCodigo() == codigoAluno) {
                        if(listaCurso.get(i).adicionarUmAluno(listaTotalAluno.get(j))) {
                            Matricula matriculaLocal = new Matricula(listaTotalAluno.get(j), listaCurso.get(i), LocalDate.now());
                            listaMatricula.add(matriculaLocal);
                            System.out.println("Matrícula do(a) " + listaTotalAluno.get(j).getNome() + " realizada com sucesso");
                        } else {
                            System.out.println("Matrícula do(a) " + listaTotalAluno.get(j).getNome() + " não realizada por falta de vagas");
                        }
                    }
                }
            }
        }
    }

    public void alocarProfessores(int codigoCurso, int codigoProfessorTitular, int codigoProfessorAdjunto) {
        for (int i = 0; i < listaCurso.size(); i++) {
            if (listaCurso.get(i).getCodigo() == codigoCurso) {
                for (int j = 0; j < listaProfessor.size(); j++) {
                    if (listaProfessor.get(j).getCodigo() == codigoProfessorTitular) {
                        if (listaProfessor.get(j) instanceof ProfessorTitular) {
                            listaCurso.get(i).setProfessorTitular(listaProfessor.get(j));
                        }
                    }
                }
                for (int j = 0; j < listaProfessor.size(); j++) {
                    if (listaProfessor.get(j).getCodigo() == codigoProfessorAdjunto) {
                        if (listaProfessor.get(j) instanceof ProfessorAdjunto) {
                            listaCurso.get(i).setProfessorAdjunto(listaProfessor.get(j));
                        }
                    }
                }
            }
        }
    }

    public ArrayList<Aluno> getListaTotalAluno() {
        return listaTotalAluno;
    }

    public void setListaTotalAluno(ArrayList<Aluno> listaTotalAluno) {
        this.listaTotalAluno = listaTotalAluno;
    }

    public ArrayList<Professor> getListaProfessor() {
        return listaProfessor;
    }

    public void setListaProfessor(ArrayList<Professor> listaProfessor) {
        this.listaProfessor = listaProfessor;
    }

    public ArrayList<Curso> getListaCurso() {
        return listaCurso;
    }

    public void setListaCurso(ArrayList<Curso> listaCurso) {
        this.listaCurso = listaCurso;
    }

    public ArrayList<Matricula> getListaMatricula() {
        return listaMatricula;
    }

    public void setListaMatricula(ArrayList<Matricula> listaMatricula) {
        this.listaMatricula = listaMatricula;
    }
}
