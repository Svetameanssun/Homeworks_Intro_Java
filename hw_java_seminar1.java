// Урок 1. Знакомство с языком программирования Java
// 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n!
// (произведение чисел от 1 до n)



// import java.util.Scanner;
// public class hw_java_seminar1 {
//     public static void main(String[] args){
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("introduce n: ");
//         int n = iScanner.nextInt();
//         int sum = 0;
//         for (int i = 1; i < n+1; i++) {
//             sum = sum + i;
//         }
//         System.out.printf("%d",sum);
//         iScanner.close();
//     }
// }

// 2. Вывести все простые числа от 1 до 1000
// 
// public class hw_java_seminar1 {
//     public static void main(String[] args)  {
//         int k = 0;
//         for (int i = 2; i<1000; i++) {
//             for (int j = 2;  j<i; j++) {
//                 if (i%j == 0){
//                     k= k+1;  
//                 }
//             }
//             if (k == 0){
//                 System.out.println(i);
//             } else {
//                 k=0;
//             }
//            }
//         }
//     }

// P.S. Я понимаю, что наверняка можно решить через рекурсию, но с ситаксисом я пока что на 'ВЫ'


// 3. Реализовать простой калькулятор
// import java.util.Scanner;
// public class hw_java_seminar1 {
//     public static void main(String[] args){
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("Itroduce the 1st integer: ");
//         int n = iScanner.nextInt();

//         System.out.printf("Itroduce the operator: ");
//         char symbol = iScanner.next().charAt(0);
        
//         System.out.printf("Itroduce the 2nd integer: ");
//         int m = iScanner.nextInt();
//         double res = 0;
//         if (symbol=='+') res = n+m;
//         if (symbol=='-') res = n-m;
//         if (symbol=='*') res = n*m;
//         if (symbol=='/') res = (double)n/m;
//         if (symbol=='%') res = n%m;
//         System.out.println(res);
//         iScanner.close();

//         }
        
//     }

// P.S.Больше приняла во внимание слово "простой", а не "калькулятор"








