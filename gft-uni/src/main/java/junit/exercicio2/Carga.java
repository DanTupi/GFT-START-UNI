package junit.exercicio2;

public abstract class Carga {
    private double valor;
    private double peso;

    Carga() {

    }

    Carga(double valor, double peso) {
        setValor(valor);
        setPeso(peso);

    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
