/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.pkg2;

/**
 *
 * @author Student
 */
public class Activity2 {

    //Allani, Jimboy Ralph
    public static void main(String[] args) {
         int [] numbers = {10, 5, 7, 3, 12};
       
       System.out.println("Elements of the Array: ");
       for (int number : numbers) {
           System.out.println(number);
       }
       
    int sum = numbers[0] + numbers [1]+ numbers [2] + numbers [3] 
            + numbers [4];
        System.out.println("Sum of all Arrays: " + sum );
        
        int max = Math.max(numbers [0], Math.max(numbers[1], Math.max(numbers[2], Math.max(numbers[3],(numbers[4])))));
        System.out.println("Maximum Value: " + max);
    }
    
       }
    
