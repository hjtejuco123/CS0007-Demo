/**
 * Two Dim array
 * @author hadjitejuco
 */
public class Module4_ex7 {
    public static void main(String[] args) {
        //3x3
        int[][]matrix = {
            {1,2,3},   //0,0   0,1  0,2
            {4,5,6},   //1,0   1,1  1,2
            {7,8,9}    //2,0   2,1  2,2
        };
        //print 
        System.out.println("2Dim array print");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        /*  i j 
            0,0     1           1   2   3
            0,1     2
            0,2     3
        
            i j 
            1,0     4           4   5   6
            1,1     5
            1,2     6
        
            i j 
            2,0     7           7   8   9
            2,1     8
            2,2     9
        
            Output
        
            1 2 3
            4 5 6
            7 8 9
        
        */
        
        
        
    }
}
