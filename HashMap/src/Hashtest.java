import java.util.*;    
class Book {    
int id;    
String name,author,publisher;    
int quantity;    
public Book(int id, String name, String author, String publisher, int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;    
}    
}    
public class Hashtest {    
public static void main(String[] args) {    
    //Creating map of Books    
    Map<Integer,Book> map=new HashMap<Integer,Book>();    
    //Creating Books    >>> nome da class + new Class + informações dos construtores.
    Book b1=new Book(101,"Let us C                        ","Yashwant Kanetkar","BPB         ",8);    
    Book b2=new Book(102,"Data Communications & Networking","Forouzan         ","Mc Graw Hill",4);    
    Book b3=new Book(103,"Operating System                ","Galvin           ","Wiley       ",6);    
    Book b4=new Book(104,"JAVA                            ","P.Isidro         ","Itau        ",3);    
    //Adding Books to map   
    map.put(1,b1);  
    map.put(2,b2);  
    map.put(3,b3); 
    map.put(4,b4);
    //Traversing map  >>> toString ser um for para levantar as informações do MAP https://www.javatpoint.com/java-hashmap
    for(Map.Entry<Integer, Book> entry:map.entrySet()){    
        int key=entry.getKey();  
        Book b=entry.getValue();  
        System.out.println(key+" Details:");  
        System.out.println(b.id+" | "+b.name+" | "+b.author+" | "+b.publisher+" | "+b.quantity);   
    }    
}    
} 