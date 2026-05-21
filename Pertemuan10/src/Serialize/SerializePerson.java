/**
 * File : SerializePerson.java
 * Deskripsi : Program untuk serialisasi objek Person
 * Pembuat : Muhammad Rofad Hamdani/24060124130117
 * Tanggal : 14 Mei 2026
 */

package Serialize;

import java.io.*;

//class Person
class Person implements Serializable{
    private String name;

    public Person(String n){
        name = n;
    }

    public String getName(){
        return name;
    }
}

//class SerializePerson
public class SerializePerson{

    public static void main(String[] args){
        Person person = new Person("Panji");
        try{
            FileOutputStream f= new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("selesai menulis objek person");
            s.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}