package ShammiPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;


public class JavaStream {
	@Test
	public void stream() {
	ArrayList<String> names = new ArrayList<String>();
	names.add("Ankit");
	names.add("Rutush");
	names.add("Pawan");
	names.add("God");
	names.add("Aram");
	//filter method Get all the names starts with A letter
	names.stream().filter(s-> s.startsWith("A")).forEach(s->System.out.println(s));
	
	System.out.println("New Section ---------------------");
	//Create a lightweight stream and perform operation directly
	//print those who has letter more than 4 
	
	Stream.of("Ankit","Rutush","Aram","God","Pawan").filter(s->s.length()>4).forEach(s->System.out.println(s));
	
	System.out.println("New Section ---------------------");
	//limit the output , only 1 element should print
	
	Stream.of("Ankit","Rutush","Aram","God","Pawan","lal").filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	
	
	System.out.println("New Section ---------------------");
	//Map method   print the result in upper case
	Stream.of("Ankit","Rutush","Aram","God","Pawan","lal").filter(s->s.length()>4).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	
	
	System.out.println("New Section ---------------------");
	//Sorted method   print the result in sorted
	Stream.of("Ankit","Rutush","Aram","God","Pawan","lal").filter(s->s.length()>4).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
			System.out.println("New Section ---------------------");
	//Concat of streams , cast the array to list
	List<String> names1 =Arrays.asList("Anki","Rutus","Ara","Go","Pawa");
	
	Stream<String> newstream = Stream.concat(names1.stream(), names.stream());
	//newstream.sorted().forEach(s->System.out.println(s));
	
	System.out.println("New Section ---------------------");
	//AnyMatch method, check"god" is in array or not
	Boolean flag = newstream.anyMatch(s->s.equalsIgnoreCase("God"));
	System.out.println(flag);
	
	//collect mentod to collect the stream into List or set
	List<String> NewList = Stream.of("AB", "CD","EF","GH","IJ","KL").collect(Collectors.toList());
	
	System.out.println(NewList.get(0));
	
	
	//Distinct Menthod, to get unique items of list
	List<Integer> numbers = Arrays.asList(9,2,6,8,5,2,5,8,4,6);
	numbers.stream().distinct().forEach(s-> System.out.println(s));
	
	
	
	
	
	
	
	System.out.println("New Section ---------------------");
	//Concat of streams , cast the array to list
	
	
	}}
