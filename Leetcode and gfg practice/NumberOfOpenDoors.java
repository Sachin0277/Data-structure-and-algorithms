/*
 * Consider a long alley with a N number of doors on one side. All the doors are closed initially. You move to and fro in the alley changing the states of the doors as follows: you open a door that is already closed and you close a door that is already opened. You start at one end go on altering the state of the doors till you reach the other end and then you come back and start altering the states of the doors again.
 *In the first go, you alter the states of doors numbered 1, 2, 3, , n.
 *In the second go, you alter the states of doors numbered 2, 4, 6
 *In the third go, you alter the states of doors numbered 3, 6, 9
 *You continue this till the Nth go in which you alter the state of the door numbered N.
 *You have to find the number of open doors at the end of the procedure.
 */
public class NumberOfOpenDoors {
    private static int numOfOpenDoors(int n){
        //if we observe this puzzle it is crystal clear there will be open door as the square root of given value of n
        return (int)Math.sqrt(n);
    }
    public static void main(String args[]){
        int n = 16;
        // calling the function which will find the total number of open door 
        int openDoors = numOfOpenDoors(n);
        System.out.println("Total number of doors opened at the end is "+ openDoors);
    }
}
