/**
 * Created by kristitammet on 28/01/2017.
 *  *
 *
 *  0 0 0 0 0 0 0 0 0
 *  0 1 1 1 1 1 1 1 0
 *  0 1 2 2 2 2 2 1 0
 *  0 1 2 3 3 3 2 1 0
 *  0 1 2 3 4 3 2 1 0
 *  0 1 2 3 3 3 2 1 0
 *  0 1 2 2 2 2 2 1 0
 *  0 1 1 1 1 1 1 1 0
 *  0 0 0 0 0 0 0 0 0
 *
 *  Kui tuletad meelde kuidas loode ja kagu nurka lahendada ning
 *  kuidas kirdest edelasse diagonaali joonistada, siis tead ka
 *  kuidas seda ülesannet lahendada.
 *
 *  Massiivi ei ole vaja panna, lihtsalt prindi välja. Ära üle
 *  mõtle - lahendada on võimalik kahe tsükli ja ühe if lausega.
 */
public class Pyramid {
    public static void main(String[] args) {
        int size = 9;
        int [][] laud = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(Math.min(Math.min(i, j), Math.min(size - i - 1, size - j - 1)));
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}