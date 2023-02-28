import java.util.ArrayList;
import java.util.Scanner;

public class Campeonato {


    // private Listas lista;
    private Equipes formato;
    private int QuantidadeEquipes = 6;
    private Scanner sc;
    private ArrayList <Time> equipes;

    public Campeonato(){

        formato = new Equipes();
        sc = new Scanner(System.in);
        equipes = new ArrayList<Time>();

        for (int i = 1; i <= QuantidadeEquipes; i++){

            System.out.println("Digite o nome do time " + i + ": ");
            Time time = new Time(this.sc.nextLine());
            equipes.add(time);
            System.out.println(time.getNome());
    
        }
    }

    public void Inicio(){
       formato.Seleciona(equipes);
       System.out.println("Ini dos vencedores");
       formato.Seleciona(formato.getPerdedores());

    }

}