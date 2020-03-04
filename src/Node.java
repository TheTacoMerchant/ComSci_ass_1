
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mark
 */
class Node {
    Entry entry;
    Node left;
    Node right;
 
    Node(Entry entry) {
        this.entry = entry;
        right = null;
        left = null;
    }
}
