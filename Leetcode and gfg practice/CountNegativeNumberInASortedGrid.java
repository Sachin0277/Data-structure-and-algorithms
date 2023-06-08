public class CountNegativeNumberInASortedGrid {
    public static int countNegatives(int[][] grid) {
        int cnt = 0, row = 0, col = grid[0].length-1;
        while(col >= 0 && row < grid.length){
            if(grid[row][col] < 0){
             cnt += grid.length-row;
             col--;
            }
            else{
                row++;
            }
        }
        return cnt;
     }
    public static void main(String[] args) {
        int grid[][] = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));
    }
}
