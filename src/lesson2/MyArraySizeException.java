package lesson2;


public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException() {
        super("Неверный размер массива, необходимо 4*4");
    }
}
