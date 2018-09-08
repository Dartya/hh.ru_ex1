import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        //класс сканнер
        System.out.println("Введите строку:\n");    //сообщение
        String inputstring = sc.nextLine();         //строка с входными данными
        StringTokenizer st = new StringTokenizer(inputstring, " "); //класс, читающий данные через разделитель
        ArrayList<Integer>list = new ArrayList<>();

        int currentval;     //текущая лексема в строке
        int minval = 0;     //минимальный элемент натурального ряда в введенной строке. изначально инициализирован как 0, поэтому при первом проходе первая же лексема будет записана, как минимальная

        while(st.hasMoreTokens()) {     //пока в введенной строке еще есть лексема
            currentval = Integer.parseInt(st.nextToken());
            if (currentval > 0)
                    list.add(currentval);
            else continue;
            if (currentval > minval)
                    minval = currentval;

        }
    }
}
