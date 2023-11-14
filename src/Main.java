// Файл Main.java
public class Main {
    public static void main(String[] args) {
        // Використання фабричного методу для створення екземпляра MyClass
        MyClass<String> myClassString = MyClass.factoryMethod("Hello, World!");
        System.out.println("Дані з myClassString: " + myClassString.getData());

        MyClass<Integer> myClassInteger = MyClass.factoryMethod(42);
        System.out.println("Дані з myClassInteger: " + myClassInteger.getData());
    }
}
