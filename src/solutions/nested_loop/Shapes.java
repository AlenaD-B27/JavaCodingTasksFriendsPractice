package solutions.nested_loop;

public class Shapes {
    public static void main(String[] args) {

        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 9; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------");

        for(int i = 8; i >= 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
