package LinkedList;

public class mergeSortedList {
    public static ListNode1 mergetSortedLists(ListNode1 list1, ListNode1 list2){
        ListNode1 firstNode= new ListNode1(0);
        ListNode1 cur= firstNode;
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

        ListNode1 b4= new ListNode1(4, null);
        ListNode1 b3= new ListNode1(3, b4);
        ListNode1 b1= new ListNode1(1, b3);

        ListNode1 a4= new ListNode1(4, null);
        ListNode1 a2= new ListNode1(2, a4);
        ListNode1 a1= new ListNode1(1, a2);
       //1 -> 3 ->4
        //1 ->2 ->4


        ListNode1.printList(mergeSortedList.mergetSortedLists(a1, b1));


    }
}
