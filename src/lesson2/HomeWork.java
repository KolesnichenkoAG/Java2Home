package lesson2;

public class HomeWork {
    public static final int REQUIRED_ARRAY_SIZE = 4;
    private static final String[][] strArray = new String[][]{
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"},
    };

    public static void main(String[] args) {
        try {
            int sum = sumArray(strArray);
            System.out.println(sum);
        } catch (MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        }
    }

    private static int sumArray (String[][] array) {
        checkArraySize(array);
        int sum = 0;
        for (int rowIndex = 0; rowIndex < array.length; rowIndex++) {
            String[] row = array[rowIndex];
            for (int colonIndex = 0; colonIndex < row.length; colonIndex++) {
                String valeu = row[colonIndex];
                try {
                    sum += Integer.parseInt(valeu);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(rowIndex, colonIndex);
                }
            }
        }
        return sum;
    }
    private static void checkArraySize(String[][] array) {
        if (array.length != REQUIRED_ARRAY_SIZE) {
            throw new MyArraySizeException();
        }
        for (String[] row : array) {
            if (row.length != REQUIRED_ARRAY_SIZE){
                throw new MyArraySizeException();
            }
        }
    }
}

