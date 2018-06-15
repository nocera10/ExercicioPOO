public class ProfessorTitular extends Professor {

    private String especialidade;

    public ProfessorTitular(String nome, String sobrenome, int tempoDeCasa, int codigo, String especialidade) {
        super(nome, sobrenome, tempoDeCasa, codigo);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
