package cn.com.game.fun;

public class Game1 {

    /**
     * Loop the Numbers and print the results
     * @param numbers
     */
    public void game(int numbers){
        Pupil pupil = new Pupil();
        for (int i = 1; i <= numbers ;i++) {
            pupil.say(i);
        }
    }


    /**
     * declare inner class Pupil
     */
    class Pupil{
        private final static String FIZZ ="Fizz";
        private final static String BUZZ ="Buzz";
        private final static String FIZZ_AND_BUZZ ="FizzBuzz";

        /**
         * default constructor
         */
        public Pupil(){}

        /**
         * print the result
         * @param num
         */
        public void say(int num){
            //both three and five
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println(FIZZ_AND_BUZZ);

            //divisible by 3
            } else if (num % 3 == 0) {
                System.out.println(FIZZ);

            //divisible by 5
            } else if (num % 5 == 0) {
                System.out.println(BUZZ);

            //others
            }else{
                System.out.println(num);
            }

        }
    }

}
