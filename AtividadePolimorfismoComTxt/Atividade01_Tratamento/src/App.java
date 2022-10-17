public class App {
    public static void main(String[] args){
        Agenda a = new Agenda(3);
        Compromisso c1 = new Compromisso("Facu", 1200, 30);
        Compromisso c2 = new Compromisso("Escola", 1300, 15);
        Compromisso c3 = new Compromisso("Trabalho", 800, 8);
        Compromisso c4 = new Compromisso("Trabalho", 800, 8); 
        try {
            a.marcarCompromisso(c1);
        } catch (MaximoCompromissoException e) {
            System.out.println("Erro: "+e.mensagem);
            
        } catch (ChoqueException e) {
            System.out.println("Erro: "+e.mensagem);
            
        }try {
            a.marcarCompromisso(c2);
        } catch (MaximoCompromissoException e) {
            System.out.println("Erro: "+e.mensagem);
            
        } catch (ChoqueException e) {
            System.out.println("Erro: "+e.mensagem);

        }
        try {
            a.marcarCompromisso(c3);
        } catch (MaximoCompromissoException e) {
            System.out.println("Erro: "+e.mensagem);
        } catch (ChoqueException e) {
            System.out.println("Erro: "+e.mensagem);
            
        }
        try {
            a.marcarCompromisso(c4);
        } catch (MaximoCompromissoException e) {
            System.out.println("Erro: "+e.mensagem);
        } catch (ChoqueException e) {
            System.out.println("Erro: "+e.mensagem);

        }
    }
    
}
