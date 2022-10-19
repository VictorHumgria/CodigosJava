import java.util.ArrayList;

/*
    Crie uma classe Agenda que permite marcar os diversos
    compromissos em um determinado dia.
    • A classe Agenda é composta dos seguintes métodos:
    public Agenda(int qtdMaximo);
    public marcarCompromisso(Compromisso comp)
    throws ChoqueException, MaximoCompromissoException;
    public desmarcarCompromisso(String assunto);
    public imprimir();
*/
public class Agenda  {
    private int qtdMaxima;
    private ArrayList<Compromisso> c = new  ArrayList<Compromisso>();
    
    public int getQtdMaxima() {
        return qtdMaxima;
    }

    public void setQtdMaxima(int qtdMaxima) {
        this.qtdMaxima = qtdMaxima;
    }

    public Agenda(int qtdMaxima) {
        this.qtdMaxima = qtdMaxima;
    }

    public void marcarCompromisso(Compromisso comp) throws MaximoCompromissoException, ChoqueException{
        for(int i=comp.getHorarioIn(); i<comp.getHorarioIn()+comp.getDuracao()-1;i++){ // logia que calcula o intervalor de tempo para definir se o compromisso ira ou não ser marcado 
            for (Compromisso agendaPrincipal : c) {                                    //pegando o inicio + duração = intervalor que estará ocupado
                if(i>=agendaPrincipal.getHorarioIn() && i<=agendaPrincipal.getHorarioIn()+agendaPrincipal.getDuracao()-1){
                    throw new ChoqueException("Choque de compromissos!!!");
                }
            }
        }
        if(c.size()>qtdMaxima-1){
            throw new MaximoCompromissoException("Maximo de compromissos agendados.");
        }else{
            this.c.add(comp);
            System.out.println("Compromisso marcado com sucesso!!!");
        }
}
    public void desmarcarCompromisso(String assunto){
        for (int i=0; i<c.size();) {
            if(c.get(i).getAssunto().equalsIgnoreCase(assunto)){
                c.remove(i);
                System.out.println("Compromisso desmarcado!!!");
                return;
            }else{
                System.out.println("Compromisso("+assunto+")"+"não encontrado.");
                return;
            }
        }
    }
    public void imprimir(){
        System.out.println("Dados dos compromissos: ");
        for (Compromisso c : c) {
            System.out.println("Assunto: "+c.getAssunto());
            System.out.println("Horario: "+c.getHorarioIn());
            System.out.println("Duração:"+c.getDuracao());
            System.out.println("----------------------------");
        }
    }
    
}