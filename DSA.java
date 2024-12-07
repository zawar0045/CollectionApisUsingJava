/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

import java.util.HashMap;

public class DSA {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        
        // Insert
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        // Update
        map.put(2, "Z");

        // Delete
        map.remove(1);

        // Traverse
        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}

