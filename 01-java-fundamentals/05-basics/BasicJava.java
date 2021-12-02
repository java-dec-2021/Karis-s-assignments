import java.util.ArrayList;
import java.util.Arrays;

class BasicJava {
    public void printNums() {
        for (int i=1; i<256; i++){
            System.out.println(i);
        }
    }
    public int printSum() {
        int sum =0;
        for (int i=1; i<256; i++){
            sum = sum +i;
        }
        return sum;
    }
    public void printArray(){
        int[] myArray = {1,3,5,7,9,13};
        for (int i =0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        } 
        System.out.println(Arrays.toString(myArray)); //another way to print array
    }
    public void maxValue(int[] array){
        int max = array[0];
        for (int i =0; i<array.length; i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println("max is " + max);
    }
    public ArrayList oddArray(){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i=1; i<256; i+=2){
            myArray.add(i);
        }
        return myArray;

    }
    public void getAvg(int[] array){
        int average = 0;
        int sum =0;
        for (int i =0; i < array.length; i++){
            sum = sum + array[i];
        } 
    }
}