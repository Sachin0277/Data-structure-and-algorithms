import java.util.*;

public class FindTheWinner {
    /*
     * Method to be implemented for finding the winner
     */
    private static String findTheWinner(ArrayList<String> votes){
        int n = votes.size();
        Map<String,Integer> hm = new TreeMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(votes.get(i))){
                hm.put(votes.get(i),hm.get(votes.get(i))+1);
            }
            else{
                hm.put(votes.get(i),1);
            }
        }
        int maxVote = Integer.MIN_VALUE;    
        for(Map.Entry<String,Integer> iter : hm.entrySet()){
            maxVote = Math.max(maxVote, iter.getValue());
        }
        for(Map.Entry<String,Integer> iter : hm.entrySet()){
            if(iter.getValue() == maxVote){
                return iter.getKey().toString();

            }
        }

        return "";

    }
    public static void main(String args[]){

        ArrayList<String> votes = new ArrayList<>();
        votes.add("Sachin");
        votes.add("Umang");
        votes.add("Arun");
        votes.add("Sachin");
        votes.add("Arun");
        //calling the function for finding the winner
        String winner = findTheWinner(votes);
        System.out.println("The winner is :"+ winner);

    }
}
