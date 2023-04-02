// Тут какая-то путаница с методами, я не понимаю, почему не работает

import java.util.Arrays;

import java.util.logging.*;
import java.io.IOException;

public class Segundo{
    /*
     */
    public static void main(String[] args)  {
// Я не знаю, как из строки сделать интеджер, а потом узнать его длину, чтобы как по строке по числу
// пробежать циклом for, и добавить каждую цифру числа в массив

        // Scanner scan = new Scanner(System.in);
        // System.out.println("Introduce numbers you want to sort:");
        // int n= scan.nextInt();
        // scan.close();
        int []array = new int [] {6,1,2,9,0,2};
        
        
   public sortArray(int[]array){
        int Num;
        boolean taskSolved = false;
        while(!taskSolved){
            taskSolved = true;

        for (int i = 0; i < array.length-1; i++) {
            if (array[i]>array[i+1]){
                taskSolved = false;
            Num =  array[i];
            array[i] = array[i+1];
            array[i+1] = Num;
            
            return LoggingLog();   
            }
        
        } }
        System.out.println(Arrays.toString(array));
    }
    sortArray(array);

        public static LoggingLog() {
        Logger logger = Logger.getLogger(Segundo.class.getName());
        // ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log.txt");

        logger.addHandler(fh);
        SimpleFormatter sFormat  = new SimpleFormatter();
        fh.setFormatter(sFormat);
        // XMLFormatter xml = new XMLFormatter();
        // fh.setFormatter(xml);
        return logger.info("The result of the iteration");

            }
        }
}

/*
Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
 */