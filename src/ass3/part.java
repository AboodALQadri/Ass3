package ass3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class part {
    
    public static void main(String[] args) throws FileNotFoundException {
        
    File text = new File("E:\\mohammed");
        Scanner scnr = new Scanner(text);
        Map<String,Integer> frequansy=new HashMap<>();
        Map<Character,Integer> frequansy1=new HashMap<>();
        char[] letter={};
         System.out.println();
         
        while(scnr.hasNextLine()){
            String line = scnr.nextLine();
            if(!line.trim().equals("")){
              String[]word=line.split(" ");
              
              for(String words : word){
                  if(word==null||line.trim().equals(""))
                      continue;
                  String proc=words.toLowerCase();
                      letter=proc.toCharArray();
                  if(frequansy.containsKey(proc)){
                      frequansy.put(proc, frequansy.get(proc)+1);
                  }else{
                      frequansy.put(proc, 1);
                  }
                 for(char c: letter){
            if(frequansy1.containsKey(c)){
                      frequansy1.put(c, frequansy1.get(c)+1);
                  }else{
                      frequansy1.put(c, 1);
                  } 
        }
              }
            }
            System.out.println( line);
        } 
        
        System.out.println();
        System.out.println(frequansy);
        System.out.println(frequansy1);
        
      
        
    }
    
}

 
