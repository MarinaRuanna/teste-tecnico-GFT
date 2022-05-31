package desafios.agenda;
import java.util.ArrayList;
import java.util.List;
import desafios.agenda.Contato;
public class Agenda  {
    public static List<Contato> contatos = new ArrayList<>();

    public Agenda() {
    }

    public void adicionarContato(Contato contato) {
        if (!contatos.contains(contato))
             contatos.add(contato);
    }

    public void editarContato(Contato contato) {
        if(contato == null){
            throw new IllegalArgumentException("Contato inválido");
        }
        int index = contatos.indexOf(contato);
        if(index > -1){
            contatos.add(index, contato);
        }
    }

    public void removerContato(Contato contato) {
        contatos.remove(contato);
    }


}
