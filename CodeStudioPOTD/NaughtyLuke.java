public class NaughtyLuke{
    private static void reverse(int a[][],int i){
        int l = 0;
        int h = a[i].length-1;
        while(l < h){
            int t = a[i][l];
            a[i][l] = a[i][h];
            a[i][h] = t;
            l++;
            h--;
        }
    }

    private static int[][] getFinalGrid(int a[][],int n){
        //first of all , twist the grid vertically
        // In order to twist , let's reverse  each row
        for(int i=0;i<n;i++){
            reverse(a,i);
        }
        //Now we have to change color i.e black or 1 to white or 0
        //As it is binary array it has only 1 or 0 so we can use xor operator because it on xor with the same it inverts
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j] ^= 1;
            }
        }
        return a;

    }
    public static void main(String args[]){
        int binArr[][] = {{1,1,0},{0,1,1},{1,0,0}};
        int n = binArr.length;
        int[][] finGrid = getFinalGrid(binArr,n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(finGrid[i][j]+" ");
            }
            System.out.println();
        }
    }
}