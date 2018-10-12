package com.asim.interviewr2;

public class Solution {

    static int[] reverseArray(int[] a) {

        int[] b = new int[a.length];
        int j=0;
        for (int i=a.length-1;i<=0;i--)
        {
            b[j] = a[i];
            j++;
        }

        for(int k=0; k<a.length; k++)
        {
            System.out.println("Element number" + " " + " " + b[k]);
           // System.out.println("Element number in b" + " " + k + " " + b[k]);
        }

        return b;
    }

    public static void main (String[] args)
    {
        int [] array = {1,2,4,5};
        Solution test = new Solution();
        test.reverseArray(array);
    }
}
