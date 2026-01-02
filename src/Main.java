package src;

public class Main {

    // ===== ListNode =====
    static class ListNode {
        int val;
        ListNode next;
        ListNode random;

        ListNode(int val) {
            this.val = val;
        }
    }

    // ===== Solution =====
    static class copyRandomList {

        public ListNode copyRandomlist(ListNode head) {
            if (head == null) return null;

            ListNode curr = head;

            // 1️⃣ Insert copied nodes
            while (curr != null) {
                ListNode newNode = new ListNode(curr.val);
                newNode.next = curr.next;
                curr.next = newNode;
                curr = newNode.next;
            }

            // 🔴 FIX: reset curr
            curr = head;

            // 2️⃣ Copy random pointers
            while (curr != null) {
                if (curr.random != null)
                    curr.next.random = curr.random.next;
                curr = curr.next.next;
            }

            // 3️⃣ Separate lists
            curr = head;
            ListNode newHead = head.next;
            ListNode newCurr = newHead;

            while (curr != null) {
                curr.next = newCurr.next;
                curr = curr.next;

                if (curr != null) {
                    newCurr.next = curr.next;
                    newCurr = newCurr.next;
                }
            }

            return newHead;
        }
    }

    // ===== MAIN METHOD =====
    public static void main(String[] args) {

        // Create nodes
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);

        // Link next
        a.next = b;
        b.next = c;

        // Link random
        a.random = c;
        b.random = a;
        c.random = b;

        copyRandomList sol = new copyRandomList();
        ListNode copy = sol.copyRandomlist(a);

        // Print copied list
        ListNode temp = copy;
        while (temp != null) {
            int rand = temp.random != null ? temp.random.val : -1;
            System.out.println("Val: " + temp.val + " Random: " + rand);
            temp = temp.next;
        }
    }
}
