import java.util.ArrayList;


public class Equipes {

    private ArrayList<Time> vencedores;
    private ArrayList<Time> perdedores;


    private Partida partida;

    public Equipes(){


        vencedores = new ArrayList<Time>();
        perdedores = new ArrayList<Time>();


    }

    public void Seleciona(ArrayList<Time> lista){

        for (int i = 0; i < lista.size(); i+= 2){
            Time time1 = lista.get(i);
            Time time2 = lista.get(i+1);
            partida = new Partida(time1, time2);

            if(time1.getVitorias() > time2.getVitorias()){

                vencedores.add(time1);
                perdedores.add(time2);

            }else{
                vencedores.add(time2);
                perdedores.add(time1);
                }
        }
    }


    public ArrayList<Time> getVencedores() {
        return vencedores;
    }

    public ArrayList<Time> getPerdedores() {
        return perdedores;
    }
    
}
