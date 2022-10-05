import java.util.ArrayList;
/*
    Faça uma classe ListaProdutos que vai guardar um conjunto de
    produtos num array (Produtos[] p) que tem tamanho máximo de 10
    elementos. A classe ListaProdutos tem os seguintes métodos:
    • ListaProdutos(): construtor para inicializar as variáveis e criar o array
    de produtos
    • InsereProduto(Produto p): insere um produto no array
    • ImprimirProdutos(): exibe todos os produtos armazenados separando
    os produtos nacionais dos importados
 */
public class ListaProdutos{
    
    private ArrayList<Produto> pro = new ArrayList<Produto>();
    public ListaProdutos() {  }

    public void insereProduto(Produto p){
        if(pro.size() <= 10 ){
        pro.add(p);
        System.out.println("Produto Adicionado com sucesso!!");
        }
        else{
            System.out.println("CAPACIDADE MAXIMA ATINGIDA!!!!");
        }
    }

    public void ImprimirProdutos(){
        ArrayList<Produto> proImp = new ArrayList<>();
        ArrayList<Produto> proNac = new ArrayList<>();
        for (int i=0; i<pro.size(); i++) {
            if(pro.get(i) instanceof ProdutoImportado){
                proImp.add(pro.get(i));
            }else{
                proNac.add(pro.get(i));
            }
        }
        System.out.println("\nLista produtos importados: ");
        for(int i=0; i<proImp.size();i++){
            proImp.get(i).exibirRelatorio();
        }
        System.out.println("--------------------------------");
        System.out.println("Lista de produtos nacionais:");
        for(int i=0; i<proNac.size();i++){
            proNac.get(i).exibirRelatorio();
        }
        System.out.println("-------------------------------");
    }


    
    
}