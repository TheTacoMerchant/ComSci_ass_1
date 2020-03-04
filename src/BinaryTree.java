

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mark
 */
public class BinaryTree {
    
    Node root;
    

    
    private Node addRecursive(Node current, Entry entry) {
        
        
    if (current == null) {
        return new Node(entry);
    }
 
    if (entry.compareTo(current.entry) < 0) {
        current.left = addRecursive(current.left, entry);
        
    } else  {
        current.right = addRecursive(current.right, entry);
    }
   
 
    return current;
    }
    
    public void add(Entry entry){
        root = addRecursive(root, entry);
    }
    
    private boolean containsNodeRecursive(Node current, Entry entry) {
        
    if (current == null) {
        System.out.println("Areas not found");
        return false;
    } 
    if (entry.compareTo(current.entry) == 0) {
        System.out.println(current.entry.areas);
        
        return true;
    } 
    return entry.compareTo(current.entry) < 0
      ? containsNodeRecursive(current.left, entry)
      : containsNodeRecursive(current.right, entry);
}
    public boolean containsNode(Entry entry) {
    return containsNodeRecursive(root, entry);
}
}
