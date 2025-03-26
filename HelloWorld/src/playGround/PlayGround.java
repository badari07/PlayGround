package playGround;

import java.util.*;
import java.util.stream.Collectors;

public class PlayGround {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//
//        List<String> names = List.of("apple", "banana", "cherry");
//
//        System.out.println(names.stream().map(e -> e.toUpperCase()).collect(Collectors.toList()));
//
//        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
//
//        System.out.println(numbers.stream().filter(e -> e % 2 == 0).collect(Collectors.toList()));
//
//        List<List<Integer>> listOfLists = List.of(
//                List.of(1, 2, 3),
//                List.of(4, 5),
//                List.of(6, 7, 8)
//        );
//
//        System.out.println(listOfLists.stream().flatMap(Collection::stream).collect(Collectors.toList()));

//        String input = "swiss";
//
//        System.out.println(input.chars().);
//        int[] nums = {1, 3, 4, 2, 2};
//        int res =0;
//        HashSet<Integer> seen = new HashSet<>();
//        for (int num : nums) {
//            if (!seen.add(num)) {
//                 res = num;
//            }
//        }
//
//        System.out.println(res);

//        List<Integer> numbers = List.of(10, 20, 5, 8, 50, 30);
//
//        System.out.println(numbers.stream().max(Integer::compareTo));

        // String s = "java is good tech";
        //String s ="programming";
//        //find the duplicste character
//
//        //stream java 8
//            Map<Character,Long> duiplicate = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()))
//                .entrySet().stream()
//                .filter(e -> e.getValue() > 1).collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
//
//        System.out.println(duiplicate);


//        input: str = “aa bb cdc g”
//        Output: aa bb cdc jjjjjj
        //aba bb cb”
        //a bab bcb
        //1.find all possiable palindorm
        //2. find the max  more number  palindrom
        //bark
//single character  palindorm not req


        //bab bcb
        String input = "ababbcb";
List<String> Split = getMaXPal(input);
        System.out.println(String.join(" ", Split));

    }

    public static List<String> getMaXPal(String s) {
        //all partion of string
        List<List<String>> allPart = new ArrayList<>();
        List<String> currentPartion = new ArrayList<>();
        findPalindron(s, 0, currentPartion, allPart);


       return allPart.stream().filter(partion -> partion.stream().noneMatch(str -> str.length() == 1))
               .max(Comparator.comparingInt(List::size)).orElse(Collections.emptyList());
    }

    public static void findPalindron(String s, int start, List<String> current , List<List<String>> allPart) {
        if(start == s.length()) {
            allPart.add(new ArrayList<>(current));
            return;
        }

        for(int end = start + 1; end <= s.length(); end++) {
           String sub = s.substring(start, end);
           if(isPalindnron(sub) && sub.length() > 1) {
               current.add(sub);
               findPalindron(s, end, current, allPart);
               current.remove(current.size() -1);
           }
        }

    }
    public static boolean isPalindnron(String s) {
        int left =0, right = s.length() -1;
while(left < right) {
    if(s.charAt(left) != s.charAt(right)) return false;
    left++;
    right--;
}
return true;
    }

}


