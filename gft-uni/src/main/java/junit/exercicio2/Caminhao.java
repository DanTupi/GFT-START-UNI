package junit.exercicio2;

public class Caminhao extends Carga implements Transporte {

    public Caminhao(double valor, double peso) {
        super(valor, peso);
    }

    @Override
    public Double calculaFrete() {
        if (getValor() > 40000) {
            return (((getPeso() * 0.12) + (getValor() * 0.30)) * (1 - 0.25));
        }
        return ((getPeso() * 0.12) + (getValor() * 0.30));
    }
}
