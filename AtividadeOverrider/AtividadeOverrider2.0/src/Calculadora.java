/*
    Criar uma classe Calculadora que permite armazenar
    dois números inteiros
    • A classe possui os seguintes métodos:
    • Soma, Subtração, Multiplicação, Divisão e LimparDados
    • setValor1, setValor2, getValor1, getValor2
*/
public class Calculadora {
    private float valor1;
    private float valor2;

    public Calculadora() {
    }
    public float getValor1() {
        return valor1;
    }
    public void setValor1(float valor1) {
        this.valor1 = valor1;
    }
    public float getValor2() {
        return valor2;
    }
    public void setValor2(float valor2) {
        this.valor2 = valor2;
    }
    public float soma(float valor1, float valor2){
        return valor1+valor2;
    }
    public float subtracao(float valor1, float valor2){
        return valor1-valor2;
    }
    public float divisao(float valor1, float valor2){
        return valor1/valor2;
    }
    public float multiplicacao(float valor1, float valor2){
        return valor1*valor2;
    }
    public void limparDados(){
        this.valor1 =0;
        this.valor2 =0;

    }
}