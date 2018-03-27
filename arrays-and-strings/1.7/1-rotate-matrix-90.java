public class Main {
    
    public int[][] rotate90(int mat[][]) {
        int n = mat.length, p = 0, q = 0;
        if(n == 1) return mat;
        
        int result[][] = new int[n][n];
        
        // Clockwise rotation by 90 deg
        for(int i=0; i<n;i++) {
            for(int j=n-1; j>=0; j--) {
                result[p][q] = mat[j][i];
                q++;
            }
            p++;
            q = 0;
        }
        
        return result;
    }
    
    public void printMatrix(int mat[][]) {
        int n = mat.length;
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int a[][] = {{1}};
        int b[][] = {
            {1, 2},
            {3, 4}
        };
        int c[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        Main main = new Main();
        main.printMatrix(main.rotate90(a));
        System.out.println("================");
        main.printMatrix(main.rotate90(b));
        System.out.println("================");
        main.printMatrix(main.rotate90(c));
    }
}