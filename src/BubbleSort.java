

public class BubbleSort {

    public void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    /* Prints the array */
    public  void display(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {

        BubbleSort ob = new BubbleSort();
        int arr[] = { 68, 33, 29, 12, 22, 11, 95 };
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.display(arr);
    }
}