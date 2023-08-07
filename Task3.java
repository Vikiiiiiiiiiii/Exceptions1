/* Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: метод может работать только с
квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать
только значение 0 или 1.
Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об
ошибке. */


public class Task3 {
    static int rows = 4;
    static int cols = 4;
    public static void main(String[] args) {
        int[][] arr = fillArray(rows, cols);
        prinf2D(arr);
        System.out.println("Сумма массива : " + sumOfArray(arr));
    }

    private static int [] [] fillArray(int rows, int cols) {
        int [] [] array = new int [rows] [cols];
        for (int idx = 0; idx < rows; idx ++){
            for (int ydx = 0; ydx < cols; ydx ++) {
                array [idx] [ydx] = (idx %2 == 0) ? 1:0; // array [idx] [ydx] = 5; 
            }
        }
        return array;
    }

    private static void prinf2D(int [] [] array){
        System.out.println("The 2D array is: ");
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int sumOfArray(int [][] array){
        int arraySum = 0;
        for (int[] bracket : array) {
            if (array.length != bracket.length){
                throw new RuntimeException("This array is not square");
            }
        }
        for (int idx = 0; idx < array.length; idx++){
            for (int y = 0; y < array[0].length; y++){
                if (array [idx] [y] != 1 && array [idx] [y] != 0){
                    throw new RuntimeException("Это не двоичный массив");
                }
                arraySum += array [idx] [y];
            }
        }
        return arraySum;
    }
}

/* Иной вариант написания кода
public class Seminar1_2 {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,1},{0,0,0},{0,0,0}};
        int result = sumElements(matrix);
        System.out.println(result);
    }

    public static int sumElements(int[][] matrix) {
        for (int[] row: matrix){
            if (matrix.length != row.length) {
                throw new RuntimeException("РњР°СЃСЃРёРІ РЅРµ РєРІР°РґСЂР°С‚РЅС‹Р№");
            }
        }
        
        for (int[] row: matrix) {
            for (int element : row) {
                if (element != 0 && element != 1) {
                    throw new RuntimeException("РњРѕРіСѓС‚ Р±С‹С‚СЊ С‚РѕР»СЊРєРѕ Р·РЅР°С‡РµРЅРёРµ 0 РёР»Рё 1");
                }
            }
        }

        int sum = 0;
        for (int[] row: matrix) {
            for (int element : row) {
                sum += element;
            }
        }

    return sum;
    }
} */