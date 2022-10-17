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
    
    public Agenda(int qtdMaxima) {
        this.qtdMaxima = qtdMaxima;
    }

    public void marcarCompromisso(Compromisso comp) throws MaximoCompromissoException, ChoqueException{
        int key = 0;
        for(int i=0; i<c.size();i++){
            if(c.get(i).getAssunto().equals(comp.getAssunto())){
                key++;
            }
        }
        if(c.size()>qtdMaxima-1){
            throw new MaximoCompromissoException();
        }
        if(key>0){
            throw new ChoqueException();
        }
        else{
            c.add(comp);
            System.out.println("Compromisso marcado com sucesso..");
        }

    }
    public void descarmarCompromisso(String assunto){
        for (int i=0; i<0; i++) {
            if(c.get(i).getAssunto().equals(assunto)){
                c.remove(i);
                System.out.println("Compromisso desmarcado.");
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