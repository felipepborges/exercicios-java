public class DivisaoNaoExataException extends Exception {

    private int num1;
    private int num2;

    public DivisaoNaoExataException(int num1, int num2) {
        super();
        this.num1 = num1;
        this.num2 = num2;
    }

    public String toString() {
        return "O resultado de " + num1 + "/" + num2 + " não é um número inteiro.";
    }
}
