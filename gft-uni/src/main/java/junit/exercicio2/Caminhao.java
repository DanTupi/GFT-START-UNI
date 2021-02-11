package junit.exercicio2;

import junit.exercicio2.Transporte;

public class Caminhao extends Carga implements Transporte {

    @Override
    public Double calculaFrete() {
        return this.peso * 0.12 + this.valor * 0.30;
    }
}
