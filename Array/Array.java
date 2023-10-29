import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        Object[] kumpulanData = { 1, 2, 4, 10, 20, "Rizwan", "Iko", "Ikok" };

        ArrayList<String> textArray = new ArrayList<>();
        ArrayList<Integer> numberArray = new ArrayList<>();

        for (Object element : kumpulanData) {
            if (element instanceof String) {
                textArray.add((String) element);
            } else if (element instanceof Integer) {
                numberArray.add((Integer) element);
            }
        }

        // Menampilkan Array Text
        System.out.print("Array Text adalah: ");
        for (String text : textArray) {
            System.out.print(text + " ");
        }
        System.out.println();

        // Menampilkan Array Number
        System.out.print("Array Number adalah: ");
        for (Integer number : numberArray) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
