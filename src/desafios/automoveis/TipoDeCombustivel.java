package desafios.automoveis;

public class TipoDeCombustivel {

    public void tipoDeCombustivel(Automovel automovel){

        if(automovel instanceof Esportivo) {
            System.out.println("Gasolina");
        } else if (automovel instanceof Caminhao) {
            System.out.println("Disel");
        }
    }
}
