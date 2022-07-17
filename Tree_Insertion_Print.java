import java.util.Scanner;

class binary<T> {
    T data;
    binary<T> Left;
    binary<T> Right;

    binary(T data) {
        this.data = data;
    }
}
class operations {
    String msg = "root";
    Scanner sc = new Scanner(System.in);
    int parent = -1;

    binary inertion() {
        System.out.println("Enter The date for " + msg + " Node and Having parent is " + parent);
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        binary<Integer> node = new binary<>(data);
        msg = "left";
        parent = data;
        node.Left = inertion();
        parent = data;
        msg = "Right";
        node.Right = inertion();
        parent = data;
        msg = "root";
        return node;
    }

    void print(binary<Integer> root) {
        String out = "";
        if (root == null) {
            return;
        }
        out += root.data + " ==>";
        if (root.Left != null) {
            out += " Left " + root.Left.data;
        }
        if (root.Right != null) {
            out += " Right " + root.Right.data;
        }
        System.out.println(out);
        print(root.Left);
        print(root.Right);
    }
}
public class BinarytreeOperation {
    public static void main(String[] args) {
        operations op = new operations();
        binary<Integer> node = op.inertion();
         op.print(node);

    }
}
