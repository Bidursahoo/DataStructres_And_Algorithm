package Compitetive.ProgramingClasses;

import java.util.Scanner;

public class LinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    Node head = null;
    void print(){
        Node n = head;
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
    }
    void insertFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    void append(int data){
        Node newNode = new Node(data);
        if(head == null){
            head= newNode;
            return;
        }
        Node n = head;
        while(n.next!=null){
            n=n.next;
        }
        n.next = newNode;
    }
    void insertAfterNode(int data , int newData){
        Node newNode = new Node(newData);
        if(head==null){
            System.out.println("Error Linked List is empty");
        }else{
            Node n = head;
            while(n.data != data && n!=null ){
                n=n.next;
            }
            if(n.next!=null){
                newNode.next = n.next;
            }
            n.next = newNode;
        }
    }void deleteWithValue(int data){
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }
        Node n = head;
        if(n.data == data){
            head = n.next;
            return;
        }else{
            while(n.next !=null && n.next.data != data){
                n= n.next;
            }
            if(n.next != null){
                n.next = n.next.next;
            }
        }
    }
    int size(){
        if(head == null){
            return 0;
        }
        int count=0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    boolean search(Node head , int data){
        Node temp = head;
        while(temp!=null){
            if(temp.data == data){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    void sort(){
        Node n = head;
        while(n!=null){
            Node m = n.next;
            while(m!= null){
                if(m.data < n.data){
                    int temp = m.data;
                    m.data = n.data;
                    n.data = temp;
                }
                m=m.next;
            }
            n=n.next;
        }
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of list you want to enter: ");
        int num = sc.nextInt();
        for(int i = 1 ; i<= num ; i++){
            System.out.print("Enter the data: ");
            int data = sc.nextInt();
            l.append(data);
        }
        l.print();
        l.sort();
        System.out.println();
        l.print();
//        int data = sc.nextInt();
//        System.out.println(l.size());
//        int data2 = sc.nextInt();
//        l.deleteWithValue(data);
//        l.print();
//        l.insertAfterNode(data , data2);
//        l.print();
    }

}
