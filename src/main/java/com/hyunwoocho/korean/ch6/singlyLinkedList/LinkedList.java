package com.hyunwoocho.korean.ch6.singlyLinkedList;

public class LinkedList {

    private ListNode head;

    public LinkedList() {
        head = null;
    }

    public void insertLastNode(String data) {
        ListNode newNode = new ListNode(data);

        if (head == null) {
            this.head = newNode;
        } else {
            ListNode temp = head;
            while (temp.link != null) {
                temp = temp.link;
            }
            temp.link = newNode;
        }
    }

    public void pintList() {
        ListNode temp = this.head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.link;
        }
    }

}
