import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // max
        System.out.println("Starting test: max");
        int[] simple = new int[]{1, 2, 3, 4, 5};
        int[] hard = new int[]{124, 2135423, 1231, 455, -1, 21312, 13135151, 10, 23213, 111, -43};
        check(max(simple), 5);
        check(max(hard), 13135151);
        System.out.println("All tests done for 'max'!\n");

        // rangeList
        System.out.println("Starting test: rangeList");
        List<Integer> shortList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> longList = Arrays.asList(21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253, 254, 255, 256, 257, 258, 259, 260, 261, 262, 263, 264, 265, 266, 267, 268, 269, 270, 271, 272, 273, 274, 275, 276, 277, 278, 279, 280, 281, 282, 283, 284, 285, 286, 287, 288, 289, 290, 291, 292, 293, 294, 295, 296, 297, 298, 299, 300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 310, 311, 312, 313, 314, 315, 316, 317, 318, 319, 320, 321, 322, 323, 324, 325, 326, 327, 328, 329, 330, 331, 332, 333, 334, 335, 336, 337, 338, 339, 340, 341, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 352, 353, 354, 355, 356, 357, 358, 359, 360, 361, 362, 363, 364, 365, 366, 367, 368, 369, 370, 371, 372, 373, 374, 375, 376, 377, 378, 379, 380, 381, 382, 383, 384, 385, 386, 387, 388, 389, 390, 391, 392, 393, 394, 395, 396, 397, 398, 399, 400, 401, 402, 403, 404, 405, 406, 407, 408, 409, 410, 411, 412, 413, 414, 415, 416, 417, 418, 419, 420, 421, 422, 423, 424, 425, 426, 427, 428, 429, 430, 431, 432, 433, 434, 435, 436, 437, 438, 439, 440, 441, 442, 443, 444, 445, 446, 447, 448, 449, 450, 451, 452, 453, 454, 455, 456, 457, 458, 459, 460, 461, 462);
        check(rangeList(1, 10), shortList);
        check(rangeList(21, 462), longList);
        System.out.println("All tests done for 'rangeList'!\n");

        // fibonacci
        System.out.println("Starting test: fibonacci");
        check(fibonacci(1), (long) 1);
        check(fibonacci(2), (long) 1);
        check(fibonacci(3), (long) 2);
        check(fibonacci(4), (long) 3);
        check(fibonacci(20), (long) 6765);
        check(fibonacci(30), (long) 832040);
        System.out.println("All tests done for 'fibonacci'!\n");

        // treeDrawing
        System.out.println("Starting test: treeDrawing");
        assert treeDrawing(1).equals("*\n|");
        check(treeDrawing(1), "*\n|");
        check(treeDrawing(2), "*\n**\n|");
        check(treeDrawing(3), "*\n**\n***\n|");
        String longStr = "*\n**\n***\n****\n*****\n******\n*******\n********\n*********\n**********\n***********\n************\n*************\n**************\n***************\n****************\n*****************\n******************\n*******************\n********************\n*********************\n**********************\n***********************\n************************\n*************************\n**************************\n***************************\n****************************\n*****************************\n******************************\n*******************************\n********************************\n*********************************\n**********************************\n***********************************\n************************************\n*************************************\n**************************************\n***************************************\n****************************************\n*****************************************\n******************************************\n*******************************************\n********************************************\n*********************************************\n**********************************************\n***********************************************\n************************************************\n*************************************************\n**************************************************\n***************************************************\n****************************************************\n*****************************************************\n******************************************************\n*******************************************************\n********************************************************\n*********************************************************\n**********************************************************\n***********************************************************\n************************************************************\n*************************************************************\n**************************************************************\n***************************************************************\n****************************************************************\n*****************************************************************\n******************************************************************\n*******************************************************************\n********************************************************************\n*********************************************************************\n**********************************************************************\n***********************************************************************\n************************************************************************\n*************************************************************************\n**************************************************************************\n***************************************************************************\n****************************************************************************\n*****************************************************************************\n******************************************************************************\n*******************************************************************************\n********************************************************************************\n*********************************************************************************\n**********************************************************************************\n***********************************************************************************\n************************************************************************************\n*************************************************************************************\n**************************************************************************************\n***************************************************************************************\n****************************************************************************************\n*****************************************************************************************\n******************************************************************************************\n*******************************************************************************************\n********************************************************************************************\n*********************************************************************************************\n**********************************************************************************************\n***********************************************************************************************\n************************************************************************************************\n*************************************************************************************************\n**************************************************************************************************\n***************************************************************************************************\n****************************************************************************************************\n|";
        check(treeDrawing(100), longStr);
        System.out.println("All tests done for 'treeDrawing'!\n");

        // isPalindrome
        System.out.println("Starting test: isPalindrome");
        check(isPalindrome("racecar"), true);
        check(isPalindrome("bo.b"), true);
        check(isPalindrome("1221"), true);
        check(isPalindrome("abb"), false);
        check(isPalindrome("1"), true);
        check(isPalindrome("michael"), false);
        check(isPalindrome("this!! siht"), true);
        check(isPalindrome("madam, in eden, i'm adam."), true);
        check(isPalindrome("Yo, Banana BoY!"), true);
        check(isPalindrome(""), true);
        check(isPalindrome("..."), true);
        System.out.println("All tests done for 'isPalindrome'!\n");

        // reverse
        System.out.println("Starting test: reverse");
        check(reverse("racecar"), "racecar");
        check(reverse("michael"), "leahcim");
        check(reverse("angela"), "alegna");
        check(reverse("uploading"), "gnidaolpu");
        check(reverse("a"), "a");
        check(reverse(""), "");
        System.out.println("All tests done for 'reverse'!\n");

        // winningMove
        System.out.println("Starting test: winningMove");
        check(winningMove(new int[][]{{1, 1, 0}, {0, 0, 0}, {2, 2, 0}}), new Pair<>(0, 2));
        check(winningMove(new int[][]{{1, 2, 1}, {1, 2, 0}, {0, 0, 2}}), new Pair<>(2, 0));
        check(winningMove(new int[][]{{1, 1, 2}, {2, 1, 1}, {2, 0, 2}}), new Pair<>(2, 1));
        check(winningMove(new int[][]{{1, 0, 0}, {2, 0, 2}, {1, 2, 1}}), new Pair<>(1, 1));
        System.out.println("All tests done for 'winningMove'!\n");
    }

    public static class Pair<T> {
        T x, y;

        Pair(T x, T y) {
            this.x = x;
            this.y = y;
        }

        Pair() {}

        @Override
        public String toString() {
            return "Pair(" + x + "," + y + ")";
        }

        @Override
        public boolean equals(Object obj) {
            Pair<T> p = (Pair) obj;
            return p.x == x && p.y == y;
        }
    }

    public static <T> void check(T expected, T actual) throws Exception {
        if (!expected.equals(actual)) {
            String s = String.format("ASSERTION FAILED: \n\tgot: %s\n\texpected: %s", expected.toString(), actual.toString());
            throw new Exception(s);
        }
    }

    /**
     * Max returns the maximum number in the array
     *
     * @param arr the input array
     * @return the max number
     */
    public static int max(int[] arr) {
        int maxx = arr[0];
        for (int num : arr) {
            if (num > maxx)
                maxx = num;
        }
        return maxx;
    }

    /**
     * Generate a list of integers with [start, end] inclusive
     *
     * @param start starting number
     * @param end   ending number
     * @return range list
     */
    public static List<Integer> rangeList(int start, int end) {
        List<Integer> integers = new ArrayList<Integer>();
        for (int i = start; i <= end; i++) {
            integers.add(i);
        }
        return integers;
    }

    /**
     * Generate the nth fibonacci number where
     * n=1 -> 1
     * n=2 -> 1
     * n=3 -> 2
     * n=4 -> 3
     * n=5 -> 5
     * n=6 -> 8
     * You must do this *recursively*
     * https://www.scaler.com/topics/images/recursive-calls-as-tree-structures.webp
     *
     * @param n
     * @return
     */
    public static long fibonacci(int n) {
        if (n == 1 || n == 2)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
        // base case: fib(1) = 1  fib(2) = 1
        // 10th -> fib(10) = fib(9) + fib(8)
    }

    /**
     * Given the height of the tree, print a tree!
     * <p>
     * n = 1
     * *
     * |
     * <p>
     * n = 2
     * *
     * **
     * |
     * <p>
     * n = 3
     * *
     * **
     * ***
     * |
     * <p>
     * n = 4
     * *
     * **
     * ***
     * ****
     * |
     * <p>
     * etc
     *
     * @param n height of tree
     * @return tree
     */
    public static String treeDrawing(int n) {
        String tree = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                tree += "*";
            }
            tree += "\n";
        }
        tree += "|";
        return tree;
    }

    /**
     * Check to see if the string is a palindrome
     * You MUST ignore all non-alphanumeric characters
     *
     * @param s input string
     * @return true if the string is a palindrome
     */
    public static boolean isPalindrome(String s) {
        int a = 0;
        int b = s.length() - 1;
        char[] scar = s.toCharArray();
        while (b > a) {
            while (!(Character.isAlphabetic(scar[a]) || Character.isDigit(scar[a]))) {
                a++;
                if (b < a)
                    return true;
            }
            while (!(Character.isAlphabetic(scar[b]) || Character.isDigit(scar[b]))) {
                b--;
                if (b < a)
                    return true;
            }
            if (scar[a] != scar[b])
                return false;
            a++;
            b--;
        }
        return true;
    }

    /**
     * Reverse the string
     *
     * @param s string
     * @return
     */
    public static String reverse(String s) {
        String back = "";
        char[] scar = s.toCharArray();
        for (int i = scar.length - 1; i >= 0; i--) {
            back += scar[i];
        }
        return back;
    }

    /**
     * Given a tic tac toe board in a state where the CPU is 2 and you are 1 and it is your turn,
     * return the position of the winning move in (row, col), zero-indexed
     *
     * Example board:
     *  1 | 2 | 1
     * ---+---+---
     *  1 | 2 | 0
     * ---+---+---
     *  0 | 0 | 2
     *
     * The winning move is (2, 0) -> row 2, column 0
     *
     * Note that there ill always be ONLY ONE possible winning move
     *
     * @param board the board as a 2d array
     * @return the winning move as a pair
     */
    public static Pair<Integer> winningMove(int[][] board) {
        int x = 0;
        int y = 0;
        // look in rows
        for (int i = 0; i < board.length; i++) {
            int tt1 = 0;
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 0) {
                    x = i;
                    y = j;
                }
                if (board[i][j] == 1) {
                    tt1++;
                }
            }
            if (tt1 == 2)
                return new Pair<>(x, y);
        }
        // look in columns
        for (int i = 0; i < board.length; i++) {
            int tt2 = 0;
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] == 0) {
                    x = j;
                    y = i;
                }
                if (board[j][i] == 1) {
                    tt2++;
                }
            }
            if (tt2 == 2)
                return new Pair<>(x, y);
        }
        // look in diagonals
            int tt3 = 0;
            for (int i = 0; i < board.length; i++) {
                if (board[i][i] == 0) {
                    x = i;
                    y = i;
                }
                if (board[i][i] == 1) {
                    tt3++;
                }
            }
            if (tt3 == 2)
                return new Pair<>(x, y);
            // diagonal 2
            int tt4 = 0;
            for (int i = board.length - 1; i >= 0; i--) {
                for (int j = 0; j < board.length; i++) {
                    if (board[i][j] == 0) {
                        x = i;
                        y = j;
                    }
                    if (board[i][j] == 1) {
                        tt4++;
                    }
                }
                if (tt4 == 2)
                    return new Pair<>(x, y);
            }
            return null;
    }
}
