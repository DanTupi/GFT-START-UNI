package junit.exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Double number1, number2;

        Scanner input = new Scanner(System.in);

        System.out.println("Por favor informe o valor:");
        number1 = Double.parseDouble(input.next());
        System.out.println("Por favor informe o peso:");
        number2 = Double.parseDouble(input.next());

        Vagao newVagao = new Vagao(number1, number2);
        Caminhao newCaminhao = new Caminhao(number1, number2);

        System.out.println(
                "Frete de Vagão: $" + newVagao.calculaFrete() + "Frete de Caminhão: $" + newCaminhao.calculaFrete());

    }
}
