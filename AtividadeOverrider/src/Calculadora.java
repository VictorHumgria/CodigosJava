/*Criar uma classe Calculadora que permite armazenar
dois números inteiros
• A classe possui os seguintes métodos:
• Soma, Subtração, Multiplicação, Divisão e LimparDados
• setValor1, setValor2, getValor1, getValor2*/

public class Calculadora {
    private float valor1;     private float valor2;
    private float total;
    public float getTotal() {
        return total;
    }
    public void setTotal(float total) {
        this.total = total;
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
    public String soma(float valor1, float valor2){
        this.total =valor1 + valor2;
        System.out.println("O total da soma de"+valor1 +"+"+valor2+"= "+this.total);
        String conteudo= "SOMA:"+valor1+"+"+valor2+"="+this.total;
        return conteudo;
    }
    public String  subtracao(float valor1, float valor2){
        this.total =valor1 - valor2;
        System.out.println("O total da subtração de "+valor1 +"-"+valor2+"= "+this.total);
        String conteudo= "SUBTRAÇÃO:"+valor1+"-"+valor2+"="+this.total;
        return conteudo;

    }
    public String multiplicacao(float valor1, float valor2){
        this.total =valor1 * valor2;
        System.out.println("O total da multiplicação de "+valor1 +"X"+valor2+"= "+this.total);
        String conteudo= "Multiplicação:"+valor1+"X"+valor2+"="+this.total;
        return conteudo;
    }
    public String divisao(float valor1, float valor2){
        this.total =valor1 / valor2;
        System.out.println("O total da divisão de "+valor1 +"/"+valor2+"= "+this.total);
        String conteudo= "DIVISÃO:"+valor1+"/"+valor2+"="+this.total;
        return conteudo;

    }
    public void limparDados(){
        this.valor1 = 0;
        this.valor2 = 0;
    }
}
