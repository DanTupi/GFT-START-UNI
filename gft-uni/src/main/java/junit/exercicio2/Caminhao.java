package junit.exercicio2;

public class Caminhao extends Carga implements Transporte {

    public Caminhao(double valor, double peso) {
        super(valor, peso);
    }

    @Override
    public Double calculaFrete() {
        return ((getPeso() * 0.12) + (getValor() * 0.30));
    }
}
