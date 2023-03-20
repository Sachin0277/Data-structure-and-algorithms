import java.util.ArrayList;
public class DistanceXYinAGrid {


    private static int shortestXYDist(ArrayList<ArrayList<Character>> grid,int n,int m){
        ArrayList<int[]> x = new ArrayList<>();
        ArrayList<int[]> y = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid.get(i).get(j) == 'X') x.add(new int[]{i,j});
                else if(grid.get(i).get(j) == 'Y') y.add(new int[]{i,j});
            }
        }
        int minDist = Integer.MAX_VALUE;
        for(int[] xi : x){
            for(int []yi: y){
                minDist = Math.min(minDist,Math.abs(xi[0]-yi[0])+Math.abs(xi[1]-yi[1]));

            }
        }
        return minDist;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Character>> grid = new ArrayList<>();
        ArrayList<Character> ls = new ArrayList<>();
        ls.add('X');
        ls.add('X');
        ls.add('0');
        grid.add(ls);
        ArrayList<Character> ls1 = new ArrayList<>();
        ls1.add('0');
        ls1.add('0');
        ls1.add('Y');
        grid.add(ls1);
        ArrayList<Character> ls2 = new ArrayList<>();
        ls2.add('Y');
        ls2.add('0');
        ls2.add('0');
        grid.add(ls2);

        int n = grid.size();
        int m = grid.get(0).size();
        int ans = shortestXYDist(grid,n,m);

        System.out.println(ans);


        
    }
}
