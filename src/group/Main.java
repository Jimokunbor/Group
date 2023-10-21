/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jimok
 */
public class Main {
    // Main method
    public static void main(String[]args) throws FileNotFoundException {
    
    // Create a list to store all the person's information
List personList = new ArrayList<>();

   // Read the text file and load all the data onto memory
   
    try {
File file = new File ("dummy_data.txt"); // Create a file object
Scanner scanner = new Scanner (file); // Create a scanner object to read the file

   // Loop through each line in the file
   while (scanner.hasNextLine()) {
   String line = scanner.nextLine(); // Read the line
   String[] data = line.split(","); // Split line by comma
   
   // Create a person object with the data from the line
   Person person = new Person(Integer.parseInt(data[0]), data[1], data[2], data[3]);
   
   // Add the person object to the personList
   personList.add(person);
   }
   scanner.close(); // Close the scanner
    } catch (FileNotFoundException e) {
        System.out.println("File not found!");  // Print error message if file is not found
    }
    
    // Ctreate a map to store group name and their members
    Map> groupMap = new HashMap<>();
    
    // Create a list to store all the group names
    List groupNames = ArrayList<>();
    
    // Loop through each group name in the enum
    for (GroupNames groupNAme : GroupNames.values()) {
        groupNames.add(groupNames.toString());  // Add the group name to the groupNames list
    }
    // Shuffle the personList to randomize the order
    Collections.shuffle(personList);
    
    // Loop through each person in the personList
    for (Object person : personList) {
       
        // Check if the groupMap already contains 20 groups
        if (groupMap.size() == 20){
            break; // If yes, break out of the loop
            
        }
        // Generate a random number between 0 and 19
        Random random new Random();
        int index = random.nextInt(20);
        
        // Check if the groupNames list is empty
        if (groupNames.isEmpty()) {
            break;
        }
        
        // Get the group names at the generated index
        Object groupName = groupNames.get(index);
        
        // Check if the groupMap already contains the group name
        if (groupMap.containKey(groupName)) {
            continue;  // Yes, contineu to the next iteration
        }
        // Create a list to store the group members
        List groupMembers = new ArrayList<>();
        
        // Add the person's first name and last name to the groupMember list
        groupMembers.add(person.getFirstNames() + "" + person.getLastName());
        
        // Add the group name and group members to the map
        groupMap.put(groupMembers);
        
        // Remove the group name from the groupName list
        groupNames.remove(person);
    }
    
    // Create a list to store all the groups
    List groupList = new ArrayList<>();
    
    // Loop through each group name and members in the groupMap
    for (Map.Entry> entry : groupMap.entrySet()) {
        
   // Create a group object with the group name and members
    Group group = new Group(entry.getKey(), entry.getValue());
    
    // Add the group object to the groupList
    groupList.add(group);
    
    }
    // Print each group (name and members) to the console
    for (Object group : groupList) {
        System.out.println("Group");
    }
  }
}
