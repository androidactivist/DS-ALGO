package sorting;

public class ZeroAtEndArray {

    public static void main(String... args) {

        //int a[] = {64, 34, 25, 12, 22, 11, 90};

        int a[] = {0, 0, 0, 5, 4, 3, 0, 2, 1};

        //int a[] = {4,0,0,6,2,0,1,0,10};

        printArray(a);
        moveZeroAtEnd(a, a.length);
        printArray(a);



    }


    /* Prints the array */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


    /**
     * in O(n)
     */
    private static void moveZeroAtEnd(int a[], int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                a[count] = a[i];
                count++;
            }
        }
        while (count < n) {
            a[count] = 0;
            count++;
        }

    }
}
