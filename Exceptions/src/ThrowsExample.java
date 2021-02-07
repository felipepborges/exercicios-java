import java.util.Scanner;

public class ThrowsExample {

    public static void main(String[] args) {

        System.out.println("Digite um número: ");
        try{
            double num = leNumero();
            System.out.println("Número = " + num);
        }
        catch (Exception e){
            System.out.println("Entrada inválida");
            e.printStackTrace();
        }

    }

    /*  Com a utilização do "throws", o tratamento da exceção ocorre no método main
        Nesse caso, por exemplo, o usuário precisa digitar um valor válido para o método rodar
    **/
    public static double leNumero() throws Exception{

        Scanner scan = new Scanner(System.in);

        double num = scan.nextDouble();
        return num;

    }


}
