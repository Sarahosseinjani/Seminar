import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.util.*;

public class Seminar {
ArrayList<Student>  s=new ArrayList<Student>();
String name,dat;
int id=0,age=0,pass=0;

 public void add(String name,int pass,int age, int id,String date) {
	 Student stu =new Student(name,pass,age,id,date);
	 s.add(stu);
	 
 }
 public int check(int id) {
	 int f=0;
	 
	 for(Student stu:s) {
		
		 if(id==stu.id) {
			 f=1;
		 }
		 
	 }
	 return f;
 }
 public void List() {
	 for(Student stu:s) {
		 
		
	 }
 }
 public int search(int id) {
	 for(Student stu:s) {
		 if(id==stu.id) {
			 name=stu.name;
	         pass=stu.password;
	         age=stu.age;
	         id=stu.id;
	         dat=stu.date;
	         return 1;
		 }
	 }
	 return 0;
 }
 public void load(){        //method for loading information from file
		
		try{
		 FileReader reader=new FileReader("file.txt");
		 Scanner in=new Scanner(reader);
		
		 while(in.hasNext()){
			 in.useDelimiter(",,"); 
		     String line=in.next();
			 String part[]=line.split(",");
			 
			 Student stu=new Student(part[0],Integer.parseInt(part[1]),Integer.parseInt(part[2]),Integer.parseInt(part[3]),part[4]);
	         s.add(stu);
	         
			 } 
		 
		 in.close();
	 }
	 catch(FileNotFoundException ex){
		 System.out.println("file not found");
	 }
		
	}	
 public void loadList(int i){        
		
		try{
		 FileReader reader=new FileReader("file.txt");
		 Scanner in=new Scanner(reader);
		 
		 while(i<s.size()){
			 in.useDelimiter(",,");
			 String line=in.next();
			 String part[]=line.split(",");
	         name=part[0];
	         pass=Integer.parseInt(part[1]);
	         age=Integer.parseInt(part[2]);
	         id=Integer.parseInt(part[3]);
	         dat=part[4];
	         i++;
		 }
		 in.close();
	 }
	 catch(FileNotFoundException ex){
		 System.out.println("file not found");
	 }
		
	}
 
}
