import java.util.ArrayList;

/*
    • Faça uma classe ListaProdutos que vai guardar um conjunto de
    produtos num array (Produtos[] p) que tem tamanho máximo de 10
    elementos. A classe ListaProdutos tem os seguintes métodos:
    • ListaProdutos(): construtor para inicializar as variáveis e criar o array
    de produtos
    • InsereProduto(Produto p): insere um produto no array
    • ImprimirProdutos(): exibe todos os produtos armazenados separando
    os produtos nacionais dos importados

*/
public class ListaProdutos {
    private ArrayList<Produto> pro = new ArrayList<>();
    public ListaProdutos() {
    }

    public void insereProduto(ProdutoImportado p1){
        p1.calcularImposto(p1.getValorImposto());
        pro.add(p1);
        System.out.println("Produto adicionado com sucesso!!!\n");
    }
    public void insereProduto(Produto p2){
        p2.calcularImposto(p2.getPreco());
        pro.add(p2);
        System.out.println("Produto adicionado com sucesso!!!\n");
    }
    public void imprimirProdutos(){
        System.out.println("---Produtos Nacionais:---\n");
        int i=0;
        while( i != pro.size()){
            for( i=0; i<pro.size(); i++){
                if(pro.get(i).getTipo() == 0){
                    pro.get(i).exibirRelatorio();
                }
            }
            System.out.println("---Produtos Importados:---\n");
            for( i=0; i<pro.size(); i++){
                if(pro.get(i).getTipo()>0 && pro.get(i).getTipo()<3){
                    pro.get(i).exibirRelatorio();
                }
            }
        }
        
    }
}