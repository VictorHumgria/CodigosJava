import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
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
    private ArrayList<Produto> list = new ArrayList<Produto>();
    private Path arquivo = Path.of("C:/Users/Victor/Documents/FACU/4P/PROG 3/Codigos/AtividadePolimorfismoComTxt/listaProduto.txt");
    public ListaProdutos() {
    }
    public void insereProdurto(Produto p1){
        if(Files.notExists(arquivo)){
            try {
                Files.createFile(arquivo);
            } catch (IOException e) {
                System.out.println("ERROR!!!\nCriação do arquivo");
                e.printStackTrace();
            }
        }else{
        if(list.size()>10){
            System.out.println("ERROR!!!\nNúmero máximo de resgistro atingidos!!!");
        }else{
            list.add(p1);
            try {
                FileWriter escritor = new FileWriter("C:/Users/Victor/Documents/FACU/4P/PROG 3/Codigos/AtividadePolimorfismoComTxt/listaProduto.txt",true);
                if(p1 instanceof ProdutoImportado ){
                escritor.write("Nome: "+p1.getNome()+"\n");
                escritor.write("Preço: "+p1.getPrice()+"\n");
                //escritor.write("Preço com imposto: "+((ProdutoImportado)p1).calcularImposto(p1.getPrice(), ((ProdutoImportado)p1).getTipo())+"\n");
                escritor.write("Tipo: " +((ProdutoImportado)p1).getTipo()+"\n");
                escritor.write("-------------------------------+"+"\n");
                escritor.close();
            }else{
                escritor.write("Nome: "+p1.getNome()+"\n");
                escritor.write("Preço: "+p1.getPrice()+"\n");
                //escritor.write("Preço com imposto: "+p1.calcularImposto(p1.getPrice())+"\n");
                escritor.write("-------------------------------"+"\n");
                escritor.close();
            }
            } catch (IOException e) {
                System.out.println("ERROR!!! F: insereProdurto()");
                e.printStackTrace();
            }
            System.out.println("Produto adicionado com sucesso!!!\n");
        }
    }
}
    public void imprimirProdutos(){
        ArrayList<ProdutoImportado> imp = new ArrayList<ProdutoImportado>();
        ArrayList<Produto> nac = new ArrayList<Produto>();
        for(int i=0; i<list.size(); i++){
            if(list.get(i) instanceof ProdutoImportado){
                imp.add(((ProdutoImportado)list.get(i)));
            }else{
                nac.add(list.get(i));
            }
        }
        System.out.println("Produto Nacionais;");
        for (Produto produto : nac) {
            produto.exibirRelatorio();
        }
        System.out.println("-------------------------------\n");
        System.out.println("Produtos Importados");
        for (ProdutoImportado produtoI : imp) {
            produtoI.exibirRelatorio();
        }
        System.out.println("-------------------------------\n");
        
    }
    public void imprimirHistorico(){
        System.out.println("HISTORIO DE PRODUTOS:");
        try {
           FileReader lerTxt = new FileReader("C:/Users/Victor/Documents/FACU/4P/PROG 3/Codigos/AtividadePolimorfismoComTxt/listaProduto.txt");
           BufferedReader txt = new BufferedReader(lerTxt);
           String texto = txt.readLine();
        while(texto != null){
            System.out.println(texto);
            texto = txt.readLine();
        }
        txt.close();
        } catch (IOException e) {
            System.out.println("ERROR!!! F: imprimirHistorico();");
            e.printStackTrace();
        }
    }
}