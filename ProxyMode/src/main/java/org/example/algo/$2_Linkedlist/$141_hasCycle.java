package org.example.algo.$2_Linkedlist;

public class $141_hasCycle {
    public boolean hasCycle(ListNode141 head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode141 slow = head;
        ListNode141 fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }

    public static void main(String[] args) {
        // 创建测试链表
        ListNode141 node1 = new ListNode141(1);
        ListNode141 node2 = new ListNode141(2);
        ListNode141 node3 = new ListNode141(3);
        ListNode141 node4 = new ListNode141(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;  // 创建环

        // 创建 LinkedListCycle 实例
        $141_hasCycle solution = new $141_hasCycle();

        // 测试函数
        boolean result = solution.hasCycle(node1);
        System.out.println(result);
    }
}

class ListNode141 {
    int val;
    ListNode141 next;

    ListNode141(int x) {
        val = x;
        next = null;
    }
}
