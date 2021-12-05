import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;



class PuzzleJava {
    Random randMachine = new Random();
    
    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i=1; i<11; i++){
            //int randomNum = rand.nextInt((max - min) + 1) + min;
            int randomNum = randMachine.nextInt((20))+1;
            myArray.add(randomNum);
        }
        return myArray;
    }

    public char getRandomLetter (){
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        // char[] alphabet = new char[26]; // new array    
        // for(char ch = 'a'; ch <= 'z'; ++ch)// fills alphabet array with the alphabet
        // {
        //     alphabet[ch-'a']=ch;
        // } 
        int randomIndex = randMachine.nextInt(26);
        return alphabet[randomIndex];
    }

    public String generatePassword(){
        String password = "";
        for(int i=1; i<9; i++){
            char letter =getRandomLetter();
            password = password +letter;
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int length){
        ArrayList<String> myArray = new ArrayList<String>();
        for (int i=0; i<length; i++){
            String password = generatePassword();
            myArray.add(password);
        }
        return myArray;
    }
}