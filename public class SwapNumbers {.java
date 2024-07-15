public class SwapNumbers {
    public void swap(int num1, int num2) {
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }

    public static void main(String[] args) {
        SwapNumbers swapNumbers = new SwapNumbers();

        int number1 = 10;
        int number2 = 20;
  
        swapNumbers.swap(number1, number2);
    }
}