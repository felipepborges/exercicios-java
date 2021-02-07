import java.text.DecimalFormat;

public class ExceptionExample {

    DecimalFormat df = new DecimalFormat("#,###.00");

    private double [] vetor1, vetor2;

    public void divide(double [] vetor1, double [] vetor2){
        this.vetor1 = vetor1;
        this.vetor2 = vetor2;

        for(int i=0; i < vetor1.length; i++) {

            try {
                System.out.println(vetor1[i] + " / " + vetor2[i] + " = " + df.format(vetor1[i] / vetor2[i]));
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        System.out.println("\n");
    }

}
