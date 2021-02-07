public class TesteCatchTry {

    public static void main(String[] args) {

        //teste  com o array2 maior que o array1
        CatchTryExample teste1 = new CatchTryExample();

        double [] array1 = {5, 7 , 9, 15, 7};
        double [] array2 = {3, 20, 0, 7, 9, 10};

        teste1.divide(array1, array2);

        //teste2  com o array3 maior que o arra4
        CatchTryExample teste2 = new CatchTryExample();

        double [] array3 = {10, 7 , 0, 15, 7,10, 33};
        double [] array4 = {0, 20, 9, 7, 9};

        teste2.divide(array3, array4);

        //Teste da classe Exception
        ExceptionExample exception = new ExceptionExample();

        exception.divide(array3, array4);
    }
}
