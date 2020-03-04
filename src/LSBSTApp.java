
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mark
 */
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class LSBSTApp {
    
    static BinaryTree bt = new BinaryTree();
    
    
    
    public static void main(String[] args) throws FileNotFoundException {
        
        String datahead = "/home/mark/javaWork/ass_1/";
        String tail = "data.txt";
        if (args.length ==4){
            tail = args[3];
        }
        
        File data = new File(datahead+tail);
        Scanner sc = new Scanner(data);
        
        while (sc.hasNextLine()){
            String use = sc.nextLine();
            String stageTry = use.substring(0, use.indexOf('_'));
            
            use = use.substring(use.indexOf('_')+1);
            String dayTry = use.substring(0, use.indexOf('_'));
            
            use = use.substring(use.indexOf('_')+1);
            
            String timeTry = use.substring(0, use.indexOf(' '));
            
            if (dayTry.length() == 1){
                dayTry = "0" + dayTry;
            }
            
            String send = stageTry + dayTry + timeTry;
            
            
            Entry entry = new Entry(send, use.substring(use.indexOf(' ')+1));
            
            bt.add(entry);
        }
        sc.close();
        System.out.println(Entry.opCountBS);
        Entry.opCountBS = 0;
        
        if (args.length > 2){
            printAreas(args[0], args[1], args[2]);
        }
        if (args.length == 0){
            printAllAreas(bt.root);
        }
        System.out.println(Entry.opCountBS);
        
    }
    
    public static void printAreas(String stage, String day, String time){
        if (day.length()==1){
            day = "0" + day;
        }
        bt.containsNode(new Entry(stage+day+time, " "));
        
    }
    public static void printAllAreas(Node node){
        if (node != null) {
        printAllAreas(node.left);
        System.out.println("Stage: " + node.entry.send.substring(0,1) + " Day: " + node.entry.send.substring(1,3) + " Time: " + node.entry.send.substring(3,5) + " Areas: " + node.entry.areas);
        printAllAreas(node.right);
    }
    }
}
