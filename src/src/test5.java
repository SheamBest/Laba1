package src;

public class test5 {
    public static void main(final String[] args) {

        final Matrix matrix = new Matrix();

        System.out.println("\n Original matrix: \n" );
        matrix.Print();

        System.out.println("\n Transposed matrix: \n" );
        (matrix.Transposition()).Print();
    }
}
