package com.devSense.Streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class DVDInfo{
	String title;
	String name;
	String protagonist;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProtagonist() {
		return protagonist;
	}
	public void setProtagonist(String protagonist) {
		this.protagonist = protagonist;
	}
	
	public DVDInfo(String t, String n, String p) {
		// TODO Auto-generated constructor stub
		this.title = t;
		this.name = n;
		this.protagonist = p;
	}
	
	public String toString() {
		return title + "/ " + name + "/ " + protagonist;
	}
}


public class StreamFromFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<DVDInfo> dvds = loadDVDs("C:\\Users\\Manas Kulkarni\\Prep\\Eval\\src\\com\\devSense\\Streams\\FileText.txt");
		dvds.forEach(System.out::println);
	}

	public static List<DVDInfo> loadDVDs(String fileName) {
		List<DVDInfo> dvdlist = new ArrayList<DVDInfo>();
		
		//Start streaming file line by line
//		try (Stream<String> stream = Files.lines(Paths.get(fileName))){
//			stream.forEach(line -> {
//				String[] dvdItems = line.split("/");
//				DVDInfo dvd = new DVDInfo(dvdItems[0], dvdItems[1], dvdItems[2]);
//				dvdlist.add(dvd);
//
//
//			});
//			
//		}
		
//		OR 
		
		try (Stream<String> stream = Files.lines(Paths.get(fileName))){
			dvdlist = stream.map(line -> {
				String[] dvdItems = line.split("/");
				DVDInfo dvd = new DVDInfo(dvdItems[0], dvdItems[1], dvdItems[2]);
				return dvd;
			}).collect(Collectors.toList());
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error reading DVDs");
			e.printStackTrace();
		}
		
		return dvdlist;
		
	}
}


