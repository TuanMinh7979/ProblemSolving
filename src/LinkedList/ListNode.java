package LinkedList;

public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }


    public static void printList(ListNode n1) {

        System.out.print(n1.val+ "-->");
        //muon in toi dau thi no phai != cai do, vd muon in toi none thi phai khac = null
        //muon in toi 5 thi n1.next !=null

        //ta cong truoc sau do ta moi in
        //phai chay vao trong vong lap den 5, thi moi co the in dc null
        while (n1!= null) {

            n1 = n1.next;
            if(n1==null) {
                System.out.print("none");
            }else{
                System.out.print(n1.val+"-->");
            }


        }
    }
}
