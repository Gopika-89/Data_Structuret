import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};

        int[] newArray = new int[myArray.length + 1]; // 
        System.arraycopy(myArray, 0, newArray, 0, myArray.length); 
        newArray[newArray.length - 1] = 6; 
        
        int[] finalArray = new int[newArray.length + 1];
        System.arraycopy(newArray, 0, finalArray, 1, newArray.length);
        finalArray[0] = 0;

        System.out.println("The final array is: " + Arrays.toString(finalArray));   
        }
}