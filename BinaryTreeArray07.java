public class BinaryTreeArray07 {
    int[] data;
    int idxLast;
    int maxSize;

    public BinaryTreeArray07(int maxSize) {
        this.maxSize = maxSize;
        data = new int[maxSize];
        idxLast = -1;
    }

    void populateData(int data[], int idxLast) {
        if (data.length <= maxSize) {
            this.data = data;
            this.idxLast = idxLast;
        } else {
            System.out.println("Data size exceeds the maximum size of the binary tree.");
        }
    }

    void add(int data) {
        if (idxLast + 1 < maxSize) {
            idxLast++;
            this.data[idxLast] = data;
        } else {
            System.out.println("Binary tree is full. Cannot add more nodes.");
        }
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(this.data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(this.data[idxStart] + " ");
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            System.out.print(this.data[idxStart] + " ");
        }
    }
}
