package leetcode;

public class MergeTwoSortedLinkedList {
    public ListNode1 mergeTwoLists(ListNode1 list1, ListNode1 list2) {
        ListNode1 node = new ListNode1();
        ListNode1 headNode = node;
        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                node.next = list1;
                list1 = list1.next;
            } else {
                node.next = list2;
                list2 = list2.next;
            }

            node = node.next;
        }

        if(list1 == null) {
            node.next = list2;
        } else {
            node.next = list1;
        }
        return headNode.next;
    }
}


class ListNode1 {
    int val;
 ListNode1    next;
 ListNode1() {}
    ListNode1(int val) { this.val = val; }
       ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
}
