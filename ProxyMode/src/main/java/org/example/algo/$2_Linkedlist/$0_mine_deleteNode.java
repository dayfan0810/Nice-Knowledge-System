package org.example.algo.$2_Linkedlist;

public class $0_mine_deleteNode {

    public static void main(String[] args) {
        // 创建一个示例链表: 1 -> 2 -> 3 -> 4
        MyListNode head = new MyListNode(1);
        head.next = new MyListNode(2);
        head.next.next = new MyListNode(3);
        head.next.next.next = new MyListNode(4);

        $0_mine_deleteNode $0MineDeleteNode = new $0_mine_deleteNode();
        $0MineDeleteNode.deleteNode(head,3);
        MyListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
    }

    public MyListNode deleteNode(MyListNode head, int target) {
        if (head == null) {
            return null;
        }
        if (head.val == target) {
            return head.next;
        }

        MyListNode pre = null;
        MyListNode cur = head;

        while (cur != null) {
            if (cur.val != target) {
                pre = cur;
                cur = cur.next;
            } else {
                pre.next = cur.next;
                //找到后就要跳出循环了
                break;
            }
        }
        return head;
    }
}

class MyListNode {
    int val;
    MyListNode next;

    MyListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
