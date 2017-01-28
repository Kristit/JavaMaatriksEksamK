import java.util.Arrays;

/**
 * Created by kristitammet on 28/01/2017.
 *  * Created by kristitammet on 22/01/2017.
 * * Loo 9*9 suurune maatriks, millele tekib loode suunaline nurkade muster, nagu näites.
 * Tundub raske? Sul tuleb lihtsalt veeru ja rea indeksi seos leida.
 * <p>
 * Näide
 * 1 1 1 1 1 1 1 1 1
 * 1 2 2 2 2 2 2 2 2
 * 1 2 3 3 3 3 3 3 3
 * 1 2 3 4 4 4 4 4 4
 * 1 2 3 4 5 5 5 5 5
 * 1 2 3 4 5 6 6 6 6
 * 1 2 3 4 5 6 7 7 7
 * 1 2 3 4 5 6 7 8 8
 * 1 2 3 4 5 6 7 8 9
 * <p>
 * Tundub raske? Leia seoseid rea ja veeru indeksi numbritega.
 */

public class Loodenurk {
    public static void main(String[] args) {
        int size = 9;
        int[][] laud = new int[size][size];

        for (int i = 0; i < laud.length; i++) {
            int[] row = laud[i];
            for (int j = 0; j < row.length; j++) {
                row[j] = 1 + Math.min(i, j);
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
