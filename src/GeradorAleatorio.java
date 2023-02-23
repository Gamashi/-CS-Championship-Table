import java.util.Random;

public class GeradorAleatorio {

    private int limitesup = 3;
    private int limiteinf = 1;
    private int numero1;
    private int numero2;

    public GeradorAleatorio(){

        Random gerador = new Random();
            numero1 = gerador.nextInt(limitesup - limiteinf) + limiteinf;
            numero2 = gerador.nextInt(limitesup - limiteinf) + limiteinf;
    
        while (numero1 == numero2){
             numero2 = gerador.nextInt(limitesup - limiteinf) + limiteinf;
             
            
        }

        // System.out.println(numero1);
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }
}

