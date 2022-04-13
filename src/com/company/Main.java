package com.company;
import java.util.Scanner;
class quicksort {
    int partition(int b[], int start, int end) {
        int pivot = b[end];
        int pindex = start;
        for (int i = start; i < end - 1; i++) {
            if (b[i] <= pivot)
            {
                int t = b[pindex];
                b[pindex] = b[i];
                b[i] = t;
                pindex++;
            }
        }
        int t = b[pindex];
        b[pindex] = b[end];
        b[end] = t;
        return (pindex);
    }

    void quick1(int a[], int start, int end) {
        if (start < end)
        {
            int p = partition(a, start, end);
            quick1(a, start, p - 1);
            quick1(a, p + 1, end);
        }
    }
}
public class Main {
    public static void main(String[] args){
        int n,i,j,loc,a[],ptr,temp;
        Scanner sc=new Scanner(System.in);
        System.out.print("how many element do u want enter :");
        n=sc.nextInt();
        a=new int[n];
        System.out.print("enter the element:");
        for( i=0;i<n;i++)
            a[i]=sc.nextInt();
        quicksort q1=new quicksort();
        q1.quick1(a,0,n-1);
        for( i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
