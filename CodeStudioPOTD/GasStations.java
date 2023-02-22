import java.util.ArrayList;

public class GasStations {

    private static int firstCircularTour(ArrayList<Integer> petrol, ArrayList<Integer> distance){
        //edge cases 
        //if sum of petrols < sum of distance return -1
        long totalPetrols = 0,totalDistance = 0;
        for(Integer p : petrol){
            totalPetrols += p;
        }
        for(Integer d : distance){
            totalDistance += d;
        }
        if(totalPetrols < totalDistance) return -1;

        int flag = 0;
        long prices = 0; // since there is overflow for integer datatype
        int startPos = -1;
        for(int i=0;i<petrol.size();i++){
            prices += petrol.get(i) - distance.get(i);
            if(prices  < 0){
                flag = 0;
                prices = 0; 
            }
            else if(prices >= 0 && flag == 0 ){
                startPos = i;
                flag = 1;
            }
            
        }
        return startPos;
    }
    public static void main(String args[]){
        int n = 2;
        int pet[] = {3,4};
        int dis[] = {3,2};
        ArrayList<Integer> petrol = new ArrayList<>();
        ArrayList<Integer> distance = new ArrayList<>();
        for(int i: pet){
            petrol.add(i);
        }
        for(int d : dis){
            distance.add(d);
        }

        System.out.println(firstCircularTour(petrol,distance));


    }
}
