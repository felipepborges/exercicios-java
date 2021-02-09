import java.util.Locale;
import java.util.Scanner;

public class Size {

    enum Tamanho{
        SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

        private String abbreviation;

        private Tamanho(String abbreviation){ //construtor
            this.abbreviation = abbreviation;
        }

        public String toString(){
            return abbreviation;
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE) ");
        String input = scan.next().toUpperCase();
        Tamanho size = Enum.valueOf(Tamanho.class, input);
        System.out.println("Size = " + size);
        System.out.println("Size = " + size.toString());
    }


}
