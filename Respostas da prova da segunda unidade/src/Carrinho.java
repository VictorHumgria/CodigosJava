import java.util.ArrayList;

/*
    9) crie uma classe para simular a compra de produtos em um carrinho de compra. 
    Onde esse carrinho será um vetor ou arraylist que armazena objteos de tipo Produto. Simule armazenando objetos Celular e livro nesse carinho.
    10) Após a inserção dos protudos. Faça uma lógica que percorra o vetor ou arraylist executando o método ImprimirDescricao. 
    Como também imprima o método imprimirModelo se for um objeto do tipo Celular e o metodo ImprimirAutor se o objetos for do tipo Livro.
*/
public class Carrinho {
    private ArrayList<Produto> caixa = new ArrayList<Produto>();
    public void adicionar(Produto p){
        caixa.add(p);
        System.out.println("Produto Adicionado ao carrinho.");
    }
    public void imprimirLista(){
        for (Produto produto : caixa) {
            produto.imprimirDescricao();
            if(produto instanceof Celular){
            ((Celular)produto).imprimriModelo();
            }else if(produto instanceof Livro){
            ((Livro)produto).imprimirAutor();
            }else{
            throw new Error("Algo deu errado ao consultar a lista, por favor verificar os itens");
            }
        }
    }
}