
import javafx.application.Application;

import java.util.Arrays;

/**
 * Created by kristitammet on 22/01/2017.
 *  * Loo 9*9 maatriks, millel on kujutatud liivakella. Värvitud ala on number 0 ja
 * värvimata on punkt. Kui ei oska siis joonista esiteks rist ja liigu sealt edasi.
 *
 * Näide
 * 0 0 0 0 0 0 0 0 0
 * . 0 0 0 0 0 0 0 .
 * . . 0 0 0 0 0 . .
 * . . . 0 0 0 . . .
 * . . . . 0 . . . .
 * . . . 0 0 0 . . .
 * . . 0 0 0 0 0 . .
 * . 0 0 0 0 0 0 0 .
 * 0 0 0 0 0 0 0 0 0
 *
 */


public class Liivakell {



    public static void main(String[] args) {
        String [][] laud = new String [9][9];

        for (int i = 0; i < laud.length; i++) {
            for (int j = 0; j < laud[i].length; j++) {
                if (i + j <= 8 && i - j <= 0) {
                    laud[i][j] = "0";
                } else if (i + j >= 8 && i - j >= 0) {
                    laud[i][j] = "0";
                } else {
                    laud[i][j] = " ";
                }
            }
            System.out.println(Arrays.toString(laud[i]));
        }
    }

    private static void printMaatriks(int[][] laud) {
        for (int i = 0; i < laud.length; i++) {
            System.out.println(Arrays.toString(laud[i]));
        }
        System.out.println("");
    }
}


