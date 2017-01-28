/**
 * Created by kristitammet on 28/01/2017.
 */

import java.util.Arrays;


/**
 * Created by kristitammet on 22/01/2017.
 * /**
 * Loo 9*9 maatriks, millel on kujutatud kikilipsu. Värvitud ala on number 0 ja
 * värvimata on punkt. Kui ei oska siis joonista esiteks rist ja liigu sealt edasi.
 * <p>
 * Näide
 * 0 . . . . . . . 0
 * 0 0 . . . . . 0 0
 * 0 0 0 . . . 0 0 0
 * 0 0 0 0 . 0 0 0 0
 * 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 . 0 0 0 0
 * 0 0 0 . . . 0 0 0
 * 0 0 . . . . . 0 0
 *
 * 0 . . . . . . . 0
 */


public class Kikilips {
    public static void main(String[] args) {

        int size=9;
        String[][] laud = new String[size][size];


        for (int i = 0; i < laud.length; i++) {
            for (int j = 0; j < laud.length; j++) {
                if (i + j < 9 && i - j >= 0) {
                    laud[i][j] = "0";
                } else if (i + j >= 8 && i - j <= 0) {
                    laud[i][j] = "0";
                } else {
                    laud[i][j] = " ";
                }
            }
            System.out.println(Arrays.toString(laud[i]));
        }

    }

}
