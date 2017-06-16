package com.company;

/**
 * Created by abhijit_kamat on 6/15/17.
 */
class LinkedList {
    Node head;

    void insert(int num){
        System.out.println("Inserting " + num);
        Node insertNode = new Node(num);
        if(head==null){
            head = insertNode;
            print();
            return;
        }
        Node curr = head;
        Node prev = head;
        while(curr.next != null && curr.data < num){
            curr = curr.next;
        }
        if(curr == head && curr.data > num){
            head = insertNode;
            head.next = curr;
            print();
            return;
        }

        if(curr.next == null && num > curr.data){
            curr.next = insertNode;
            print();
            return;
        }
        while(prev.next != curr){
            prev = prev.next;
        }
        prev.next = insertNode;
        insertNode.next = curr;
        print();
    }

    void print(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
