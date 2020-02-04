package sorting;

public class BubbleSort {

    public static void main(String...args) {

        //int a[] = {64, 34, 25, 12, 22, 11, 90};

        //int a[] = {5,4,3,2,1};

        int a[] = {4,3,7,6,2,9,1,12,10};

        printArray(a);
        bubbleSort(a, a.length);
        printArray(a);


    }


    /* Prints the array */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    /**
     * Bubble sort recusively
     */

    static void bubbleSort(int a[], int n) {

        if(n == 1) return;

        for(int i=0; i<n-1; i++) {
            if(a[i] > a[i+1]) {
                //swap the element
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }

        bubbleSort(a,n-1);

    }
}
