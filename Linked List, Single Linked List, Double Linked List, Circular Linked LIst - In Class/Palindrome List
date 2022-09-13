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
public static boolean IsPalindrome(Node head) {
//enter your code here
    if(head == null){
        return true;
    }
    Node p = head;
    Node pre = new Node(head.val);

    while(p.next != null){
        Node temp = new Node(p.next.val);
        temp.next = pre;
        pre = temp;
        p = p.next;
    }
    Node p1 = head;
    Node p2 = pre;

    while(p1 != null){
        if(p1.val != p2.val)
        return false;

        p1 = p1.next;
        p2 = p2.next;
    }
    return true;
}
