/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/

public static Node Insertion(Node head, int K){
//Enter your code here 
    Node newNode = new Node(K);

    if(head == null){
        head = newNode;
        head.next = head;
        return head;
    }
    Node temp = head;
    while(temp.next != head){
        temp = temp.next;
    }
    newNode.next = head;
    temp.next = newNode;

    return head;
}
