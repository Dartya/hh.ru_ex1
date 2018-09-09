import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        //класс сканнер
        System.out.println("Введите строку:\n");    //сообщение
        String inputstring = sc.nextLine();         //строка с входными данными
        StringTokenizer st = new StringTokenizer(inputstring, " "); //класс, читающий данные через разделитель

        int currentval; //текущая лексема в строке
        boolean[] boolArr = new boolean[1000000000];

        while(st.hasMoreTokens()) {     //пока в введенной строке еще есть лексема
            currentval = Integer.parseInt(st.nextToken());
            if (currentval > 0)
                    boolArr[currentval-1] = true;
        }

        for (int i = 0; i < boolArr.length; i++){
            if (boolArr[i] == false) {
                System.out.println((i+1));
                break;
            }
        }
    }
}

//строка для теста:
//7 8 9 4 3 15 23 1 2
//должно выйти 5 - верно

//строка для теста:
//-9 -8 -7 7 8 -10 -7 9 4 3 -500 6 7 8 15 5 23 1 2
//должно выйти 6 - верно

//строка для теста:
//-9 -8 -7 7 8 -10 -7 9 4 3 -500 6 7 8 15 5 23 1 2
//должно выйти 10