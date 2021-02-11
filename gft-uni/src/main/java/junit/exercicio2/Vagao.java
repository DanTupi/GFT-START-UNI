package junit.exercicio2;

public class Vagao extends Carga implements Transporte {

    public Vagao(double valor, double peso) {
        super(valor, peso);
    }

    @Override
    public Double calculaFrete() {
        return ((getPeso() * 0.20) + (getValor() * 0.10));
    }
}
