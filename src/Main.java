//-Define a testing class with a main() method where you: -Define an array of strings called carBrands that is populated with 5 famous car brand names
//        Print in console the number of items of the carBrands array
//        Print in console the 3rd item of carBrands array -Declare an empty array of integers called primeNumbers with a predefined size of 6 items
//        Insert one by one the values of the first 6 prime numbers, populating primeNumbers array -Print in console all the content of the already populated primeNumbers array

public class Main {
    public static void main(String[] args) {
        String[] carBrands = {"Fiat", "Volkswagen", "BMW", "Volvo", "Ford"};

        System.out.println("The length of carBrands is " + carBrands.length);
        System.out.println("The third brand inside carBrands is " + carBrands[2]);

        int[] primeNumbers = new int[6]; //Empty array of integers called primeNumbers with a predefined size of 6 items
        primeNumbers[0] = 2;
        primeNumbers[1] = 3;
        primeNumbers[2] = 5;
        primeNumbers[3] = 7;
        primeNumbers[4] = 11;
        primeNumbers[5] = 13;

        for(int primeNumber : primeNumbers) {
            System.out.println(primeNumber);
        }

    }
}