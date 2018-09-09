import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputstring = null;
        String curval;
        try {
            inputstring = br.readLine();
            if (inputstring == null)
                System.out.println("");
        } catch (IOException e) {
            e.printStackTrace();
        }
        StringTokenizer st = new StringTokenizer(inputstring, " "); //объект класса, читающего данные через разделитель
        ArrayList<Integer> list = new ArrayList<>();
        int first_elem, second_elem, currentval, iterator = 0;

        while(st.hasMoreTokens()) {
            curval = st.nextToken();
            if (!curval.matches("\\d+")){
                continue;}
                else{
                currentval = Integer.parseInt(curval);
                if ((currentval > 0) && (currentval <= 1000000000 )){
                    list.add(currentval);
                    iterator++;
                    if (iterator == 1000000) break;
                }
                else continue;
            }
        }
        if (list.size() > 0) {
            Collections.sort(list);

            if (list.get(0) > 1)
                System.out.println("1");
            else {
                for (int i = 0; i < list.size(); i++) {   //поиск минимального отсутствующего элемента введенной строки
                    first_elem = list.get(i);
                    if (i + 1 < list.size())
                        second_elem = list.get(i + 1);
                    else {
                        System.out.println("");
                        break;
                    }

                    if ((second_elem - first_elem) > 1) {
                        System.out.println("" + (first_elem + 1));
                        break;
                    }
                }
            }
        }
        else {
            System.out.println("");
        }
    }
}

//строка для теста:
//7 8 9 4 3 15 23 1 2
//должно выйти 5 - верно

//строка для теста:
//-9 -8 -7 7 8 -10 -7 9 4 3 -500 7 8 15 5 23 1 2
//должно выйти 6 - верно

//строка для теста:
//-9 -8 -7 7 8 -10 -7 9 4 3 -500 6 7 8 15 5 23 1 2
//должно выйти 10 - верно

//строка для теста:
//-9 -8 -7 7 8 -10 -7 9 4 3 -500 6 7 8 15 5 23 2
//должно выйти 1 - верно

//-9 -8 -7 7 8 -10 -7 9 4 3 -500 6 7 8 15 5 23 2 1000000000
//должно выйти 1 - верно

// 1 2 d 3 8f 6 6 4 fg 7
//должно выйти 5 - верно

//blabla
//