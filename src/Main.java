import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Sorteia o numero aleatorio
        int numero = new Random().nextInt(100);
        System.out.println("O numero sorteado foi " + numero);

        // Bot com busca Binaria
        int limiteInferior = 0;
        int limiteSuperior = 99;
        int chute;
        int tentativas = 0;

        while(true){
            tentativas++;

            chute = limiteInferior + (limiteSuperior - limiteInferior) / 2;
            System.out.println("Tentativas #" + tentativas);
            System.out.println("Intervalo atual: [" + limiteInferior + ", " + limiteSuperior + "]");
            System.out.println("Chute: " + chute);

            if(chute  == numero){
                System.out.println("Sucesso o bot acertou");
                break;
            }else if(chute < numero){
                System.out.println("O numero é maior que " + chute);
                limiteInferior = chute + 1;
            }else{
                System.out.println("O numero é menor que " + chute);
                limiteSuperior = chute - 1;
            }
        }
        System.out.println("O bot encontrou o numero " + numero + " em " + tentativas + " tentativas");
    }
}