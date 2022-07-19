class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class removeNthFromEndMain {
    public static void main(String[] args) {
        removeNthFromEndMain obj = new removeNthFromEndMain();
        System.out.println("Hi");

        ListNode l7 = new ListNode(2);
        ListNode l6 = new ListNode(2, l7);
        ListNode l5 = new ListNode(2, l6);
        ListNode l4 = new ListNode(1, l5);
        ListNode l3 = new ListNode(1, l4);
        ListNode l2 = new ListNode(1, l3);
        ListNode l1 = new ListNode(1, l2);

        obj.printList(l1);
        System.out.println("\n");

        // obj.removeNthNodeFromEnd(l1, 5);

        //obj.printList(obj.removeNthNodeFromEnd(l1, 5));

        //obj.deleteDuplicates(l1);
        System.out.println("Ans :");
        ListNode ans = obj.deleteDuplicates(l1);

        obj.printList(ans);

        System.out.println("\n");


    }

    public ListNode deleteDuplicates(ListNode head) {

        ListNode cur = head;

        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;

        ListNode prev = fakeHead;
        int flag = 0;


        if (head == null) {
            return head;
        }

        while (cur != null) {

            while (cur.next != null && (cur.val == cur.next.val)) { //3 == 3

                flag = 1;
                cur = cur.next;

            }
            if (flag == 1) {
                // System.out.println(prev.val + " " + cur.val);
                prev.next = cur.next;
                cur = prev;
                flag = 0;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }

        return fakeHead.next;

    }

    public ListNode deleteDuplicates1(ListNode head) {

        ListNode temp = head;
        ListNode prev = null;
        ListNode pushNode = null;
        int flag = 0;

        if (temp.next == null) {
            return head;
        }

        while (temp.next != null) {
            if (temp.val == temp.next.val) {
                // System.out.println(temp.val);
                // System.out.println(temp.next.val);
                pushNode = temp.next.next;
                temp.next = temp.next.next;
                if (temp.next == null) {
                    return head;
                }
                continue;
            }

            if (flag == 1 ) {
                prev = pushNode;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;

    }


    public ListNode removeNthNodeFromEnd(ListNode head, int n) {

        ListNode firstPointer = head;
        ListNode secondPointer = head;
        ListNode temphead = head;

        // move first pointr to nth position

        int i = n;
        while (i != 0) {

            firstPointer = firstPointer.next;
            i--;

            if (firstPointer == null) {
                System.out.println("nth node doesnt exist from the last");
                if (i == 0) {
                    head = head.next;
                    return head;
                }
                return head;
            }
        }

        System.out.println("First pointer pos :" + firstPointer.val );
        System.out.println("Second pointer pos :" + secondPointer.val );

        while (firstPointer.next != null) {

            secondPointer = secondPointer.next;
            firstPointer = firstPointer.next;

        }

        // now second pointer is at the place where node is there to delete

        // * -> sp -> *

        ListNode deleteNode = secondPointer.next;

        secondPointer.next = secondPointer.next.next;

        System.out.println("Node deleted is :" + deleteNode.val);
        deleteNode = null;

        return head;
    }

    public void printList(ListNode head) {
        if (head == null) {
            return;
        }

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
    }


}

