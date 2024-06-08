package medium;

public class leet2352 {
    public static int equalPairs(int[][] grid) {


        // int maxRow= grid[0].length;
        // int count=0;

        //  //全行探索
        // for(int i=0; i<maxRow;i++){
        //     //1つの行を探索
        //     for(int j=i; j<maxRow;j++){
        //         if(grid[i][j] != grid[j][i]){
        //             continue;
        //         }
        //     }

        // }
        int count = 0, n = grid.length;
        
        // Check each row r against each column c.
        for (int r = 0; r < n; ++r) {
            for (int c = 0; c < n; ++c) {
                boolean match = true;

                // Iterate over row r and column c.
                for (int i = 0; i < n; ++i) {
                    if (grid[r][i] != grid[i][c]) {//rが行、cが列
                        match = false;
                        break;
                    }
                }

                // If row r equals column c, increment count by 1.
                count += match ? 1 : 0;
            }
        }
        
        return count;
        

    }

    public static void main(String[] args){

        int[][] grid = {{3,2,1},{1,7,6},{2,7,7}};
        System.out.println(equalPairs(grid));
    }
    
}
