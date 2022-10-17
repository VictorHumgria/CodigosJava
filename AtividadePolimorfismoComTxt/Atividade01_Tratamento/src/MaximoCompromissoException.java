
public class MaximoCompromissoException extends Exception {
    public String mensagem;
    public MaximoCompromissoException(){
        this.mensagem = "Numero maximos de compromissos atingido.";
    }
}