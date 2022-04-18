package lesson2;

public class MyArrayDataException extends RuntimeException{
    public MyArrayDataException(int row, int colon) {
        super(String.format("невозможно получить число из элеметна по адресу array [%d][%d]", row, colon));
    }
}
