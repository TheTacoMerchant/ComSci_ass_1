
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



public class LSArrayApp {

    static String entries[] = new String[2976];
    static int opCount = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        File data = new File("/home/mark/javaWork/ass_1/data.txt");
        Scanner sc = new Scanner(data);
        
        for (int i = 0; i < data.length(); i++){
            entries[i] = sc.nextLine();
        }
        sc.close();
        if (args.length == 3){
            System.out.println(printAreas(args[0], args[1], args[2]));
        }
        if (args.length == 0){
            printAllAreas();
        }
        System.out.println(opCount);
    }
    
    public static String printAreas(String stage,String day,String sTime){
        String answer = " ";
        
        for (int i = 0; i < 2976; i++){
            String use = entries[i];
            String stageTry = use.substring(0, use.indexOf('_'));
            
            use = use.substring(use.indexOf('_')+1);
            String dayTry = use.substring(0, use.indexOf('_'));
            
            use = use.substring(use.indexOf('_')+1);
            
            String timeTry = use.substring(0, use.indexOf(' '));
            
            if (stage.equals(stageTry) && day.equals(dayTry) && sTime.equals(timeTry)){
                answer = use.substring(use.indexOf(' ')+1);
                opCount = opCount + 3;
            } 
        }
        if (answer == " "){
            answer = "Areas not found";
        }
        
        return answer;
    }
    
    public static void printAllAreas(){
        for (int i = 0; i < 2976; i++){
            String use = entries[i];
            String stageTry = use.substring(0, use.indexOf('_'));
            
            use = use.substring(use.indexOf('_')+1);
            String dayTry = use.substring(0, use.indexOf('_'));
            
            use = use.substring(use.indexOf('_')+1);
            String timeTry = use.substring(0, use.indexOf(' '));
            
            System.out.println("Stage: " + stageTry + " Day: " + dayTry + " Start Time: "+ timeTry + " Areas: " + use.substring(use.indexOf(' ')+1));
        }
    }
    
}