package ro.fasttrackit.temaCurs5siCurs6;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        int nrOfRows = 5, c = 1, x, i, j;
        for (i = 0; i < nrOfRows; i++) {
            for (x = 1; x <= nrOfRows - i; x++)
                System.out.print(" ");
            for (j = 0; j <= i; j++) {
                if (j == 0 || i == 0)
                    c = 1;
                else
                    c = c * (i - j + 1) / j;
                System.out.print(" " + c);
            }
            System.out.print("\n");
        }
    }
}
