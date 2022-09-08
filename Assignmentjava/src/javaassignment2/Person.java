package javaassignment2;

import java.util.Objects;

public class Person {
    private int id;
    private String name;
    private int age; 

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }
// constructors
    public Person(int id, String name,int age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    public Person() {
        super();
    }

 public void printDetails() {
    System.out.println("Id: " + id);
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);    
 }
 
 @Override
 public int hashCode() {
     return Objects.hash(id,name); 
}
// @Override
// public boolean equals(Object obj) {
//     if(this == obj)
//         return true;
//     if(obj == null)
//         return false;
//     if(getClass() != obj.getClass())
//         return false;
//     Person other = (Person) obj;
//     return id == other.id && Objects.equals(name,  other.name); 
// }
 
 @Override
 public String toString() {
     return "Person [Id = "+id + ", Name = "+name + ", Age ="+age + "]";
 }
 
 public boolean equals(Object obj)
 {
     if(obj != null && obj instanceof Person)
     {
         Person other = (Person) obj;
         return(this.id == other.id && this.name.equals(other.name));
     }
     return false;
 }
 
    public static void main(String[] args) {

       
    }

}
