package com.prodhani.dsa.array.search;

public class LastDuplicateIndex {

    static void dupLastIndex(int arr[], int n)
    {
        // if array is null or size is less
        // than equal to 0 return
        if (arr == null || n <= 0)
            return;

        // compare elements and return last
        // duplicate and its index
        for (int i = n - 1; i > 0; i--)
        {
            if (arr[i] == arr[i - 1])
            {
                System.out.println("Last index:" + i);
                System.out.println("Last duplicate item: "
                        + arr[i]);
                return;
            }
        }

        // If we reach here, then no duplicate
        // found.
        System.out.print("no duplicate found");
    }

    // Driver code
    public static void main (String[] args)
    {
        int arr[] = {1, 5, 5, 6, 6, 7, 9};
        int n = arr.length;
        dupLastIndex(arr, n);

    }
}
