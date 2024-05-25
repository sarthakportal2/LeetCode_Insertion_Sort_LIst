class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode tmp=new ListNode(0);
        ListNode curr=head;
        while(curr!=null){
           ListNode prev=tmp;ListNode nextNode=curr.next;
            while(prev.next!=null && prev.next.val<curr.val){
                prev=prev.next;}
                curr.next=prev.next;
                prev.next=curr;
                curr=nextNode;}
        return tmp.next;}} 

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
