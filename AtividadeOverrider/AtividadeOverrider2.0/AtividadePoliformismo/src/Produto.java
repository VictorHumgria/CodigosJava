/*
    Construir uma classe Produto para representar um produto com os
    seguintes dados: nome e preço. Além dos construtores e métodos get
    e set para cada atributo, faça um método para calcular o imposto (
    CalcularImposto() ) e um método para exibir um relatório (
    ExibirRelatório() ), o qual exibe o nome do produto, o preço e o
    imposto pago.
    • O imposto do produto deve ser calculado da seguinte maneira: se o
    preço for menor que R$ 100,00 o imposto é de 5%, se for maior que
    R$ 100,00 o imposto é de 10%.
*/
public class Produto {
    private String nome;
    private float preco;
    protected float valorImposto;
    protected int tipo =0;
    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public float getValorImposto() {
        return valorImposto;
    }
    public void setValorImposto(float valorImposto) {
        this.valorImposto = valorImposto;
    }
    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public void calcularImposto(float valor){
        if(valor < 100 ){
            setValorImposto(valor + valor*5 /100);
        }else{
            setValorImposto(valor + valor*10 /100);
        }
    }
    public void exibirRelatorio(){
        System.out.println("Dados do produtos: \n");
        System.out.println("Nome: "+getNome());
        System.out.println("Preço: "+getPreco());
        System.out.println("Preço com imposto: "+getValorImposto());
    }
    
}