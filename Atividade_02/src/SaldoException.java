
public class SaldoException extends Exception {
    public String mensagem;
    public SaldoException(){
        this.mensagem = "Saldo insuficiente ou transação não autorizada";
    }
}