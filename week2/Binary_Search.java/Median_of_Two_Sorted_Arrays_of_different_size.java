import java.util.*;
public class TUF{
static double median(int arr1[],int arr2[],int m,int n) {
    int finalArray[]=new int[n+m];
    int i=0,j=0,k=0;
    while(i<m && j<n) {
        if(arr1[i]<arr2[j]) {
            finalArray[k++] = arr1[i++];
        }
        else {
            finalArray[k++] = arr2[j++];
        }
    }
    if(i<m) {
        while(i<m) 
            finalArray[k++] = arr1[i++];
    }
    if(j<n) {
        while(j<n)
            finalArray[k++] = arr2[j++];
    }
    n = n+m;
    if(n%2==1) 
        return finalArray[((n+1)/2)-1];
    else return ((double)finalArray[(n/2)-1]+(double)finalArray[(n/2)])/2.0;
}

public static void main(String args[]) {
    int arr1[] = {1,4,7,10,12};
    int arr2[] = {2,3,6,15};
    int m=arr1.length;
    int n =arr2.length;
   System.out.print("The Median of two sorted array is ");
    System.out.printf("%.5f",median(arr1,arr2,m,n));
}
}
