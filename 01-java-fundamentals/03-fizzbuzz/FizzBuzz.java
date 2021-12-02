class FizzBuzz {
    public String fizzBuzz(int number){
        String answer = "";
        
        if (number%3 == 0 & number%5 ==0) {
            answer = String.format("%d, FizzBuzz", number);
            
        }else if (number%3 ==0) {
            answer = String.format("%d, Fizz", number);

        }else if (number%5 ==0){
            answer = String.format("%d, Buzz", number);
        } else{
            answer = String.format("%d", number);
        }
        return answer;
    }
}