public class StrangeNumbers {
    private static boolean isStrange(int n){
        int rotate = 0;
		int dum = n;
		while(dum > 0){
			int cur = dum%10;
			dum /= 10;
			if(cur == 6){
				cur = 9;
			}
			else if(cur == 9){
				cur = 6;
			}
			rotate = rotate*10+cur;
		}
		if(n != rotate){
			return true;
		}
		else return false;
    }

    private static int dfs(int n,int cur){
        int ans = 0;
        if(isStrange(cur) == true ) ans++;
        int dig[] = {0,1,6,8,9};
        for(int i=0;i<dig.length;i++){
            int num = cur*10+dig[i];
            if(num >= 1 && num <= n){
                ans += dfs(n,num);
            }
        }
        return ans;
    }

    private static int strangeNumbers(int n){
        return dfs(n,0);
    }
    public static void main(String args[]){
        int n = 16;
        System.out.println(strangeNumbers(n));
    }
}
