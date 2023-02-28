
public class Partida {

    private GeradorAleatorio gerador;


    public Partida(Time equipe1, Time equipe2){

        this.gerador = new GeradorAleatorio();
        
        if (gerador.getNumero1() > gerador.getNumero2()){
            equipe1.setVitorias(1);
            equipe2.setDerrotas(1);
            equipe1.setPontos(3);
            System.out.println(equipe1.getNome() + " Venceu a Partida contra " + equipe2.getNome());
            System.out.println(gerador.getNumero1() + " x " + gerador.getNumero2());

        }else{
            equipe2.setVitorias(1);
            equipe1.setDerrotas(1);
            equipe2.setPontos(3);
            System.out.println(equipe2.getNome() + " Venceu a Partida contra " + equipe1.getNome());
            System.out.println(gerador.getNumero1() + " x " + gerador.getNumero2());
        }  
    }

    
}
