package am.sam;

public class Heap {
    int[] heap; // pointer to array of elements in heap
    int capacity; // maximum possible size of min heap
    int heap_size; // Current number of elements in min heap

    Heap(int capacity) {
        heap_size = 0;
        this.capacity = capacity;
        heap = new int[capacity];
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    int left(int i) {
        return (2 * i + 1);
    }

    int right(int i) {
        return (2 * i + 2);
    }

    int getMin() {
        return heap[0];
    }

    void insertKey(int key) {
        if (heap_size == capacity) {
            System.out.println("Overflow: Could not insertKey");
            return;
        }
        heap_size++;
        int i = heap_size - 1;
        heap[i] = key;

        while (i != 0 && heap[parent(i)] > heap[i]) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    // Decreases value of key at index 'i' to new_val. It is assumed that
    // new_val is smaller than harr[i].
    void decreaseKey(int i, int new_val) {
        if(heap[i] > new_val) {
            heap[i] = new_val;
        }
        else {
            System.out.println("new value is greater");
            return;
        }
        while (i != 0 && heap[parent(i)] > heap[i]) {
            swap(i, parent(i));
            i = parent(i);
        }
    }
    // Method to remove minimum element (or root) from min heap
    void deleteMin() {
        if (heap_size <= 0) {
            return;
        }
        if (heap_size == 1) {
            heap_size--;
            return;
        }
        // Store the minimum value, and remove it from heap
        heap[0] = heap[heap_size - 1];
        heap_size--;
        minHeapify(0);
    }

    // This function deletes key at index i. It first reduced value to minus
// infinite, then calls extractMin()
    // Deletes a key stored at index i
    void deleteKey(int i) {
        decreaseKey(i, Integer.MIN_VALUE);
        deleteMin();
    }

    void minHeapify(int i) {
        int l = left(i);
        int r = right(i);
        int smallest = i;

        if (l < heap_size && heap[l] < heap[smallest])
            smallest = l;
        if (r < heap_size && heap[r] < heap[smallest])
            smallest = r;
        if (smallest != i) {
            swap(i, smallest);
            minHeapify(smallest);
        }
    }

    void swap(int firstIndex, int secondIndex) {
        int temp = heap[firstIndex];
        heap[firstIndex] = heap[secondIndex];
        heap[secondIndex] = temp;
    }

    void print() {
        for(int i = 0; i < heap_size; i++) {
            System.out.print(heap[i] + " ");
        }
    }

}
