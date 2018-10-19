package com.company;

public class Program {
    public static void main(String[] args) {
        Student s = new Student("naida", "Zebra",18220);
        s.SetIme("Naida");
        Student s2 = new Student("Iliana", "Sinkoc", 17554);
        Predmet p = new Predmet("IF", 111, 7);
        try {
            p.upisi(s);
            p.upisi(s2);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        p.ispisiStudente();
        p.ispisi(s);
        p.ispisiStudente();
    }
}