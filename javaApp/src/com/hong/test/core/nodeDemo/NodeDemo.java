package com.hong.test.core.nodeDemo;

import com.hong.test.core.domain.Node;

/**
 * 翻转链表：
 * demo1：https://blog.csdn.net/qq_35261940/article/details/128199501
 * demo2：https://blog.csdn.net/guyuealian/article/details/51119499
 */
public class NodeDemo  {
    public static void main(String[] args) {
linkedListReverse();
    }

    private static void linkedListReverse() {
        Node head = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);

        Node h = head;
        while (null != h) {
            System.out.print(h.getValue() + " ");
            h = h.getNext();
        }
        // 调用递归反转方法
//        head = reverse1(head);
        // 调用遍历反转方法
        head = reverse2(head);
        //
        System.out.println("\n**************************");
        // 打印反转后的结果
        while (null != head) {
            System.out.print(head.getValue() + " ");
            head = head.getNext();
        }

    }

    /**
     * 递归，在反转当前节点之前先反转后续节点
     */
    public static Node reverse1(Node head) {
        // head看作是前一结点，head.getNext()是当前结点，reHead是反转后新链表的头结点
        if (head == null || head.getNext() == null) {
            return head;// 若为空链或者当前结点在尾结点，则直接还回
        }
        Node reHead = reverse1(head.getNext());// 先反转后续节点head.getNext()
        head.getNext().setNext(head);// 将当前结点的指针域指向前一结点
        head.setNext(null);// 前一结点的指针域令为null;
        return reHead;// 反转后新链表的头结点
    }

    /**
     * 遍历，将当前节点的下一个节点缓存后更改当前节点指针
     * @param head
     * @return
     */
    public static Node reverse2(Node head) {
        if (head == null)
        {return head;}
        Node pre = head;// 上一结点
        Node cur = head.getNext();// 当前结点
        Node tmp;// 临时结点，用于保存当前结点的指针域（即下一结点）
        while (cur != null) {// 当前结点为null，说明位于尾结点
            tmp = cur.getNext();
            cur.setNext(pre);// 反转指针域的指向

            // 指针往下移动
            pre = cur;
            cur = tmp;
        }
        // 最后将原链表的头节点的指针域置为null，还回新链表的头结点，即原链表的尾结点
        head.setNext(null);
        return pre;
    }


}
