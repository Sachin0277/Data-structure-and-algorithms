import java.util.Scanner;

public class EditingTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] reels = new int[n];
        for (int i = 0; i < n; i++) {
            reels[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        int left = 1; // minimum possible time
        int right = 1000000000; // maximum possible time
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canCompleteInTime(reels, k, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(left);
    }

    // Returns true if it is possible to complete editing in time T with K editors
    static boolean canCompleteInTime(int[] reels, int k, int T) {
        int count = 1;
        int time = 0;
        for (int reel : reels) {
            if (reel > T) {
                return false; // a reel is longer than T, can't complete in time
            }
            if (time + reel <= T) {
                time += reel; // add reel to current editor's time
            } else {
                count++; // assign next editor to work on remaining reels
                time = reel; // reset current editor's time
            }
        }
        return count <= k;
    }
}