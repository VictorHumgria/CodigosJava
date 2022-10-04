/*
    Criar uma classe CalculadoraMem que além das funções
    da Calculadora permite armazenar um valor na memória
    e tem as seguintes funções adicionais:
    • ArmazenaMemória, RecuperaMemória, Quociente e Resto
    • Faça um override do método limparDados, já que ele vai
    limpar todos os dados (incluindo a mémoria)
*/
public class CalculadoraMem extends Calculadora{
    private float valor3;
    public float getValor3() {
        return valor3;
    }
    public void setValor3(float valor3) {
        this.valor3 = valor3;
    }
    public CalculadoraMem() {
    }
    
    public void armazenarMem(float num){
        this.valor3 = num;
    }
    public void RecuperarMemoria(){
        super.limparDados();
        this.valor3 =0;
    }
    public float Quociente(float valor1, float valor2){
        return super.divisao(valor1, valor2);
    }
    public float resto(float valor1, float valor2){
        return valor1%valor2;
    }
}