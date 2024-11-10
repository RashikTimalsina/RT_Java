import java.util.*;

 class LinkedLists {
    
  
    public static void main(String[] args) {
        
        // LinkedList = Stores Nodes in 2 parts (data + address)
        //             Nodes are in non-consecutive memory locations
        //              Elements are linked using pointers

        //                                  Singly LL
        //                 Node                        NOde                    Node        
        //         [data | address]  ->      [data | address]   ->     [data | address]
    


        //                                 Doubly LL   
        //                 Node                                 Node
        //             [address1 | data | address2]   ->     [address1 | data | address2]   (can begin from head or tail as our wish)
                    

        //                   Main Pros of LL is:
        //                   Insertion and Deletion of nodes is very easy to do unlike ArrayList

        //                    Main Cons of LL is:
        //                   Accessing, Sorting and Searching elements is more time consuming
    
    
        //                      Main use of LL is:
        //                      Implemented by Stacks or Queues 
        //                      GPS Navigation
        //                       Music Playlist



        LinkedList<String> linkedList=new LinkedList<String>();

        linkedList.push("A");           //firstly added goes to last
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");           //lastly added goes to top


        System.out.println(linkedList);







    }



}
