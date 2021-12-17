package pr3;

import java.util.Scanner;

public class Pr3 {

    public static void main(String[] args) {
        System.out.print("Введите количество компьютеров: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Computer obj[] = new Computer[n];
        for (int i=0; i<n; i++){
            System.out.print("Введите стоимость " + (i+1) + " компьютера: ");
            int c = in.nextInt();
            System.out.print("Введите тип " + (i+1) + " компьютера: ");
            String t = in.next(); 
            obj[i]= new Computer<Integer, String> (c, t); //заполнение массива
        }
        System.out.print("Введите тип компьютера, для поиска количества компьютеров заданного типа: "); //поиск количества компьютеров
        String k = in.next(); 
   
        NT1 ob1= new NT1 ("Один", n, obj);
        NT2 ob2= new NT2 ("Двa", n, obj, k);
        try {
            ob1.t.join();
            ob2.g.join();
        } 
        catch(InterruptedException е) 
        {
            System.out.println ("Глaвный поток прерван");
        }
    } 
}
