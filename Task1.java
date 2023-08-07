/* Реализуйте метод, принимающий в качестве аргумента
целочисленный массив.
Если длина массива меньше некоторого заданного минимума,
метод возвращает -1, в качестве кода ошибки, иначе - длину
массива.*/

public class Task1{
    public static void main(String [] args){
        Integer [] arr = {1,2,3,4};
        int lengthValue = 2; // 12 (выдаст код ошибки -1)
        System.out.println("Result of check: " + checkArray (arr, lengthValue));
    }

    private static int checkArray(Integer [] values, int checkLength){
        if (values.length < checkLength){
            return -1;
        } else {
            return values.length;
        }
    }
}
/* Второй вариант написания кода
public class Seminar1_0 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int min_length = 5;
        int result = checkArrayLength(arr, min_length);
        System.out.println(result);

    }
    public static int checkArrayLength(int[] arr, int min_length) {
        if (arr.length < min_length) {
            return -1;
        } else {
            return arr.length;
        }
    }
}*/