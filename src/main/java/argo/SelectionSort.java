package argo;

public class SelectionSort {
    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2; // Tính chỉ số của phần tử giữa
            mergeSort(arr, l, m); // Sắp xếp nửa đầu của mảng
            mergeSort(arr, m + 1, r); // Sắp xếp nửa sau của mảng
            merge(arr, l, m, r); // Trộn hai nửa đã sắp xếp lại với nhau
        }
    }

    private static void merge(int[] arr, int l, int m, int r) {
        // Tính kích thước của hai mảng con cần trộn
        int n1 = m - l + 1;
        int n2 = r - m;

        // Tạo mảng tạm thời để lưu trữ hai nửa của mảng cần trộn
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Sao chép dữ liệu vào hai mảng tạm thời
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }

        // Khởi tạo chỉ số ban đầu của hai mảng con
        int i = 0, j = 0;

        // Khởi tạo chỉ số ban đầu của mảng đã trộn
        int k = l;

        // Trộn hai mảng con thành mảng đã sắp xếp
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

        // Sao chép các phần tử còn lại của L[] nếu có
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Sao chép các phần tử còn lại của R[] nếu có
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;
        mergeSort(arr, 0, n - 1); // Gọi hàm mergeSort để sắp xếp mảng
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

