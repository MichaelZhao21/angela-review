public class DontLook {
    public static void main(String[] args) throws Exception {
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

    public static Pair<Integer> winningMove(int[][] board) {
        // row
        for (int i = 0; i < 3; i++) {
            int me = 0;
            int cpu = 0;
            Pair<Integer> not = new Pair<>();
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 1) me++;
                else if (board[i][j] == 2) cpu++;
                else not = new Pair<>(i, j);
            }
            if (me == 2 && cpu == 0) return not;
        }

        // col
        for (int j = 0; j < 3; j++) {
            int me = 0;
            int cpu = 0;
            Pair<Integer> not = new Pair<>();
            for (int i = 0; i < 3; i++) {
                if (board[i][j] == 1) me++;
                else if (board[i][j] == 2) cpu++;
                else not = new Pair<>(i, j);
            }
            if (me == 2 && cpu == 0) return not;
        }

        // diag down left
        int me = 0;
        int cpu = 0;
        Pair<Integer> not = new Pair<>();
        for (int i = 0,j = 0; i < 3; i++, j++) {
            if (board[i][j] == 1) me++;
            else if (board[i][j] == 2) cpu++;
            else not = new Pair<>(i, j);
        }
        if (me == 2 && cpu == 0) return not;

        // diag down right
        me = 0;
        cpu = 0;
        not = new Pair<>();
        for (int i = 0,j = 2; i < 3; i++, j--) {
            if (board[i][j] == 1) me++;
            else if (board[i][j] == 2) cpu++;
            else not = new Pair<>(i, j);
        }
        if (me == 2 && cpu == 0) return not;

        return null;
    }
}
