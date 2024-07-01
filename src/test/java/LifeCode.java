import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LifeCode {

    public static void main(String[] args) {


            Integer[] income={4,7,9,25,6,8,9,7,4,7};
        System.out.println(Arrays.toString(deleteDub(income)));
            //findTwoMax(income);

        //System.out.println(isStrPallindrom("А роза упала на лапу Азору"));
        System.out.println(reverseStr3("Azure is the best company in th world"));
//        String str ="Azure is the best company in th world";
//        String[] strArr=str.split(" ");
//        String newStr="";
//        for (String word:strArr){
//            newStr=newStr+revertStr(word)+" ";
//
//        }
//        System.out.println(newStr);





    }

    //Подсчет повторяющихся символов строке
    static  Map<String,Integer> countRepeatedChars(String inputStr){
        Map<String,Integer> resultMap = new HashMap();
        Pattern.compile("")
                .splitAsStream(inputStr)
                .forEach(s->resultMap.put(s,resultMap.getOrDefault(s,0)+1));

        return resultMap;
    }

    //Отсиртировать список int отфильтровать и удалить дубликаты

    static List<Integer> performList(List<Integer> incomeArray){
       return incomeArray.stream().distinct().sorted().filter(e->e>3).collect(Collectors.toList());

    }

    //Переворот строки

    static String revertStr(String incomeStr){
        StringBuilder outcomeStr= new StringBuilder();
        for (String str:incomeStr.split("")) {
            outcomeStr.insert(0, str);
        }
        return outcomeStr.toString();

    }

    static String revertStr1(String incomeStr){
        StringBuilder outcomeStr= new StringBuilder();

        Arrays.stream(incomeStr.split("")).forEach(s->outcomeStr.insert(0,s));
        return outcomeStr.toString();

    }

    static String reverseStr2(String incomeStr){
        String newStr="";
        String[] arrStr = incomeStr.split("");
        for (String str:arrStr) {
            newStr=str+newStr;
        }
     return newStr;
    }
    static String reverseStr3(String incomeStr){
         return new StringBuilder(incomeStr).reverse().toString();
    }

    static void fizzBuzz(){
        IntStream.range(1,100).forEach(e->System.out.println(e%3==0?e%5==0?"FizzBuzz":"Fizz":e%5==0?"Buzz":e));

    }

    //пример кода, который сортирует список строк с использованием коллекции

    static void sortList(List<String> incomeList){
        Collections.sort(incomeList);
        System.out.println(incomeList);

    }
    //Напишите функцию, которая переворачивает число (порядок цифр в нем изменяет на противоположный, инвертирует).

    static Long revertNum(Long incomeInt){

        StringBuilder builder = new StringBuilder();
        Arrays.stream(String.valueOf(incomeInt).split("")).forEach(s->builder.insert(0,s));
        return Long.valueOf(builder.toString());

    }

    //Напишите метод проверки, является ли введенное число простым числом
    static void isSimple(Integer incomeNum){
        Boolean simple=true;
        for (int i = 2; i <=Math.sqrt(incomeNum) ; i++) {
            if (incomeNum>i&&incomeNum%i==0){
               System.out.println(incomeNum +" NoSimple");
                simple=false;
                break;
            }
        }
       if(simple) System.out.println(incomeNum +" Simple");

    }

    //Напишите метод поиска двух самых больших значений в массиве

    static void findTwoMax(int[] incomeArr){
        int max1=0;
        int max2=0;
        for (int i = 0; i <incomeArr.length ; i++) {

          if(incomeArr[i]>max1){
              max2=max1;
              max1=incomeArr[i];

          } else if (incomeArr[i]>max2) {
              max2=incomeArr[i];
          }

        }
        System.out.println("max1="+max1);
        System.out.println("max2="+max2);
    }

    //Проверка строки на палиндром

    static Boolean isStrPallindrom(String incomeStr){

      String str = incomeStr.replaceAll("\\s+","");

       return IntStream.range(0,str.length()/2).allMatch(e->str.toLowerCase().charAt(e)==str.toLowerCase().charAt(str.length()-1-e));

    }

    public static Integer[] deleteDub(Integer[] incomeInt){

        List<Integer> myList= Arrays.stream(incomeInt).distinct().collect(Collectors.toList());
        Integer []outcome = new Integer[myList.size()];
        myList.toArray(outcome);

        return  outcome;
    }


}
