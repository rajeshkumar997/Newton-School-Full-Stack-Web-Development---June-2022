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

public static Node addElement(Node head, int k ,int pos ) {
//enter your code here
pos = pos -1;
Node trackedHeadNode = head;

Node nodeToInsert = new Node(k);
if(pos == 0){
    nodeToInsert.next = head;
    return nodeToInsert;
}
int currPosition = 0;
while(currPosition < pos -1 && head.next != null){
    head = head.next;
    currPosition++;
}
Node nodeAtPosition = head.next;
head.next = nodeToInsert;
head = head.next;
head.next = nodeAtPosition;

return trackedHeadNode;
}
