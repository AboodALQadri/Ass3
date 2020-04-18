/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass3;

import java.awt.Label;
import java.awt.TextField;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author mohammed
 */
public class Ass3Part1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
         
            Random num =new  Random();
        LinkedList<Integer> obj=new LinkedList<>();
        for(int i=1;i<=30;i++){
            int Rnum=0+(int)(Math.random()*100);
            obj.add(Rnum);
        }
        Collections.sort(obj,new Comparator<Integer>(){
            @Override
            public int compare(Integer t, Integer t1) {
                return t.compareTo(t1);
            } 
        });
        int  sum=0;
        System.out.println("Element in linked List :");
        for(int i=0 ;i<obj.size();i++){
            sum=sum+obj.get(i);
            System.out.println(obj.get(i));
        }
        
      double avg=sum/(obj.size());
      
    System.out.print("Sum Of Number "+sum);
    System.out.print("Avg Of Number "+avg);
    }}