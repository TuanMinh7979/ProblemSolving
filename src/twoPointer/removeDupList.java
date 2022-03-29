package twoPointer;


import LinkedList.ListNode2;

public class removeDupList {

    public static ListNode2 deleteDuplicates(ListNode2 head) {
        if(head==null) return null;
        ListNode2 curnode= head;
        ListNode2 nextnode= head.next;
        while(nextnode != null){
            if(curnode.val==nextnode.val){
                if(nextnode.next==null) {curnode.next=null; return head;};
                nextnode=nextnode.next;

            }else{
                curnode.next=nextnode;
                curnode=curnode.next;
                nextnode=nextnode.next;

            }


        }

        return head;

    }

    public static void main(String[] args) {
        ListNode2 n3n=new ListNode2(3,null);
        ListNode2 n3=new ListNode2(3,n3n);
        ListNode2 n2=new ListNode2(2,n3);
        ListNode2 n1n=new ListNode2(1,n2);
        ListNode2 n1=new ListNode2(1,n1n);
        ListNode2 rs= deleteDuplicates(n1);
        System.out.println(rs);


    }
}
