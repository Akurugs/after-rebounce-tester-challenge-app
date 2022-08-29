public class Tester {
    //declaring an int type method to return the multiplication table of any given number:
    //question a.
    static int multiplicationTable(int n){
        int val = 0;
        for (int i = 1; i <= 12; i++){ //considering all the values within =[1, 12]
            val = n * i; //and successively multiplying each of the considered values above by the give number:
            System.out.printf("%d * %d = %d \n", n, i, val); //string formatter to print the results in a tabular form.
        }
        return val;
    }
    // declaring an int return type method to return the factorial of a number:
   //question b.
    static int factorial(int fact){
        if (fact >= 1){         //conditioning to check the size of fact:
            System.out.println(fact);
            return fact * factorial(fact - 1);
        }return 1;
    }
}
