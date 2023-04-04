
/*
 You are given 3 Integers ‘n’, ‘R’ & ‘r’ where ‘n’ is the number of plates,

‘R’ is the radius of the table, and ‘r’ is the radius of the ‘n’ plates. The task is to find out whether the given table has enough space to accommodate the given number of plates of radius ‘r’. Consider the table and plates to be round and no plate can be placed above any other.

Each plate must be completely inside the table and must touch the edge of the table. Of course, the plates must not intersect, but they can touch each other.

You have to return true if the table can accommodate the given number of plates else return false.
 */
public class CountThePlates {
    public static boolean countPlatesOnTable(int n,int R,int r) {
        // Write your code here
        if (n == 1) {
            return r <= R;
        }
        if(R == r && n != 1) return false;
        
        double angle = Math.asin(1.0*r / (R - r));
        int maxPlates = (int) Math.floor(3.1415927/ angle);
        
        return n <= maxPlates;

    }
    public static void main(String[] args) {
        int n = 5,R = 10,r = 4;
        System.out.println(countPlatesOnTable(n,R,r));
    }
}
