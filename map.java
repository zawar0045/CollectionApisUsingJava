/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;
import java.util.TreeMap;
/**
 *
 * @author ABDUL MOIZ
 */
public class map {
    


    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        
        // Insert
        treeMap.put(1, "A");
        treeMap.put(2, "B");
        treeMap.put(3, "C");

        // Update
        treeMap.put(2, "Z");

        // Delete
        treeMap.remove(1);

        // Traverse using for-each loop
        for (Integer key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }

        // Traverse using forEach method
        treeMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }
}

    

