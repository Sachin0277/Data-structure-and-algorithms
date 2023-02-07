import java.util.HashMap;

/*
 You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.

You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:

You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
Given the integer array fruits, return the maximum number of fruits you can pick.
 */

public class FruitsInBasket {

    private static int totalFruits(int fruits[]){
         HashMap<Integer,Integer> hm = new HashMap<>();
         int i=0,j;
         for(j=0;j<fruits.length;j++){
            hm.put(fruits[j],hm.getOrDefault(fruits[j],0)+1);
            if(hm.size() > 2){
                hm.put(fruits[i],hm.get(fruits[i])-1);
                hm.remove(fruits[i++],0);
            }
         }
         return j-i;
    }
    public static void main(String args[]){
        int fruits[] = {1,2,2};
        int ans = totalFruits(fruits);
        System.out.println(ans);
        
    }
    
}
