package LinkedList;


import java.util.ArrayList;

public class OddEven {

    public static ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        if(head.next==null) return head;

        ListNode cur = head;
        int i = 0;
        ArrayList<ListNode> afterlist = new ArrayList<>();
        while (cur.next != null) {
            i++;
            if (i % 2 != 0) {
                ListNode temp = cur.next;
                cur.next = temp.next;
                afterlist.add(temp);
            } else {
                cur = cur.next;
                //System.out.println("---cur val"+cur.val);
                //System.out.println("---head val"+head.val);
            }
        }
        int size = afterlist.size();
        for (int j = 0; j <= size - 1; j++) {
            if (j == size - 1) {
                afterlist.get(j).next = null;
            } else {
                afterlist.get(j).next = afterlist.get(j + 1);
            }
        }
        ListNode oddListNode = head;
        while (oddListNode.next != null) {
            oddListNode = oddListNode.next;
        }
        // System.out.println(afterlist.size());
        oddListNode.next = afterlist.get(0);
        return head;
    }

    public static void main(String[] args) {
        ListNode n7 = new ListNode(7, null);
        ListNode n4 = new ListNode(4, n7);
        ListNode n6 = new ListNode(6, n4);
        ListNode n5 = new ListNode(5, n6);


        ListNode n3 = new ListNode(3, n5);
        ListNode n1 = new ListNode(1, n3);
        ListNode n2 = new ListNode(2, n1);
        ListNode.printList(n2);
        ListNode rs = oddEvenList(n2);
        System.out.println("_________________");
        ListNode.printList(rs);


    }
}
