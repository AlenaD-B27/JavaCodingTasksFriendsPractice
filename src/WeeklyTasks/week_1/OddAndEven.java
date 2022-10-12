package WeeklyTasks.week_1;

public class OddAndEven {

        public String OddOrEven( int num){
            if (num % 2 == 0) {
                return "Even";
            } else {
                return "Odd";
            }
        }

        public static void main(String[] args) {

        OddAndEven OddEven = new OddAndEven();
        System.out.println(OddEven.OddOrEven(55));

    }}
