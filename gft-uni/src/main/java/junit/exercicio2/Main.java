package junit.exercicio2;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Vagao 01 = new Vagao(10000, 5000);
        Vagao 02 = new Vagao(10000, 5000);

        Caminhao 01 = new Caminhao(10000, 5000);
        Caminhao 02 = new Caminhao(10000, 5000);

        System.out.println(Vagao.calculaFrete());
    }
}
