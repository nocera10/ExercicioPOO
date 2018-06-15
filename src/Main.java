import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Instanciar DHManager aqui:
        DHManager dhm = new DHManager();

        //Cadastrar Professores Titulares na dhm aqui:
        dhm.registrarProfessorTitular("Victor1", "Caldas", 100, "Full Stack");
        dhm.registrarProfessorTitular("Victor2", "Caldas", 101, "Android");

        //Cadastrar Professores Adjuntos na dhm aqui:
        dhm.registrarProfessorAdjunto("Romario1", "Gol", 200, 10);
        dhm.registrarProfessorAdjunto("Romario2", "Gol", 201, 20);

        //Cadastrar Cursos na dhm aqui:
        dhm.registrarCurso("Full Stack", 100, 3);
        dhm.registrarCurso("Android", 101, 2);

        //Cadastrar Alunos na dhm aqui:
        dhm.cadastrarAluno("A", "A", 10000);
        dhm.cadastrarAluno("B", "B", 10001);
        dhm.cadastrarAluno("C", "C", 10002);
        dhm.cadastrarAluno("D", "D", 10003);
        dhm.cadastrarAluno("E", "E", 10004);
        dhm.cadastrarAluno("F", "F", 10005);
        dhm.cadastrarAluno("G", "G", 10006);
        dhm.cadastrarAluno("H", "H", 10007);
        dhm.cadastrarAluno("I", "I", 10008);

        //Alocar Professores nos cursos aqui:
        dhm.alocarProfessores(100, 100,200);
        dhm.alocarProfessores(101, 101,201);

        //Matricular Alunos no curso "Full Stack"(codigoCurso = 100) aqui:
        dhm.matricularAluno(10000, 100);
        dhm.matricularAluno(10001, 100);

        //Matricular Alunos no curso "Android"(codigoCurso = 101) aqui:
        dhm.matricularAluno(10002, 101);
        dhm.matricularAluno(10003,101);
        dhm.matricularAluno(10004,101);
        dhm.matricularAluno(10005,101);
        dhm.matricularAluno(10006,101);
        dhm.matricularAluno(10007,101);
    }
}
