import desafios.agenda.Agenda;
import desafios.agenda.Contato;
import desafios.automoveis.Automovel;
import desafios.automoveis.Caminhao;
import desafios.automoveis.Esportivo;

import static desafios.TiposDeTriangulos.tiposDeTriangulo;

public class Main {
    public static void main(String[] args) {



        // Questão 2:
        tiposDeTriangulo();

        // Questão 3:

        Caminhao caminhao = new Caminhao(500d);
        Esportivo esportivo = new Esportivo(500);

        tipoDeCombustivel(caminhao);
        tipoDeCombustivel(esportivo);

        // Questão 4:
        Contato contato1 = new Contato(1, "9999-9999", 20);
        Contato contato2 = new Contato(2, "9999-9999", 19);
        Contato contato3 = new Contato(3, "9999-9999", 38);

        Agenda agenda = new Agenda();

        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);
        agenda.adicionarContato(contato2);

    }

    public static void tipoDeCombustivel(Automovel automovel){

        if(automovel instanceof Esportivo) {
            System.out.println("Gasolina");
        } else if (automovel instanceof Caminhao) {
            System.out.println("Disel");
        }
    }








}
