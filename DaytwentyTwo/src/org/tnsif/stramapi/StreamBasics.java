package org.tnsif.stramapi;

//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays; 
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasics {

	public static void main(String[] args) {
		
		Stream<String> strStream=Stream.of("hii","byy","sdf");
		strStream.forEach(System.out::println);
		System.out.println("----------------------");
		
		List<String> word=Arrays.asList("hhh","kkk","ppp");
		System.out.println("UpperCase");
		word.stream().map(str->str.toUpperCase()).forEach(System.out::println);
		System.out.println("---------------------------");
		word.stream().forEach(System.out::println);
		System.out.println("---------------------------");
		
		
		Float f[]= {10.0f,45.0f,2.3f,2.3f,15.0f,15f};
		Stream<Float> fStream=Arrays.stream(f);
		Consumer<Float> c=(n)->System.out.println("Price is "+ n);
		fStream.forEach(c);
		
		//limit->return first 2 element present in stream
		System.out.println("----------------------");
		fStream=Arrays.stream(f);
		fStream.limit(2).forEach(c);
		
		//skip->skip the element
		System.out.println("----------------------");
		fStream=Arrays.stream(f);
		fStream.skip(1).forEach(c);
		
		//distinct->remove duplicate
		System.out.println("------------------------");
		fStream=Arrays.stream(f);
		fStream.distinct().forEach(c);
		System.out.println("----------------------");
		
//		strStream =Stream.of("hii","byy","sdf");
//		strStream.map(str->str.toUpperCase()).forEach(System.out::println);
		
		
		  //creation of list from an array of integers 
		  List<Integer> intList=Arrays.asList(16,11,3,4,5);
		   System.out.println("List is "+intList);
		  
		  //create another list with square if intList 
		  List<Integer> sqrList=new ArrayList<Integer>(); 
		  for(Integer no:intList)
		  {
		   sqrList.add(no*no); 
		   }
		  System.out.println("Square of  List element "+sqrList);
		  
		  //Using Stream API
		  List<Integer> cubeList;
		  intList=intList.stream().sorted().collect(Collectors.toList());
		  cubeList=intList.stream().map(x->x*x*x).collect(Collectors.toList());
		  System.out.println("Cube of  List element "+cubeList );
		  
		  ///Split up line 25 
		  Stream<Integer> intStream=intList.stream();
		   intStream=intStream.map(x->x*x*x); //System.out.println(intStream.count());
		  cubeList=intStream.collect(Collectors.toList());
		  
		  //System.out.println(intStream.count()); 
		  //Shows IllegalStateException same  as we again defined a run method in thread 
		  System.out.println(cubeList);
		  
		  
		  List<String> nameList=Arrays.asList("Yashu","Rushu","Rupu");
		  System.out.println(nameList);
		  Stream<String> strStreamOne= nameList.stream();
		  intStream=strStreamOne.map(name->name.length());
		  cubeList=intStream.collect(Collectors.toList());
		  System.out.println(cubeList); //Gives the hash values
		  System.out.println(strStreamOne);
		  
		  
		  //filter() //To filter only odd numbers from intList()
		  intStream=intList.stream(); Stream<Integer>
		  result=intStream.filter(n->n%2!=0);
		  
		  List<Integer> rList=result.collect(Collectors.toList());
		  System.out.println(rList);
		  
		  //filter() return palindrome strings from the inputs 
		  List<String> wd=Arrays.asList("cat","car","madam","rara","yaay"); System.out.println(wd);
		  Stream<String> wdStream= wd.stream();
		  wdStream=wdStream.filter(w->w.equals(new
		  StringBuffer(w).reverse().toString()));
		  nameList=wdStream.collect(Collectors.toList()); System.out.println(nameList);
		  
		  //passing number Predicate<Integer> pre; pre=(no)->no%2==0;
		  
		  intStream =intList.stream(); //intStream=intStream.filter(numbers);
		  sqrList=intStream.collect(Collectors.toList()); System.out.println(sqrList);
		  
		  List<Student> stList= new ArrayList(); Student st=new Student(101,"Yashu",
		  86.00f); stList.add(st); Student st1=new Student(102,"Yashhu", 76.00f);
		  stList.add(st1); Student st2=new Student(103,"Yasshu", 96.00f);
		  stList.add(st2); Student st3=new Student(104,"Yaashu", 66.00f);
		  stList.add(st3); System.out.println(stList+"  ");
		  
		  Predicate<Student> prePred=(stud)->stud.getPer()> 70.00f; Stream<Student>
		  studStream=stList.stream(); studStream=studStream.filter(prePred);
		  List<Student> newStud=studStream.collect(Collectors.toList());
		  System.out.println(newStud);
		 
		
		
	}
}
