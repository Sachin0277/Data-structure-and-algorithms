/*
 There are n rooms labeled from 0 to n - 1 and all the rooms are locked except for room 0. Your goal is to visit all the rooms. However, you cannot enter a locked room without having its key.

When you visit a room, you may find a set of distinct keys in it. Each key has a number on it, denoting which room it unlocks, and you can take all of them with you to unlock the other rooms.

Given an array rooms where rooms[i] is the set of keys that you can obtain if you visited room i, return true if you can visit all the rooms, or false otherwise.

 

Example 1:

Input: rooms = [[1],[2],[3],[]]
Output: true
Explanation: 
We visit room 0 and pick up key 1.
We then visit room 1 and pick up key 2.
We then visit room 2 and pick up key 3.
We then visit room 3.
Since we were able to visit every room, we return true.
Example 2:

Input: rooms = [[1,3],[3,0,1],[2],[0]]
Output: false
Explanation: We can not enter room number 2 since the only key that unlocks it is in that room.
 

Constraints:

n == rooms.length
2 <= n <= 1000
0 <= rooms[i].length <= 1000
1 <= sum(rooms[i].length) <= 3000
0 <= rooms[i][j] < n
All the values of rooms[i] are unique.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeysAndRoom {
    private static void dfs(int pos,boolean[] vis,List<List<Integer>> rooms){
        vis[pos] = true;
        for(int room: rooms.get(pos)){
            if(!vis[room]){
                dfs(room,vis,rooms);
            }
        }
    }
    private static boolean canVisitRooms(List<List<Integer>> rooms){
        if(rooms.size() == 0) return false;
        boolean vis[] = new boolean[rooms.size()];
        dfs(0,vis,rooms);
        for(int i=0;i<rooms.size();i++){
            if(!vis[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
     

        //write your code here
        List<List<Integer>> rooms = new ArrayList<>();
        
        rooms.add(Arrays.asList(1));
        rooms.add(Arrays.asList(2));
        rooms.add(Arrays.asList(3));
        rooms.add(Arrays.asList());

        boolean ans = canVisitRooms(rooms);
        if(ans == true){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
       
}

