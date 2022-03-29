package LinkedList;

public class mergeSortedList {
    public static ListNode mergetSortedLists(ListNode list1, ListNode list2){
        ListNode firstNode= new ListNode(0);
        ListNode cur= firstNode;
        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
                cur.next =list1;
                list1=list1.next;
            }
            else{
                cur.next =list2;
                list2=list2.next;
            }
            cur=cur.next;//is new l1 or new l2


        }
        if(list1!=null){
            cur.next=list1;
        }
        if(list2!=null){
            cur.next=list2;
        }
        return firstNode.next;
    }


    public static void main(String[] args) {

        ListNode b4= new ListNode(4, null);
        ListNode b3= new ListNode(3, b4);
        ListNode b1= new ListNode(1, b3);

        ListNode a4= new ListNode(4, null);
        ListNode a2= new ListNode(2, a4);
        ListNode a1= new ListNode(1, a2);
       //1 -> 3 ->4
        //1 ->2 ->4


        ListNode.printList(mergeSortedList.mergetSortedLists(a1, b1));


    }
}
