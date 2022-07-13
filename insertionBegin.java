import java.util.Scanner;

class Node1{
    int data;
    Node1 link;
}

 class insertionBegin {
    public static void main(String[] args) {
        Node1 head = null, newnode = null, temp = null;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the element You want to insert or press -1:");
            int element = sc.nextInt();
            if (element == -1) {
                break;
            } else {
                newnode = new Node1();
                newnode.data = element;
                newnode.link = null;
                if (head == null) {
                    head = newnode;
                    temp = head;

                } else {
                    temp.link = newnode;
                    temp = newnode;
                }
            }
        }
        System.out.println("Elements of linked List are:");
        temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.link;
        }
        sc.close();
    }
}
