/*

class Node {
    Node next;
    Node prev;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
        prev = null;
    }
}
*/


public static Node insertnew(Node head,int k) {  
    Node newNode = new Node(k);
    if(head==null){
        head = newNode;
    }
    else if(head.val>=newNode.val){
        newNode.next = head;
        newNode.next.prev = newNode;
        head = newNode;
    }
    else{
        Node temp = head;
        while(temp.next!=null && temp.next.val<newNode.val){
            temp = temp.next;
        }
        newNode.next = temp.next;

        if(temp.next!=null){
            newNode.next.prev = newNode;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }
    return head;
}
