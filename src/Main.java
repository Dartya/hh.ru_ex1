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

        int currentval;         //текущая лексема в строке
        //int minval = 0;       //минимальный элемент натурального ряда в введенной строке. изначально инициализирован как 0, поэтому при первом проходе первая же лексема будет записана, как минимальна
        boolean[] boolArr = new boolean[1000000000];

        while(st.hasMoreTokens()) {     //пока в введенной строке еще есть лексема
            currentval = Integer.parseInt(st.nextToken());
            if (currentval > 0)
                    //list.add(currentval);
                    boolArr[currentval-1] = true;
            else continue;
            /*if (currentval > minval)
                    minval = currentval;*/
            //boolArr[currentval-1] = true;
        }

        for (int i = 0; i < boolArr.length; i++){
            if (boolArr[i] == false) {
                System.out.println("Минимальный отсутствующий элемент = "+(i+1));
                break;
            }
            else continue;
        }

    }
}

//строка для теста:
//7 8 9 4 3 15 23 1 2
//должэно выйти 5 - верно

//строка для теста:
//7 8 -10 -7 9 4 3 -500 15 5 23 1 2
//должэно выйти 6 - верно