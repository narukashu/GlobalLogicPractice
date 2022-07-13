package Function;

import java.util.Scanner;

public class fun_mergeSort {
    static void merge(int[] arr, int l, int mid, int r) {

        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[i + l];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[j + mid + 1];
        }

        int i = 0, j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void mergesort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
          
            mergesort(arr, l, mid);
            mergesort(arr, mid + 1, r);

            merge(arr, l, mid, r);
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);

        mergesort(arr, 0, size - 1);
        printArray(arr);
        sc.close();
    }
}
