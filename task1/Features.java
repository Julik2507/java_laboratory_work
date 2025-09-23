public class Features {

    // String row1 = "*********   ***      *       *";
    // String row2 = "*       *  *   *    ***     * *";
    // String row3 = "*       * *     *  *****   *   *";
    // String row4 = "*       * *     *    *    *     *";
    // String row5 = "*       * *     *    *   *       *";
    // String row6 = "*       * *     *    *    *     *";
    // String row7 = "*       * *     *    *     *   *";
    // String row8 = "*       *  *   *     *      * *";
    // String row9 = "*********   ***      *       *";

    // String[] rows = {row1, row2, row3, row4, row5, row6, row7, row8, row9};

    // public void drawFigures() {
    //     System.out.println("Exercise #1:\n");
    //     for(int i=0; i<9; i++) {
    //         System.out.println(rows[i]);
    //     }
    //     System.out.println("\n");
    // }

    public void drawSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void drawOval(int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if ((i == 0 || i == n - 1) && j > 2 && j < n - 3) {
                System.out.print("*");
            }
            else if ((i == 1 || i == n - 2) && (j == 1 || j == n - 2)) {
                System.out.print("*");
            }
            else if (i > 1 && i < n - 2 && (j == 0 || j == n - 1)) {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
                System.out.println();

    }
}

    public void drawPointer(int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            
            if(i==0 && j==2) {
                System.out.print("*");
            } 
            else if((i==1) && j>0 && j<4) {
                System.out.print("*");
            }
            else if((i==2) && j>-1 && j<5) {
                System.out.print("*");
            }
            else if(i > 2 && j==2) {
                System.out.print("*");
            } 
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

    public void drawRhombus(int n) {
        // int center = 1 + n / 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if(i==0 && j==4) {
                    System.out.print("*");
                }
                else if(i==1 && (j==3 || j==5)) {
                    System.out.print("*");
                }
                else if(i==2 && (j==2 || j==6)) {
                    System.out.print("*");
                }
                else if(i==3 && (j==1 || j==7)) {
                    System.out.print("*");
                }
                else if(i==4 && (j==0 || j==8)) {
                    System.out.print("*");
                }
                else if(i==5 && (j==1 || j==7)) {
                    System.out.print("*");
                }
                else if(i==6 && (j==2 || j==6)) {
                    System.out.print("*");
                }
                else if(i==7 && (j==3 || j==5)) {
                    System.out.print("*");
                }
                else if(i==8 && (j==4 || j==4)) {
                    System.out.print("*");
                }  
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    


}