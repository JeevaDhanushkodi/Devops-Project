package main;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String output = Arrays.stream(a.split(" "))
            .map(s -> s.matches(".*\\d.*") ? reverseWithNumbers(s) : reverse(s))
            .collect(Collectors.joining(" "));
        System.out.println(output);
    }

    public static String reverseWithNumbers(String input) {
        return Arrays.stream(input.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)"))
            .map(s -> s.matches(".*\\d.*") ? s : reverse(s))
            .collect(Collectors.joining(""));
    }

    public static String reverse(String input) {
        return new StringBuilder().append(input).reverse().toString();
	   }
}
