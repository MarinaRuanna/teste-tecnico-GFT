package desafios.questao3_automoveis;

public class Main {
    public static void main(String[] args) {

        Caminhao caminhao = new Caminhao(500d);
        Esportivo esportivo = new Esportivo(500);

        tipoDeCombustivel(caminhao);
        tipoDeCombustivel(esportivo);

    }

    public static void tipoDeCombustivel(Automovel automovel){

        if(automovel instanceof Esportivo) {
            System.out.println("Gasolina");
        } else if (automovel instanceof Caminhao) {
            System.out.println("Disel");
        }
    }

}
