import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;

/*Criar uma classe CalculadoraMem que além das funções
da Calculadora permite armazenar um valor na memória
e tem as seguintes funções adicionais:
• ArmazenaMemória, RecuperaMemória, Quociente e Resto
• Faça um override do método limparDados, já que ele vai
limpar todos os dados (incluindo a mémoria)*/

public class CalculadoraMem extends Calculadora{
    protected float valor3;

    public float getValor3() {
        return valor3;
    }
    public void setValor3(float valor3) {
        this.valor3 = valor3;
    }
    public CalculadoraMem() {// contructor para usar as funções
    }

    private  Path arquivo = Path.of("C:/Users/Victor/Documents/FACU/4P/PROG 3/Codigos/AtividadeOverrider/src/texto.txt");
    private int indice=0;
    public void armazenarMemoria(String conteudo){
       valor3 =  super.getTotal();
       try {
        if(Files.notExists(arquivo)){
            System.out.println("Arquivo inexistente, mas foi criado agora.");
            Files.createFile(arquivo);
        }
        FileWriter escritor = new FileWriter("C:/Users/Victor/Documents/FACU/4P/PROG 3/Codigos/AtividadeOverrider/src/texto.txt",true);
        escritor.write(conteudo+valor3+"\n");
        escritor.close();
       } catch (Exception exception) { // caso ocorra alguma erro exibe a mesagem com a função de deu o erro.
       System.out.println("\n\nDEU MERDA NO ARQUIVO!!! F:armazenarMemoria();");
       }
    }
    public void recuperarMemoria(){
        try {
            if(Files.notExists(arquivo)){// verifica se o arquivo existe, se não existir imprime a mensagem.
                System.out.println("Arquivo Inexistente.");
            }
            List<String>  linhas = Files.readAllLines(arquivo);// comando que ler todas as linhas e armazena em uma List.
            System.out.println("------------Conteudo Armazenado:-------------- \n");
            for (String line : linhas) {
                System.out.println(line);
            }
            System.out.println("\n\n-----------FIM DO DOCUMENTO----------------");
        } catch (IOException e) {// caso ocorra alguma erro exibe a mesagem com a função de deu o erro.
           if(Files.exists(arquivo) && indice==0){
            System.out.println("DEU MERDA!!! F: recuperarMemoria();");
           }
        }
         
    }
    public void limparDados(){// usando o overrider.
        super.limparDados();
        valor3 =0;
        indice++;// este indice indica se a opção já foi escolhida e se sim previne que entre no catch da função recuperarMemoria();
        try {
            if(Files.notExists(arquivo)){ // verificar se o arquivo existe e da uma mensagem caso não exista.
                System.out.println("Arquivo Inexistente.");
            }
            Files.delete(arquivo);// deleta o arquivos no destino setado no Path arquivo.
        } catch (Exception e) {// caso ocorra alguma erro exibe a mesagem com a função de deu o erro.
            System.out.println("DEU MERDA!!! F: LimparDados;"); // caso de alguma erro exibe a mensagem com a função do erro;
        }
    }
    public String quociente_Resto(float valor1, float valor2){
        valor3 = valor1 / valor2; // quociente da função;
        float resto = valor1%valor2; // pega o resto da função;
        System.out.println("Quociente: total:"+valor3);
        System.out.println("Resto: "+resto);
        return super.divisao(valor1, valor2);// geral a string que sera usada para ser salva no documento.
    }

}