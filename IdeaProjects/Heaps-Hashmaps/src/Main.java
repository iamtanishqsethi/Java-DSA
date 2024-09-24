import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap= new Heap<>();
        heap.insert(8);
        heap.insert(7);
        heap.insert(9);
        heap.insert(10);
        heap.insert(11);
        heap.insert(12);
        heap.insert(14);
        heap.insert(13);
        heap.insert(5);
        ArrayList<Integer> list =heap.heapSort();
        System.out.println(list);

    }
}
