import java.text.DecimalFormat;

public class Calculadora {

    enum Operacao{ //enum pode ser declarado dentro ou fora da classse
        SOMAR("+"){
            public double executarOperacao(double x, double y){
                return x + y;
            }
        }, SUBTRAIR("-") {
            public double executarOperacao(double x, double y) {
                return x - y;
            }
        }, MULTIPLICAR("*") {
            public double executarOperacao(double x, double y) {
                return x * y;
            }
        }, DIVIDIR("/") {
            public double executarOperacao(double x, double y) {
                return x / y;
            }
        };

        private String simbolo;

        Operacao(String simbolo){ //construtor
            this.simbolo = simbolo;
        }

        public abstract double executarOperacao(double x, double y);// método abstrato: todos os enums precisam ter esse(s) método(s)

        public String toString(){
            return this.simbolo;
        }
    }

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#,###.00");

        double x = 17;
        double y = 5;

        for (Operacao op : Operacao.values()){
            //método values do enum retorna um array de todos os valores
            // não tem "= new Operacao()" depois de "Operacao op" como em uma classe / não precisa criar objeto

            System.out.print(x + " ");
            System.out.print(op.toString() + " ");
            System.out.print(y + " = ");
            System.out.println(df.format(op.executarOperacao(x, y)));

        }

    }


}
