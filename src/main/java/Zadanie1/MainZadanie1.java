package Zadanie1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainZadanie1 {


    public static void main(String[] args) {

       Map<Long, Student> studentMap = new TreeMap<>();

       Student student1 = new Student(1234, "Beata", "Nowak");
       studentMap.put(student1.getNumerIndeksu(), student1);
       Student student2 = new Student(6655, "Magda", "Nowak");
       studentMap.put(student2.getNumerIndeksu(), student2);
       Student student3 = new Student(4555, "Jan", "Kowal");
       studentMap.put(student3.getNumerIndeksu(), student3);
       Student student4 = new Student(2345, "Olgierd", "Kowalski");
       studentMap.put(student4.getNumerIndeksu(), student4);
       Student student5 = new Student(100400, "Monika", "Chahah");
       studentMap.put(student5.getNumerIndeksu(), student5);
       Student student6 = new Student(100200, "Michał", "Uchchchu");
       studentMap.put(student6.getNumerIndeksu(), student6);

       System.out.println(studentMap.containsKey(100200L));
       System.out.println(studentMap.get(100200L));

       System.out.println(studentMap.containsKey(100400L));
       System.out.println(studentMap.get(100400L));

       System.out.println("Liczba studentów na liście: " + studentMap.size());

       System.out.println("Lista studentów: "+ studentMap.values());





    }
}
