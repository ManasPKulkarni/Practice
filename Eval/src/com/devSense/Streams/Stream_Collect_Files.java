package com.devSense.Streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Collect_Files {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filename = "E:\\Users\\Manas Kulkarni\\Prep\\Eval\\src\\com\\devSense\\Streams\\names.txt";
		
//		try (Stream <String> streams = Files.lines(Paths.get(filename))){
//			List<String> data = streams.collect(Collectors.toList());
//			data.forEach(System.out::println);
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		
//		OR
//		
		try (Stream <String> streams = Files.lines(Paths.get(filename))){
			List<String> names = streams.sorted().collect(Collectors.toList());
//			names.forEach(System.out::println);
			System.out.println("Names sorted are : " + names );
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
