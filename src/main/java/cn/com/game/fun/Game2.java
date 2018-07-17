package cn.com.game.fun;

public class Game2 {

    /**
     * Loop the Numbers and print the results
     * @param numbers
     */
    public void game(int numbers){
        Pupil pupil = new Pupil(true,true);
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

        private boolean is3In  = false;

        private boolean is5In = false;

        /**
         * default constructor
         */
        public Pupil(){}

        /**
         * constructors
         * @param is3In  does it need to print has a 3 in it
         * @param is5In  does it need to print has a 5 in it
         */
        public Pupil(boolean is3In,boolean is5In){
            this.is3In = is3In;
            this.is5In = is5In;
        }

        /**
         * print the result
         * @param num
         */
        public void say(int num){

            //both three and five
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println(FIZZ_AND_BUZZ);

            //divisible by 3 or if it has a 3 in it
            } else if (num % 3 == 0 || is3InIt(num)) {
                System.out.println(FIZZ);

            //divisible by 5 or if it has a 5 in it
            } else if (num % 5 == 0 || is5InIt(num)) {
                System.out.println(BUZZ);

            //others
            }else{
                System.out.println(num);
            }

        }

        private boolean is3InIt(int num){
            return is3In && String.valueOf(num).indexOf("3") > -1;
        }

        private boolean is5InIt(int num){
            return is5In && String.valueOf(num).indexOf("5") > -1;
        }

    }

}
