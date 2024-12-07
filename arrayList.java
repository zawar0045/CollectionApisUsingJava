/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author ABDUL MOIZ
 */
public class arrayList {
  
    public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList();
        
        // Insert
        list.add(1);
        list.add(2);
        list.add(3);

        // Update
        list.set(1, 10);

        // Delete
        list.remove(0);
          Iterator l= list.iterator();
          
       while(l.hasNext()){
          System.out.print(l.next()+"\n");
       }
    }
}


