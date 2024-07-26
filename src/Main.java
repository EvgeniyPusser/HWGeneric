//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("45.078 + 8989 = " + Calculator.sum(45.078, 8989)+
                "\n7878 * 7.089 = " + Calculator.multiply(7878, 7.089) +
                "\n34.45 - 8979 = " + Calculator.subtract(34.45, 8979) +
                "\n67 / 897.987 = "+ Calculator.divide(67, 897.987));


        Integer[] intArray1 = {1, 2, 3};
        Integer[] intArray2 = {1, 2, 3};
        Integer[] intArray3 = {1, 2, 4};

        String[] strArray1 = {"apple", "banana", "cherry"};
        String[] strArray2 = {"apple", "banana", "cherry"};
        String[] strArray3 = {"apple", "banana", "date"};

        System.out.println(ArraysCompare.compareArrays(intArray1, intArray2)); // true
        System.out.println(ArraysCompare.compareArrays(intArray1, intArray3)); // false
        System.out.println(ArraysCompare.compareArrays(strArray1, strArray2)); // true
        System.out.println(ArraysCompare.compareArrays(strArray1, strArray3)); // false

        Pair<Integer,String> pair = new Pair<>(345, "So nice when twice");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair.toString());

    }
    }
