/* Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое
значение. Метод ищет в массиве заданное значение и возвращает его индекс. При этом,
например:
1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в
качестве кода ошибки.
2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
3. если вместо массива пришел null, метод вернет -3
4. придумайте свои варианты исключительных ситуаций и верните соответствующие
коды ошибок.
Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот
метод запросит искомое число у пользователя, вызовет первый, обработает возвращенное
значение и покажет читаемый результат пользователю. Например, если вернулся -2,
пользователю выведется сообщение: “Искомый элемент не найден”. */


public class Task2 {
    public static void main(String [] args){
        Integer [] arr = {1,2,3,4};  // null
        int lengthValues = 3;
        int value = -3;
        
        System.out.println(decodeErrors(checkValue(arr, lengthValues, value)));
    }
    
    private static String decodeErrors(int errCode){
        if (errCode > 0){
            return "Результат поиска(индекс элемента) : " + Integer.toString(errCode);
        } else if (errCode == -2){
            return "Искомый элемент не найден";
        } else if (errCode == -1){
                return "Размер массива меньше границы";
        } else if (errCode == -3){
                return "We got a nullable array!";
        }
        return "Ошибка обработки ошибки";
    }

    private static int checkArray(Integer [] values,  int checkLength){
        if (values.length < checkLength){
            return -1;
        } else {
            return values.length;
        }
    }

    private static int checkValue(Integer [] values, int checkLength, int someValue){
        if (values == null){
            return -3;
        } else if (values.length < checkLength || values.length == 0){
            return -1;
        } else {
            for (int idx = 0; idx < values.length; idx++)
                if (values [idx] == someValue){
                    return idx;
                }
        }
        return -2;
    }
}


/* Иной вариант написания кода (дан преподавателем, как образец)
public class Seminar1_1{
    public static void main(String [] args){
        int [] arr = {1,2,3,4};
        int min_length = 8;
        int element = 2;
        int result = searchElement(arr, min_length, element);
        System.out.println(result);
        translateResult(result);
    }
    
    public static int searchElement(int [] arr, int min_length, int element){
        if (arr == null){
            return -3;
        } 
        if (arr.length < min_length){
            return -1;
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == element){
                return i;
            }
        }
        return -2;
    }

     public static void translateResult(int result){
        if (result == -1){
            System.out.println("длина массива меньше некоторого заданного минимума");
        } else if (result == -2){
            System.out.println("искомый элемент не найден");
        } else if (result == -3){
            System.out.println("вместо массива пришел " + null);
        }
        else{
            System.out.printf("... %d ", result);
        }
    }
}
*/