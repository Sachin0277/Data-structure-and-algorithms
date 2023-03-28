import java.util.ArrayList;

public class ThreePointer {

    private static int threePointer(ArrayList<Integer> X, ArrayList<Integer> Y , ArrayList<Integer> Z){
        int a = X.size(),b = Y.size(),c = Z.size();
        int i=0;//pointer to X list
        int j = 0; //pointer to Y list
        int k = 0; // pointer to Z list 
        int minimumVal = Integer.MAX_VALUE;
        while(i < a && j < b && k < c){
            int min = Math.min(Math.min(X.get(i),Y.get(j)),Z.get(k));
            int max = Math.max(Math.max(X.get(i),Y.get(i)),Z.get(k));
            int diff = max - min;
            if(diff < minimumVal){
                minimumVal = diff;
            }
            // inorder to move the pointer we have to check whether the minimumValue is equal to either of element or not 
            if(min == X.get(i)) i++;
            else if(min == Y.get(j)) j++;
            else k++;
        }
        return minimumVal;

    }

    public static void main(String args[]){
        int []A = {1,2,3,4,5};
        int []B = {1,3,5,7,9};
        int []C = {2,4,6};
        ArrayList<Integer> X = new ArrayList<>();
        ArrayList<Integer> Y = new ArrayList<>();
        ArrayList<Integer> Z = new ArrayList<>();
        for(int ele : A){
            X.add(ele);
        }
        for(int ele : B){
            Y.add(ele);
        }
        for(int ele : C){
            Z.add(ele);
        }

        //call the function
        int ans = threePointer(X,Y,Z);
        System.out.println(ans);
    }
}
