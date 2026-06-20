public class Binaryheap {
    int arr[] = new int[100];
    int size = 0;

    void insertion(int val) {
        size++;
        arr[size] = val;
        int i = size;
        while (i > 1) {
            int parent = i / 2;
            if (arr[parent] < arr[i]) {
                swap(arr, i, parent);
                i = parent;
            } else {
                break;
            }
        }
    }

    void deletion() {
        arr[1] = arr[size--];
        for (int i = 1; ; ) {
            int left = 2 * i, right = left + 1, larger = i;
            if (left <= size && arr[left] > arr[larger]) larger = left;
            if (right <= size && arr[right] > arr[larger]) larger = right;
            if (larger == i) break;
            swap(arr, i, larger);
            i = larger;
        }
    }

    void heapify(int arr[], int size, int i) {
        int larger = i;
        int left = 2 * i;
        int right = 2 * i + 1;
        if (left <= size && arr[left] > arr[larger]) {
            larger = left;
        }
        if (right <= size && arr[right] > arr[larger]) {
            larger = right;
        }
        if (larger != i) { // same hai toh phir swap kaeke kya hi kar loge
            swap(arr, i, larger);
            // phir after swap kya check akroge vaha se bhi valid heap hai ya nahi jahan se swap kiya tha
            heapify(arr, size, larger);
        }
    }

    void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void printHeap(int arr[], int size) {
        for (int i = 1; i <= size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Binaryheap obj = new Binaryheap();
        obj.insertion(90);
        obj.insertion(80);
        obj.insertion(70);
        obj.insertion(60);
        obj.insertion(50);
        obj.insertion(40);
        obj.insertion(30);
        obj.insertion(300);
        obj.printHeap(obj.arr, obj.size);
        obj.deletion();
        obj.printHeap(obj.arr, obj.size);
        obj.deletion();
        obj.printHeap(obj.arr, obj.size);
        System.out.println("see below");
//        // int arr1[] = {-1, 10, 56, 23, 100, 67, 82};
        int arr1[] = {-1, 50, 45 , 62, 65, 33 , 35 , 48 , 60 , 48 , 67 };
        int n = arr1.length - 1;// because size 1 kam pe hogi na becuase 1 based indexing hai na , right okay
        for (int i = n / 2; i >= 1; i--) {
            obj.heapify(arr1, n, i);
        }
        obj.printHeap(arr1, n);
        for (int i = n; i >= 1; i--) {
            int temp = arr1[i];
            arr1[i] = arr1[1];
            arr1[1] = temp;
            obj.heapify(arr1, i - 1, 1);
        }
        obj.printHeap(arr1, n);
    }
}
