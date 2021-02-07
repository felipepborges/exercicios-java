import java.text.DecimalFormat;

public class CatchTryExample {

    DecimalFormat df = new DecimalFormat("#,###.00");

    private double [] vetor1, vetor2;

    public void divide(double [] vetor1, double [] vetor2){
        this.vetor1 = vetor1;
        this.vetor2 = vetor2;

        for(int i=0; i < vetor1.length; i++){

            try {
                System.out.println(vetor1[i] + " / " + vetor2[i] + " = " + df.format(vetor1[i] / vetor2[i]));
            }
            /*
            catch (Throwable e){    // A classe Throwable testa todas as exceções
            } */

            catch(ArithmeticException e){
                System.out.println("Erro: não é possível realizar essa operação.");
                // System.exit(0);  // Nesse o caso o programa termina aqui e o restante não é executado
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Erro: posição do array inválida.");
                // System.exit(0); // Nesse caso o programa termina aqui e o restante não é executado
            }
            /*
            finally {
                System.out.println("Se utilizar o finally, ele sempre será executado após o try ou catch.");
            }
            **/
        }
        System.out.println("\n");
    }

}
