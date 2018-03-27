public class Main {
    
    public int[][] zeroMatrix(int mat[][]) {
        int m = mat.length, n = mat[0].length, p = 0, q = 0;
        if(m == 1 && n == 1) return mat;
        
        int result[][] = new int[m][n];
        
        for(int r[]: result)
            Arrays.fill(r, -1);
        
        for(int i=0; i<m;i++) {
            for(int j=0; j<n; j++) {
                if(result[i][j] == -1 && mat[i][j] != 0)
                    result[i][j] = mat[i][j];
                
                if(mat[i][j] == 0) {
                    Arrays.fill(result[i], 0);
                    for(int index=0; index<m; index++)
                        result[index][j] = 0;
                }
                    
            }
        }
        
        return result;
    }
    
    public void printMatrix(int mat[][]) {
        int r = mat.length, c = mat[0].length;
        
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int a[][] = {{0}};
        int b[][] = {
            {1, 2},
            {3, 0}
        };
        int c[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 0, 9}
        };
        
        Main main = new Main();
        main.printMatrix(main.zeroMatrix(a));
        System.out.println("================");
        main.printMatrix(main.zeroMatrix(b));
        System.out.println("================");
        main.printMatrix(main.zeroMatrix(c));
    }
}