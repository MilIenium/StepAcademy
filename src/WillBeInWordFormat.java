/*
Курс: Введение в язык программирования Java
Тема: «Переменные, типы данных, операторы». Часть 1

*******************************************************
*******************************************************

Извините, для человека, который хоть немного знает java
отправлять код в вордовском формате - издевательство.
Тем  более на java курсах...
Я подумывал о том, чтобы весь код написать в одну строку
чтобы вы скопировали и вставили в иде, и ставили автоотсупы
но я подумал, что это уже слишком.

Извините если что за высказанное мнение.

*******************************************************
*******************************************************

*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WillBeInWordFormat {
    public static void main(String[] args) throws IOException {
        System.out.println("Fall seven times\n" +
                "and\n" +
                "stand up eight.\n");

        System.out.println("\"Your time is limited,\n" +
                " so don’t waste it\n" +
                " living someone else’s life\"\n" +
                " Steve Jobs.");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int firstNum = Integer.parseInt(reader.readLine());
        int secondNum = Integer.parseInt(reader.readLine());

        int sum = firstNum + secondNum;
        int diff = firstNum - secondNum;
        int multiple = firstNum * secondNum;
        float divide = firstNum / secondNum;

        System.out.println("The sum of two numbers is: " + sum + "\n"+
                "The difference between two numbers is: " + diff + "\n"+
                "The product of two numbers is: " + multiple + "\n"+
                "The division of two numbers is: " + divide);


        float percent =  ((float) firstNum  / 100) * secondNum;
        System.out.println(secondNum + " percent of the value " + firstNum + " is: " +  percent);

        int square = firstNum * firstNum;
        System.out.println("The area of the square is: " + square);

    }
}