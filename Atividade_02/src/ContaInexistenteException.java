
public class ContaInexistenteException extends Exception {
    public String mensagem;
    public ContaInexistenteException(){
        this.mensagem ="Conta Inexistente.";
    }
}