class RatInMaze{
    private static boolean isPathExist(int[][] arr,int row,int col){
        return (row >=0 && col >= 0 && row < arr.length && col < arr.length && arr[row][col] == 1);
    }
    private static boolean findPathHelper(int[][] arr,int[][] sol,int row,int col){
        //base case
        if(row == arr.length-1 && col == arr.length-1 && arr[row][col] == 1){
            sol[row][col] =1 ;
            return true;
        }
        if(isPathExist(arr,row,col)){
            sol[row][col] = 1;
            if(findPathHelper(arr,sol,row+1,col))//recursively calling for down backtracking
                return true;
            if(findPathHelper(arr,sol,row,col+1))//recursively calling for right backtracking 
                return true;

            sol[row][col] = 0;
            return false;
        }
        return false;
    }
    private static void printSolution(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static void findPath(int[][] arr,int n){
        int[][] sol = new int[n][n];
        if(findPathHelper(arr,sol,0,0)){
            printSolution(sol);
        }
        else{
            System.out.println("No path to reach destination");
        }
    }
    public static void main(String[] args) {
        int[][] maze= {{1,0,1,1},
                       {1,1,1,0},
                       {0,1,1,1},
                       {1,0,0,1}};
        int dimension = maze.length;
        findPath(maze,dimension);
    }
}