/*
    6)Crie a classe livro que herda de Produto com o atributo "autor" com get e set.
    No construtor passe por parâmetro além de nome, preço, e descricao, também o "autor" para ser atribuido ao atributo autor.
    7) crie na classe livro um método imprimirAutor que imprimo o atributo autor.
    8) crie na classe livro um método imprimirDescricao que imprime o atributo "descricao" concatenado com o atributo autor.
*/
public class Livro extends Produto {
    private String autor;

    public Livro(String nome, double preco, String descricao, String autor) {
        super(nome, preco, descricao);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void imprimirAutor(){
        System.out.println("Autor: "+getAutor());
    }
    public void imprimirDescricao(){
        System.out.println("Descricao: "+descricao+"Autor: "+getAutor());
    }
    
}