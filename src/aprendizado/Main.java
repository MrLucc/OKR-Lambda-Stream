package aprendizado;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker");





       var numemero = numbers.stream().map(x -> x*x*x).filter(x -> x%2 ==0).reduce(Integer::sum);
       print(numemero.get());
    }




    private static int addList(List<Integer> numbers){
        return numbers.stream().reduce(0, Integer::sum);
                //reduce(0, (x,y) -> x+y);
                //reduce(0, aprendizado.Main::sum);
    }


    private static int sum(int a, int b){
        return a+b;
    }

    private static boolean isEven(int number){
        return number%2==0;
    }

    private static void print(Object numbers){
        System.out.println(numbers);
    }

    private static void printOnlyNumberEven(List<Integer> numbers){
        numbers.stream().filter(Main::isEven).forEach(Main::print);
    }

    private static void printOlnyNumbersEvenUseLambda(List<Integer> numbers){
        numbers.stream().filter(n -> n%2==0).forEach(Main::print);
    }

    private static void printSquareNumbersEvenUseLambda(List<Integer> numbers){
        numbers.stream().filter(n -> n%2==0).map(n -> n*n).forEach(Main::print);
    }

    private static void printNumbers(List<Integer> numbers){
        //forEach -> sendo um for tradicional
        numbers.stream().forEach(Main::print);
    }

    private static void printOnlyOddNumbers(List<Integer> numbers){
        numbers.stream().filter(n -> n %2 != 0).map(n -> n * n * n).forEach(Main::print);
    }

    private static void printCourses(List<String> courses){
        courses.stream().map(course -> course + " " + course.length()).
               forEach(System.out::println);
    }


    private static int printSquare(List<Integer> numbers){
       return  numbers.stream().map(x -> x*x).reduce(0, Integer::sum);
    }




}