public class ProfessorAdjunto extends Professor {

    private int horasMonitoria;

    public ProfessorAdjunto(String nome, String sobrenome, int tempoDeCasa, int codigo, int horasMonitoria) {
        super(nome, sobrenome, tempoDeCasa, codigo);
        this.horasMonitoria = horasMonitoria;
    }

    public int getHorasMonitoria() {
        return horasMonitoria;
    }

    public void setHorasMonitoria(int horasMonitoria) {
        this.horasMonitoria = horasMonitoria;
    }
}
