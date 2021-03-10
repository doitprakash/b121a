package com.meteor;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {
	public static void main(String[] args) {
		 List<String> aa = Arrays.asList("hello","hi","how are you?");
         aa.forEach(System.out::println);
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
         LocalDateTime now = LocalDateTime.now();
         java.util.Date time = java.util.Calendar.getInstance().getTime();
         System.out.println(dtf.format(now));
         System.out.println(time);
         
	}

	
     
}
