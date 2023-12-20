package org.example.algo.$2_Linkedlist;

public class $876_middleNode {

    public ListNode876 middleNode_1(ListNode876 head) {
        ListNode876 fast = head;
        ListNode876 slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        if (fast.next == null) {
            return slow;
        } else {
            return slow.next;
        }
    }

    public ListNode876 middleNode_2(ListNode876 head) {
        return null;




    }

    public static void main(String[] args) {
        // 创建测试链表
        // 创建奇数个节点的链表
        ListNode876 oddList = new ListNode876(1);
        oddList.next = new ListNode876(2);
        oddList.next.next = new ListNode876(3);
        oddList.next.next.next = new ListNode876(4);
        oddList.next.next.next.next = new ListNode876(5);

        // 创建偶数个节点的链表
//        ListNode876 evenList = new ListNode876(1);
//        evenList.next = new ListNode876(2);
//        evenList.next.next = new ListNode876(3);
//        evenList.next.next.next = new ListNode876(4);
//        evenList.next.next.next.next = new ListNode876(5);
//        evenList.next.next.next.next.next = new ListNode876(6);


        $876_middleNode solution = new $876_middleNode();
        ListNode876 oddList_result = solution.middleNode_1(oddList);
        System.out.println("奇数个节点链表的中间节点值：" + oddList_result.val);
//        ListNode876 evenList_result = solution.middleNode(evenList);
//        System.out.println("偶数个节点链表的中间节点值：" + evenList_result.val);


    }
}

class ListNode876 {
    int val;
    ListNode876 next;

    ListNode876() {
    }

    ListNode876(int val) {
        this.val = val;
    }

    ListNode876(int val, ListNode876 next) {
        this.val = val;
        this.next = next;
    }
}
