import java.util.Arrays;

/**
 * Created by kristitammet on 28/01/2017.
 *  * /**
 * Loo 10*10 maatriks tsirkuse lauamänguga. Ehk numbrid ühest sajani
 * alustavad alt vasakult ja jõuavad üles vasakule.
 * <p>
 * Näide 5*5 laual:
 *
 * 21 22 23 24 25
 * 20 19 18 17 16
 * 11 12 13 14 15
 * 10 9  8  7  6
 * 1  2  3  4  5
 */
public class Tsirkus {
    public static void main(String[] args) {

        int size = 5;
        int[][] laud = new int[size][size];


        for (int i = 0; i < laud.length; i++) {
            int[] row = laud[i];
            for (int j = 0; j < row.length; j++) {
                int rowMultiplier = size - i -1;
                int columnPart = i % 2 == 1 ? size - j : j+1;


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