
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mark
 */
public class Entry implements Comparable<Entry> {
    
    String areas, send;
    int comp;
    public static int opCountBS; 
    
    public Entry(String send, String areas){
        this.areas = areas;
        this.send = send;
        this.comp = Integer.parseInt(this.send);
        
    }
    
    public int compareTo(Entry entry){
        
        
        opCountBS++;
        return comp - entry.comp;        
    
    }    
}
