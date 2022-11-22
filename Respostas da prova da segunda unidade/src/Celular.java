/*
    3)Crie a classe Celular que herda de Produto com o atributo "modelo" com get e set. 
    No construtor passe por parâmetro além do nome, preço e descricao, também o "modelo" para ser atribuido ao atributo modelo.
    4)crie na classe celular um método imprimriModelo que imprimo o atributo modelo.
    5)Crie na classe celular um método imprimirDescricao que imprime o atributo "descricao" concatenado com o atributo modelo.
*/
public class Celular extends Produto {
    private String modelo;

    public Celular(String nome, double preco, String descricao, String modelo) {
        super(nome, preco, descricao);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void imprimriModelo(){
        System.out.println("Modelo: "+getModelo());
    }
    public void imprimirDescricao(){
        System.out.println("Descricao: "+descricao+"Modelo: "+getModelo());
    }
    
    

    
    
}