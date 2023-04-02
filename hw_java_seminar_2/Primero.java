// Здесь все работает из одного файла, даже без тдельных методов, потому что с методами какая-то путаница у меня (во втором задании видно будет)


import java.io.FileReader;
import java.io.IOException;

public class Primero {
    
    public static void main(String[] args) {
        // Primero primero = new Primero();
        // primero.ReadFile();

    // public void ReadFile(){

    try (FileReader reader = new FileReader("file.json")){
        int c;
        String str = "select * from students where ";
        
        StringBuilder strBuild = new StringBuilder(str);
        while((c=reader.read())!=-1){
            char symbol = (char)c;
            
            if (Character.isLetter(symbol) | Character.isDigit(symbol) | symbol == (char)':' | symbol == (char)' ' ) {
            strBuild.append(symbol);}
        
        } System.out.println(strBuild);

    }
    catch(IOException e){
        System.out.println(e.getMessage());


    }
    
}
    }


    /*Дана строка sql-запроса "select * from students where ".
Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.

Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 */