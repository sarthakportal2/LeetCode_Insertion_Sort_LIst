class Solution {
    public ListNode insertionSortList(ListNode head) {
        //
        ListNode tmp=new ListNode(0);//Temp node dynamic memory alloc
        ListNode curr=head;//curr node declare
        while(curr!=null){//Iterating curr node
           ListNode prev=tmp;ListNode nextNode=curr.next;//Prev nd nextNode declare
            while(prev.next!=null && prev.next.val<curr.val){//Iterating through entire linkedlist
                prev=prev.next;}//Prev's current node declare 
                curr.next=prev.next;prev.next=curr;//swapping curr nd prev's next node 
                curr=nextNode;}//Current 's NextNode declare
        return tmp.next;}} //Printing Inserted Sorted List 

    //testing
        // ListNode d=new ListNode(-1),curr=head;
        // while(curr!=null){
        //     ListNode tmp=curr.next;
        //     ListNode prev=d;
        //     ListNode nx=d.next;
        // }
        // while(nx!=null){//debug
        //     if(curr.next<tmp.next)break;prev=nxt;nx.next=nx;
        // }
        // prev.next=curr;
        // curr=t;
        // curr.next=nxt;
