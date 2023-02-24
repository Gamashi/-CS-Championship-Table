import java.util.Scanner;
import java.util.ArrayList;

public class Campeonato {

    private Scanner sc;
    private ArrayList <Time> equipes;
    private Partida partida;

    public Campeonato(){

        sc = new Scanner(System.in);
        equipes = new ArrayList<Time>();

        for (int i = 1; i <= 2; i++){

            System.out.println("Digite o nome do time " + i + ": ");
            Time time = new Time(this.sc.nextLine());
            equipes.add(time);
            System.out.println(time.getNome());
    
        }
    }

    public void Inicio(){

        for (int i = 0; i < equipes.size(); i+= 2){
            Time time1 = equipes.get(i);
            Time time2 = equipes.get(i+1);
            partida = new Partida(time1, time2);
            
        }
    }
}
