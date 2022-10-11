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
    private double price;

    
    public Produto(String nome, double price) {
        this.nome = nome;
        this.price = price;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    /*public void calcularImposto(double price){
        if(price < 100){
            setPrice(price+price*(5/100));
        }
        else{
            setPrice(price + price*(10/100));
        }
    }*/
    public void exibirRelatorio(){
        System.out.println("Nome: "+getNome());
        System.out.println("Preço: "+getPrice());
    }
    
    
}