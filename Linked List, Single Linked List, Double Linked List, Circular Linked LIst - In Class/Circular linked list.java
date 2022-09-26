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

public static int check(Node head) {
//enter your code here
    Node temp = head;
    while(true){
        if(temp.next == null){
            return 0;
        }
        if(temp.next == head){
            return 1;
        }
        temp = temp.next;
    }
}
