public class Professor {

    private String nome;
    private String sobrenome;
    private int tempoDeCasa;
    private int codigo;

    public Professor(String nome, String sobrenome, int tempoDeCasa, int codigo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tempoDeCasa = tempoDeCasa;
        this.codigo = codigo;
    }

    public Professor(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(int tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
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
        } else if (!(obj instanceof Professor)) {
            return false;
        } else {
            return this.getCodigo() == ((Professor)obj).getCodigo();
        }
    }
}
