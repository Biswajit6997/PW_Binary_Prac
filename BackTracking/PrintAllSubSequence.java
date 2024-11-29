/*
 Print all the subsequence from an array

 i/p: [1,2]
 o/p: [2],[1],[1, 2]

 i/p:[1,2,3]
 o/p:[3],[2],[2, 3],[1],[1, 3],[1, 2],[1, 2, 3]

*/


import java.util.*;

public class PrintAllSubSequence {


    static void PrintSS(int arr[],int index,ArrayList<Integer>tempArr){

        // Base Case:
        if(index==arr.length){
         // Print all the subsequence ==but do not print the empty entries
            if(tempArr.size()>0){
                System.out.println(tempArr);
            }
            return;
        }
        // Recursive calls:

        // include
        PrintSS(arr, index+1, tempArr);
        //Add the value in tempArr
        tempArr.add(arr[index]);

        // Case 2:Not include case:
        PrintSS(arr, index+1, tempArr);
        // Remove the last one
        tempArr.remove(tempArr.size()-1);
    }


    public static void main(String[] args) {
    
        int arr1[]={1,2};
        System.out.println("For the array - "+Arrays.toString(arr1));
        PrintSS(arr1, 0, new ArrayList<>());
        System.out.println();
    
        int arr2[]={1,2,3};
        System.out.println("For the array - "+Arrays.toString(arr2));
        PrintSS(arr2, 0, new ArrayList<>());

        
    }
}