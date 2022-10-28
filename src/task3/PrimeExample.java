package task3;

public class PrimeExample {
        public static void main(String args[]){
            int i,m = 0,num = 0;
            int n = 1;//it is the number to be checked
            m=n/2;
            if(n==0||n==1){
                System.out.println(n +" is not prime number");
            }else{
                for(i = 2;i <= m;i++){
                    if(n%i==0){
                        System.out.println(n+" is not prime number");
                        num = 1;
                        break;
                    }
                }
                if(num == 0)  { System.out.println(n+" is prime number"); }
            }//end of else
        }
    }

