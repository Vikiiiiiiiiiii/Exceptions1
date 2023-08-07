/* Дан класс
https://github.com/sabinaIsm/test/blob/d2ebf811b85139783b1a0dcbe3714dbb28deee82/Ra
ndomExceptionsClass.java

Запустите код, с помощью анализа стектрейса найдите и по возможности исправьте
ошибки, добейтесь корректного выполнения программы.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class RandomExceptionsClass {
    public static void main(String[] args) throws IOException {
        callMethod6("");
        LinkedList<String> stringArraysList = new LinkedList<> (callMethod1());
        int a=10, b=0;
        callMethod6("");
        int div = callMethod2(a, b);
        System.out.println(div);
        callMethod6("");
        callMethod3(stringArraysList, 5);
    }

    private static void callMethod6(String s) {
        System.out.println("Hello World, it's me!");
    }

    private static LinkedList callMethod3(LinkedList<String> stringArrayList, int idx){
        if (idx == 0) return stringArrayList; // выход из рекурсии
        callMethod6("");
        callMethod3(stringArrayList, --idx);
        return stringArrayList;
    }

    private static Collection<String> callMethod1() throws IOException {
        callMethod2(100000000, 10-10);
        return new LinkedList<>();
    }

    public static int callMethod2(int a, int b) throws IOException {
        callMethod6("");
        try{ // поломка на отсутствии файла
            FileInputStream fis = new FileInputStream("1.txt");
            fis.read();

            if(fis.available() > 0) throw new RuntimeException();
        } catch ( FileNotFoundException e){
            System.out.println("Не найден файл ...");
        }

        int num = callMethod4("1240");  // вместо цифры 0 стояла буква О
        int result = 0;
        try{
            result = a/b;
        } catch (ArithmeticException e){
            System.out.println("Делить на ноль нельзя. Возвращаем 0!");
        }
        return result;
    }

    private static int callMethod4(String s) {
        callMethod5(s);
        return Integer.parseInt(s);
    }

    private static void callMethod5(String s) {
        callMethod6("");
        String[] strings = new String[5];
        for (int i = 1; i < strings.length; i++){   // границы массива 
            strings[i] = s;
        }
    }
}