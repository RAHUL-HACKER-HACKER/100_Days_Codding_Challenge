
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head; //if the head is null
        if(head.next==null && head.val==n) return null;
        //if LL contains only one node and it is equal to n so return null
        int count = 0;
        ListNode temp = head;
        while(temp!=null){
            count++;    //counting the number of nodes in the LL
            temp = temp.next;
        }
        temp = head;
        if(count==2){     //special case for only 2 nodes in LL
            if(n==1){     //if 1st node from end is to be removed
                temp.next = null;
                return head;
            }else if(n==2){  //if the 2nd node from end is to be removed
                return temp.next;
            }
        }
        if(count-n==0){
            //if count-n==0 which means the head node is to be removed
            head = head.next;
            return head;
        }
        for(int i=0;i<count-n-1;i++){
            //if we need to remove a node which is in the middle of the LL
            temp = temp.next;
        }
       
        temp.next = temp.next.next;
        return head;
    }
}