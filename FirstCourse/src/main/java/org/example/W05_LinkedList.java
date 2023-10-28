package org.example;
class Node{
  int data;
  Node next;
  public Node(int data){
    this.data = data;
    this.next = null;
  }
}

class LinkedList{
  private Node head;
  public LinkedList(){
    head=null;
  }
  public void add(int data){
    Node nodeToBeAdded=new Node(data);
    if(head==null){
      head=nodeToBeAdded;
    } else{
      Node current=head;
      while(current.next!=null){
        current=current.next;
      }
      current.next=nodeToBeAdded;
    }
  }
  public void delete(int data){
    if(head==null){
      return;
    }
    if(head.data==data){
      head=head.next;
    }
    Node current = head;
    while(current.next!=null){
      if(current.next.data==data){
        current.next=current.next.next;
      }
      current=current.next;
    }
  }
  public void display(){
    Node current=head;
    while(current!=null){
      System.out.print(current.data + " -> ");
      current=current.next;
    }
    System.out.println("null");
  }

  public Node findMiddle(){
    if(head==null){
      return null;
    }
    Node slowPointer=head;
    Node fastPointer=head;
    while(fastPointer!=null && fastPointer.next!=null){
      slowPointer=slowPointer.next;
      fastPointer=fastPointer.next.next;
    }
    return slowPointer;
  }
}

public class W05_LinkedList {

  public static void main(String[] args) {
      LinkedList linkedList=new LinkedList();
      linkedList.add(3);
      linkedList.add(4);

      linkedList.display();

      linkedList.add(6);
      linkedList.add(8);

      linkedList.display();
      System.out.println(linkedList.findMiddle().data);
      linkedList.delete(6);
      linkedList.display();
      System.out.println(linkedList.findMiddle().data);
  }

}
