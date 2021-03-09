package com.meteor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {
	public static void main(String[] args) {
		 List<String> aa = Arrays.asList("hello","hi","how are you?");
         aa.forEach(System.out::println);
	}
     
}
