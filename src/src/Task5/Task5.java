package src.Task5;

public class Task5 {
    public static void main(final String[] args) {

        final Matrix matrix = new Matrix();

        System.out.println("\n Original matrix: \n" );
        matrix.print();

        System.out.println("\n Transposed matrix: \n" );
        (matrix.transposition()).print();
    }
}
