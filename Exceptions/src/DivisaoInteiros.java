public class DivisaoInteiros {

    public static void main(String[] args) {

        // Essa classe é só um exemplo para atilização de uma Exception criada. Ela não atende todas as considerações da divisão.
        // Poderíamos ter uma resposta incoerente se utilizássemos outros valores no vetor2 ( o número 1 ao invés do 2, por exemplo)

        int [] vetor1 = {10, 11, 21, 30, 50,20,30};
        int [] vetor2 = {2, 2, 2, 2, 2};

        for (int i = 0; i < vetor1.length; i++) {

            try {
                if (vetor1[i] % 2 != 0) {
                    throw new DivisaoNaoExataException(vetor1[i], vetor2[i]);
                }
                System.out.println(vetor1[i] + "/" + vetor2[i] + " = " + (vetor1[i] / vetor2[i]));
            }
            catch(ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExataException e){
                System.out.println("Erro");
                e.printStackTrace();
                    
            }

        }
    }

}
