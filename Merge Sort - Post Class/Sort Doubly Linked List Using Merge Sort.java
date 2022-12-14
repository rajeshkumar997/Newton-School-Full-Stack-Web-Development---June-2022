Node mergeSort(Node node, int n) {

     if (node.next == null)
        return node;

     Node mid = findMid(node);
     Node head2 = mid.next;
     mid.next = null;
     Node newHead1 = mergeSort(node, n);
     Node newHead2 = mergeSort(head2, n);
     Node finalHead = merge(newHead1, newHead2);
 
       return finalHead;
  }
 
  static Node merge(Node head1, Node head2)
  {
     Node merged = new Node(-1);
     Node temp = merged;
     
     while (head1 != null && head2 != null) {
        if (head1.data < head2.data) {
              temp.next = head1;
              head1 = head1.next;
        }
        else {
              temp.next = head2;
              head2 = head2.next;
        }
        temp = temp.next;
     }
     
     while (head1 != null) {
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;
     }
     
     while (head2 != null) {
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
     }
     return merged.next;
  }

  static Node findMid(Node head)
  {
     Node slow = head, fast = head.next;
     while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
     }
     return slow;
  }

  static void printList(Node head)
  {
     while (head != null) {
        System.out.print(head.data + " ");
        head = head.next;
     }
  }
