import java.util.ArrayList;
public class NonOverlappingSubstrings {
    private static int checkValid(String str,int i, int L[],int R[]){
        int right = R[(int)(str.charAt(i))-97];
        for(int j=i;j<right;j++){
            if(L[(int)(str.charAt(j)) - 97] < i){
                return -1;
            }
            right = Math.max(right, R[(int)(str.charAt(j))-97]);
        }
        return right;
    }
    private static ArrayList<String> nonOverlappingSubIntervals(String str){
        ArrayList<String> res = new ArrayList<>();
        int n = str.length();
        int L[] = new int[26];
        int R[] = new int[26];
        for(int i=0;i<26;i++){
            L[i] = R[i] = -1;
        }
        for(int i=0;i<n;i++){
            if(L[(int)(str.charAt(i))-97] == -1){
                L[(int)(str.charAt(i))-97] = i;
            }
            R[(int)(str.charAt(i))-97] = i;
        }
        int right = -1;
        for(int i=0;i<n;i++){
            if(i == L[(int)(str.charAt(i))-97]){
                int new_right = checkValid(str,i,L,R);
                if(new_right != -1){
                    String sub = str.substring(i,new_right+1);
                    if(new_right < right){
                        res.set(res.size()-1,sub);
                    }
                    else{
                        res.add(sub);
                    }
                    right = new_right;
                }
            }
        }
        return res;
    }
    public static void main(String args[]){
        String str = "abaccce";
        ArrayList<String> ans = nonOverlappingSubIntervals(str);
        for(String s : ans){
            System.out.print(s+' ');
        }

    }
}
