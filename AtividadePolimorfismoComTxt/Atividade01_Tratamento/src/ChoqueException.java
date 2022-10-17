
public class ChoqueException extends Exception {
    public String mensagem;
    public ChoqueException() {
        this.mensagem = "Ja existe um compromisso marcado para este dia. Por favor verificar sua agenda";
    }
    
}