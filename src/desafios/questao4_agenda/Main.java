package desafios.questao4_agenda;

public class Main {
    public static void main(String[] args) {
        Contato contato1 = new Contato(1, "9999-9999", 20);
        Contato contato2 = new Contato(2, "9999-9999", 19);
        Contato contato3 = new Contato(3, "9999-9999", 38);

        Agenda agenda = new Agenda();

        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);
        agenda.adicionarContato(contato2);

        agenda.removerContato(contato2);

        agenda.editarContato(contato3);
    }
}
