package Searching_And_Sorting;

public class floorInSortedArray {
    public static void main(String[] args) {

        int[] arr= {1,2,8,10,11,12,18};
        System.out.println(findFloor(arr,7,9));

    }

    static int findFloor(int[] arr, int n, long x)
    {
        int s = 0;
        int e = n-1;
        int target=-1;

        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid]>x)
                e=mid-1;
            else if (arr[mid]<x){
                target=mid;
                s=mid+1;
            }

            else
                return mid;

        }
        return target;
    }
}
