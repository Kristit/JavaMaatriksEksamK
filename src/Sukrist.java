import java.util.Arrays;

/**
 * Created by kristitammet on 28/01/2017.
 *
 * * Loo 10*10 maatriks tagurpidi Tsirkuse lauamänguga. Ehk numbrid ühest sajani
 * alustavad ülevalt paremalt ja jõuavad alla paremale (või kui kaugele iganes).
 *
 * Näide 5*5 laual:
 *  5  4  3  2  1
 *  6  7  8  9 10
 * 15 14 13 12 11
 * 16 17 18 19 20
 * 25 24 23 22 21
 * 26 27 28 29 30
 */

public class Sukrist {
    static final int size = 5;
    static int[][] laud = new int[size][size];

    public static void main(String[] args) {
        for (int i = 0; i < laud.length; i++) {
            int[] row = laud[i];
            for (int j = 0; j < row.length; j++) {

                int rowMultiplier = i;
                int columnPart = i % 2 == 0 ? size - j : j + 1;


                row[j] = rowMultiplier * size + columnPart;
            }
        }
        printMaatriks(laud);
    }

    // Lihtsalt abiline meetod, et maatriksit välja printida
    private static void printMaatriks(int[][] laud) {
        for (int i = 0; i < laud.length; i++) {
            System.out.println(Arrays.toString(laud[i]));
        }
        System.out.println("");
    }
}

