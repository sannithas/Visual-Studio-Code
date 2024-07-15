public class MyClass {
    public static void greet() {
        System.out.println("Hello, world!");
    }

    public void displayMessage(String message) {
        System.out.println("My name is " + message);
    }

    public static void main(String[] args) {
        MyClass.greet();

        MyClass myObject = new MyClass();
        
        myObject.displayMessage("Sannitha");
    }
}