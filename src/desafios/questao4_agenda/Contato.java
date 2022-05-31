package desafios.questao4_agenda;

public class Contato {

    private int codigo;
    private String telefone;
    private int idade;

    public Contato(int codigo, String telefone, int idade) {

        this.telefone = telefone;
        this.idade = idade;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "{" +
                "codigo=" + codigo +
                ", questao1_telefone='" + telefone + '\'' +
                ", idade=" + idade +
                '}';
    }
}
