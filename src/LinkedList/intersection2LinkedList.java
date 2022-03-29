package LinkedList;

class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1(int x) {
        val = x;
        next = null;
    }

    ListNode1(int x, ListNode1 next) {
        this.val = x;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append("Node: ").append(this.val);
        ListNode1 pointer =this;
        while(pointer.next!=null){
            sb.append("->").append(pointer.next.val);
            pointer=pointer.next;

        }
        return sb.toString();
    }
}

public class intersection2LinkedList {

    public static ListNode1 getIntersectionNode(ListNode1 headA, ListNode1 headB) {

        if(headA==null || headB==null) return null;
        ListNode1 ap=headA;
        ListNode1 bp=headB;
        while(ap!=bp){
            if(ap!=null){
                ap=ap.next;
            }else{
                ap=headB;
            }
            if(bp!=null){
                bp=bp.next;
            }else{
                bp=headA;
            }


        }
        return ap;
    }
    public static void main(String[] args) {
        ListNode1 n5n = new ListNode1(4, null);
        ListNode1 n4d = new ListNode1(4, n5n);
        ListNode1 n8 = new ListNode1(8, n4d);
        ListNode1 n1d = new ListNode1(1, n8);
        ListNode1 n6 = new ListNode1(6, n1d);
        ListNode1 n5 = new ListNode1(5, n6);

        ListNode1 n1u= new ListNode1(1, n8);
        ListNode1 n4u= new ListNode1(4, n1u);
        System.out.println(getIntersectionNode(n5, n4u).val);


    }
}
