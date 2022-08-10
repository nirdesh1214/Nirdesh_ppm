import java.util.*;
class TUF {
    static void GetMax(int arr[], int l, int r, ArrayList < Integer > maxx) {
        int i, maxi = Integer.MIN_VALUE;
        for (i = l; i <= r; i++)
            maxi = Math.max(maxi, arr[i]);
        maxx.add(maxi);
    }
    static ArrayList < Integer > maxSlidingWindow(int arr[], int k) {
        int left = 0, right = 0;
        int i, j;
        ArrayList < Integer > maxx = new ArrayList < > ();
        while (right < k - 1) {
            right++;
        }
        while (right < arr.length) {
            GetMax(arr, left, right, maxx);
            left++;
            right++;
        }
        return maxx;
    }
    public static void main(String args[]) {
        int i, j, n, k = 3, x;
        int arr[]={4,0,-1,3,5,3,6,8};
        ArrayList < Integer > ans;
        ans = maxSlidingWindow(arr, k);
        System.out.println("Maximum element in every " + k + " window ");
        for (i = 0; i < ans.size(); i++)
            System.out.print(ans.get(i) + "  ");

    }
}
