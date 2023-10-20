/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package group;

import java.util.List;

/**
 *
 * @author jimok
 */
public class Group {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a class named "Group" to store group name and members
    }
    private String name;
    private List members;
    
    // set constructor to initialize group name and members

    public Group(String name, List memebers) {
        this.name = name;
        this.members = memebers;
    }
    
    // Getter method for group name and group members

    public String getName() {
        return name;
    }

    public List getMemebers() {
        return members;
    }
    
    // Setter method for group name and group members

    public void setName(String name) {
        this.name = name;
    }

    public void setMemebers(List memebers) {
        this.members = memebers;
    }
    
    // Method to add members to the group
    public void printGroup() {
        System.out.println("Group Name:" + name);
        System.out.println("Group Members: ");
        for (Sring member : members) {
            System.out.println(member);   
        }
        
        System.out.println();
    }
}
