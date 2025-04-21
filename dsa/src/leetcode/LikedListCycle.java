package leetcode;

class ListNode {
    int data;
    ListNode next;
    ListNode(int data) {
        this.data = data;
        next = null;
    }
}

public class LikedListCycle {
    public boolean hasCycle(ListNode head) {
        // Set<ListNode> set = new HashSet<>();

        if(head == null) {
            return false;
        }

        // ListNode current = head;
        // while(current.next != null) {
        //     ListNode address = current.next;
        //     if(set.contains(address)) {
        //         return true;
        //     }
        //     set.add(address);
        //     current = current.next;
        // }

        ListNode oneMove = head;
        ListNode twoMove = head;

        while(oneMove != null && twoMove != null && twoMove.next != null) {

            oneMove = oneMove.next;
            twoMove = twoMove.next.next;

            if(oneMove == twoMove) {
                return true;
            }
        }

        return false;
    }
}
