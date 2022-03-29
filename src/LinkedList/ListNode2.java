package LinkedList;

public class ListNode2 {
    public int val;
    public ListNode2 next;

//   public ListNode2(int x) {
//        val = x;
//        next = null;
//    }

    public ListNode2(int x, ListNode2 next) {
        this.val = x;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append("Node: ").append(this.val);
        ListNode2 pointer =this;
        while(pointer.next!=null){
            sb.append("->").append(pointer.next.val);
            pointer=pointer.next;

        }
        return sb.toString();
    }
}
