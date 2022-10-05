/*
   • Construir uma classe Produto para representar um produto com os
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
    private double preco;
    
    
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double calcularImposto(double preco){
        if(preco <=100){
            return preco + preco* 0.05;
        }else if(preco > 100){
            return preco + preco * 0.10;
        }else{
            return 0;
        }
    }
    public void exibirRelatorio(){
        System.out.println("Nome: "+getNome());
        System.out.println("Preço: "+getPreco());
        System.out.println("Preço com imposto: "+calcularImposto(getPreco()));
    }
}