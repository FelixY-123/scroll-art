public class App {

    static final int Tree_height = 11;
    static final int Tree_width = 13;

    public static void main(String[] args) throws InterruptedException {

        char[][] palmTree = getPalmTree();
        char[][] Basketball = getBasketball();

        while (true) {
            scrollArt(palmTree);
            Thread.sleep(30);

            scrollArt(Basketball);
            Thread.sleep(30);
        }
    }

    public static void scrollArt(char[][] ascii) throws InterruptedException {
        for (int i = 0; i < ascii.length; i++) {
            for (int j = 0; j < ascii.length; j++) {
                System.out.print(ascii[i][j]);
            }
            System.out.println();
            Thread.sleep(30);
        }

    }

    static char[][] getPalmTree() {
        char[][] img = new char[Tree_height][Tree_width];

        for (int y = 0; y < Tree_height; y++) {
            for (int x = 0; x < Tree_width; x++) {
                img[y][x] = ' ';
            }
        }

        img[0][3] = '\'';
        img[0][4] = 'X';
        img[0][5] = 'x';
        img[0][8] = 'x';
        img[0][9] = 'X';
        img[0][10] = '"';
        img[0][11] = ',';

        img[1][1] = '_';
        img[1][2] = 'x';
        img[1][3] = 'X';
        img[1][4] = 'X';
        img[1][5] = 'x';
        img[1][6] = '_';
        img[1][7] = 'x';
        img[1][8] = 'X';
        img[1][9] = 'x';

        img[2][0] = '\'';
        img[2][2] = '_';
        img[2][3] = 'x';
        img[2][4] = 'X';
        img[2][5] = 'X';
        img[2][6] = 'X';
        img[2][7] = 'X';
        img[2][8] = 'X';
        img[2][9] = 'x';
        img[2][10] = 'x';
        img[2][11] = '"';
        img[2][12] = ',';

        img[3][1] = '_';
        img[3][2] = 'X';
        img[3][3] = 'X';
        img[3][4] = 'x';
        img[3][5] = 'O';
        img[3][6] = 'X';
        img[3][7] = 'O';
        img[3][8] = 'X';
        img[3][9] = 'x';

        img[4][0] = '\'';
        img[4][2] = 'X';
        img[4][4] = 'O';
        img[4][5] = '|';
        img[4][6] = 'O';
        img[4][7] = 'O';
        img[4][9] = '\'';
        img[4][10] = 'x';

        img[5][2] = 'Y';
        img[5][5] = '|';
        img[5][6] = '|';
        img[5][11] = '\'';

        img[6][5] = '|';
        img[6][6] = '|';

        img[7][5] = '|';
        img[7][6] = '|';

        img[8][5] = '|';
        img[8][6] = '|';

        img[9][5] = '|';
        img[9][6] = '|';

        img[10][1] = '-';
        img[10][2] = '-';
        img[10][3] = '-';
        img[10][4] = '-';
        img[10][5] = '+';
        img[10][6] = '+';
        img[10][7] = '-';
        img[10][8] = '-';
        img[10][9] = '-';
        img[10][10] = '-';
        img[10][11] = '-';

        return img;

    }

    static char[][] getBasketball() {
        char[][] img = new char[Tree_height][Tree_width];

        for (int y = 0; y < Tree_height; y++) {
            for (int x = 0; x < Tree_width; x++) {
                img[y][x] = ' ';
            }
        }

        img[0][8] = '_';
        img[0][9] = '_';

        img[1][7] = '[';
        img[1][10] = ']';

        img[2][4] = 'O';
        img[2][7] = '[';
        img[2][10] = ']';

        img[3][2] = 'O';
        img[3][3] = '/';
        img[3][4] = '|';
        img[3][8] = '{';
        img[3][9] = '}';

        img[4][1] = '/';
        img[4][3] = '=';
        img[4][4] = '/';
        img[4][8] = '|';
        img[4][9] = '|';

        img[5][1] = '|';
        img[5][2] = '|';
        img[5][8] = '|';
        img[5][9] = '|';

        img[6][0] = '-';
        img[6][1] = '\\';
        img[6][3] = '\\';
        img[6][4] = '-';
        img[6][5] = '-';
        img[6][6] = '-';
        img[6][7] = '-';
        img[6][8] = '|';
        img[6][9] = '|';
        img[6][10] = '-';
        img[6][11] = '-';

        img[7][1] = ']';
        img[7][2] = ']';
        img[7][3] = ']';
        img[7][8] = '+';
        img[7][9] = '+';

        img[8][1] = '/';
        img[8][2] = '/';
        img[8][3] = '/';

        img[9][1] = 'L';
        img[9][2] = 'L';
        img[9][3] = '\\';

        img[10][10] = 'F';
        img[10][11] = 'Y';

        return img;

    }

}