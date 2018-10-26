package com.company;

import static org.junit.jupiter.api.Assertions.*;


public class Test {

    @org.junit.jupiter.api.Test
    void toStringTest() {
        Student student = new Student("Meho", "Mehic", 12345);
        assertEquals("Mehic Meho (12345)", student.toString());
    }

    @org.junit.jupiter.api.Test
    void ispisiStudentaTest1() throws Exception {
        Student student = new Student("Meho","Mehic",12345);
        Predmet predmet = new Predmet("RPR",102,2);
        predmet.upisi(student);
        predmet.ispisiStudente();
        assertEquals(0,predmet.getBrojStudenata());
    }

    @org.junit.jupiter.api.Test
    void ispisiStudentaTest2(){
        Student student = new Student("Meho","Mehic",12345);
        Predmet predmet = new Predmet("RPR",102,2);

        assertThrows(IllegalAccessException.class,() -> {predmet.ispisiStudente(student);});
    }

    @org.junit.jupiter.api.Test
    void setImeTest() {
        Student student = new Student("Meho","Mehic",12345);

        student.SetIme("Asd");

        assertEquals("Asd",student.GetIme());

    }

    @org.junit.jupiter.api.Test
    void setPrezimeTest() {
        Student student = new Student("Meho","Mehic",12345);

        student.SetPrezime("Asd");

        assertEquals("Asd",student.GetPrezime());
    }



}