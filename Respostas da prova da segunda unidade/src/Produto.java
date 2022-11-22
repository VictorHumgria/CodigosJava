public class Produto {
    private String nome;
    private double preco;
    protected String descricao = "Produto de loja";

    
    public Produto(String nome, double preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
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
    public void imprimirDescricao(){
        System.out.println(descricao);
    }
    
}