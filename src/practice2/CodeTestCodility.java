package practice2;

public class CodeTestCodility {
    public static void main(String[] args) {
        consecutiveNumber(12);
        consecutiveNumber(25);
    }

/*
5. Numbers -- print consecutive numbers
Write a function:
that, given a positive integer N, prints the consecutive numbers from 1 to N,
each on a separate line. However, any number divisible by 2, 3 or 5 should
be replaced by the word Codility, Test or Coders respectively. If a number
is divisible by more than one of the numbers: 2,3 or 5, it should be replaced
by a concatenation of the respective words Codility, Test and Coders in this
given order. For example, numbers divisible by both 2 and 3 should be
replacée by CodilityTest and numbers divisible by all three numbers: 2,3
and 5, should be replaced by CodilityTestCoders.

For example, here is the output for N = 24:
1
Codility
Test
Codility
Coders
CodilityTest
7
Codility
Test
Codi1ityCoders
11
CodilityTest
13
Codility
TestCoders
Codility
17
         */


    public static void consecutiveNumber(int result) {
        String words = "";
        for (int i = 1; i <= result; i++) {
            if ((i % 2 == 0) && (i % 3 == 0) && (i % 5 == 0)) {
                words += "CodilityTestCoders\n";
            } else if (i % 2 == 0 && i % 3 == 0) {
                words += "CodilityTest\n";
            } else if (i % 2 == 0 && i % 5 == 0) {
                words += "CodilityCoders\n";
            } else if (i % 3 == 0 && i % 5 == 0) {
                words += "TestCoders\n";
            } else if (i % 5 == 0) {
                words += "Coders\n";
            } else if (i % 3 == 0) {
                words += "Test\n";
            } else if (i % 2 == 0) {
                words += "Codility\n";
            } else {
                words += i +"\n";
            }
        }
        System.out.println(words);

    }
}
