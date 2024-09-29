package patternQns;



public class pattern1 {
    public static void main(String[] args) {
        pattern2(4);
    }

    static void pattern1(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }

    static void pattern2 (int n) {
        for (int row = 0; row < 2 * n; row++) {
            if ( row <= n) {
                for (int col = 0; col < row; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else if (row > n && row < 2 * n) {
                for (int col = 0; col < 2 * n - row; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            
        }
    }

    static void pattern3 (int n) {
        for (int row = 0; row < 2 * n; row++) {
            if ( row <= n) {
                for (int col = 0; col < row; col++) {
                    if (n - col < n) {
                        print
                    }
                    System.out.print("* ");
                }
                System.out.println();
            } else if (row > n && row < 2 * n) {
                for (int col = 0; col < 2 * n - row; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            
        }
    }
    
}

