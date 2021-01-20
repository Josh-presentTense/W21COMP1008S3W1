public class WarmUpExercise {
    public static void main(String[] args) {
        //loop that counts down by intervals of 5 from 100
        for(int i = 100; i >= 0; i -= 5){
            System.out.println(i);
        }

        //Loop
        for(int i = 0; i <= 100; i+=10){
            System.out.print(i%20==0?i + " Java":i);
        }
    }
}
