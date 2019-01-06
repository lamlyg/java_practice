package d05;

import java.util.*;

public class Quick {
    static int N;
    static int arr[];
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input N: ");
        N = input.nextInt();
        arr = new int[N];
        
        System.out.println("Input N numbers to Quick sort: ");
        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }
        quickSort(arr, 0, N - 1);
        for (int i = 0; i < N; i++) {
            System.out.print(String.valueOf(arr[i]) + ' ');
        }
        input.close();
    }
    
    static void quickSort(int arr[], int left, int right) {
        int pivot, left_temp, right_temp;
        left_temp = left;
        right_temp = right;
        pivot = arr[left];
        while (left < right) {
            while (arr[right] >= pivot && (left < right)) {
                right--;
            }
            if (left != right) {
                arr[left] = arr[right];
            }
            while (arr[left] <= pivot && (left < right)) {
                left++;
            }
            if (left != right) {
                arr[right] = arr[left];
                right--;
            }
        }
        arr[left] = pivot;
        pivot = left;
        left = left_temp;
        right = right_temp;
        if (left < pivot) quickSort(arr, left, pivot - 1);
        if (right > pivot) quickSort(arr, pivot + 1, right);
    }

}
	