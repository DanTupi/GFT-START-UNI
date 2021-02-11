package junit.exercicio2;

import junit.exercicio2.Transporte;

public class Vagao extends Carga implements Transporte {

    @Override
    public Double calculaFrete() {
        return this.peso * 0.20 + this.valor * 0.10;
    }
}
