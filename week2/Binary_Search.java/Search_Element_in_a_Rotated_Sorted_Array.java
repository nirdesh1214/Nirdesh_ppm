import java.util.*;
public class Main {
    static int search(int arr[],int target) {
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==target)
            return i;
    }
    return -1;
}
    public static void main(String args[]) {
    int arr[] = {4,5,6,7,0,1,2,3};
    int target = 3;
    System.out.println("The index in which the number is present is "+search(arr,target));
    }
}
