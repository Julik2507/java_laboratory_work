public class Features {

    String row1 = "*********   ***      *       *";
    String row2 = "*       *  *   *    ***     * *";
    String row3 = "*       * *     *  *****   *   *";
    String row4 = "*       * *     *    *    *     *";
    String row5 = "*       * *     *    *   *       *";
    String row6 = "*       * *     *    *    *     *";
    String row7 = "*       * *     *    *     *   *";
    String row8 = "*       *  *   *     *      * *";
    String row9 = "*********   ***      *       *";

    String[] rows = {row1, row2, row3, row4, row5, row6, row7, row8, row9};

    public void drawFigures() {
        System.out.println("Exercise #1:\n");
        for(int i=0; i<9; i++) {
            System.out.println(rows[i]);
        }
        System.out.println("\n");
    }

    


}