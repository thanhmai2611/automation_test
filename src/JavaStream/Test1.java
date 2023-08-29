package JavaStream;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

//    public void regular() {
////        count the number of names staring with alphabet A in list
//        ArrayList<String> list = new ArrayList<String>();
//        list.add("Ahihi");
//        list.add("OK");
//        list.add("Baby");
//        list.add("Anna");
//        list.add("Andy");
//        list.add("Mai");
//        int count = 0;
//        for(int i = 0; i < list.size();i++)
//        {
//          String a =  list.get(i);
//          if(a.startsWith("A"))
//            {
//                count ++ ;
//            }
//        }
//        System.out.println(count);
//    }

//        optimize code with stream
      /*
        public static void main(String[] args) {
            {
                ArrayList<String> list = new ArrayList<String>();
                list.add("Ahihi");
                list.add("OK");
                list.add("Baby");
                list.add("Anna");
                list.add("Andy");
                list.add("Mai");
//                there is no life for intermediate op if there is no terminal op
//                terminal operation will execute only if inter op return true
//                we can create stream
//                how to use filter in stream api
                long b = list.stream().filter(s -> s.startsWith("A")).count();
                System.out.println(b);
                long c = Stream.of("Ahihi","OK","Baby","Anna","Andy","Mai").filter(s ->
                {
                    return s.startsWith("A");
                }).count();
                System.out.println(c);
//                print all the name in list
                list.stream().filter(s -> s.length() >0).forEach(s -> System.out.println(s));
                list.stream().filter(s -> s.length() >0).limit(3).forEach(s -> System.out.println(s));
            }
        }

*/
    /*
//    print names which have last letter as "i" with uppercase
public static void main(String[] args) {
    {
        Stream.of("Ahihi", "OK", "Baby", "Anna", "Andy", "Mai").filter(s -> s.endsWith("i")).map(s -> s.toUpperCase())
        .forEach(s -> System.out.println(s));
    }
    }
    */
//    print names  which have first letter as "a" with uppercase and sort
/*
    public static void main(String[] args) {
    {
        Stream.of("Ahihi", "OK", "Baby", "Anna", "Andy", "Mai").filter(s -> s.startsWith("A")).map(s -> s.toUpperCase())
                .sorted().forEach(s -> System.out.println(s));
    }
}
*/
//    merge two lists
    /*
public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
        list.add("Ahihi1");
        list.add("OK1");
        list.add("Baby1");
        list.add("Anna1");
        list.add("Andy1");
        list.add("Mai1");

    List<String> names = Arrays.asList("Ahihi", "OK", "Baby", "Anna", "Andy", "Mai");
    Stream<String> listMerge = Stream.concat(list.stream(),names.stream());
//    listMerge.forEach(s -> System.out.println(s));
    boolean flag = listMerge.anyMatch(s -> s.equalsIgnoreCase("Ahihi"));
    System.out.println(flag);
    Assert.assertTrue(flag);
}
     */
public static void main(String[] args) {
    List<String> ls = Stream.of("Ahihi", "OK", "Baby", "Anna", "Andy", "Mai").filter(s -> s.startsWith("A")).map(s -> s.toUpperCase(Locale.ROOT))
            .collect(Collectors.toList());
    System.out.println(ls.get(0));

//print unique number from the array/ sort it and get 3rd index
    List<Integer> number1 = Arrays.asList(5, 6, 4, 3, 5, 9, 1, 6, 8);
    number1.stream().distinct().forEach(s -> System.out.println(s));
    List<Integer> num = number1.stream().distinct().sorted().collect(Collectors.toList());
    System.out.println(num.get(2));
}
}

