package com.company;

public class Student {
    private String Ime, Prezime;
    private int IndexBroj;

    public Student(String Ime, String Prezime, int Indexbroj) {
        this.Ime = Ime;
        this.Prezime = Prezime;
        this.IndexBroj = Indexbroj;
    }

    public String GetIme() {
        return Ime;
    }

    public String GetPrezime() {
        return Prezime;
    }

    public int GetIndexBroj() {
        return IndexBroj;
    }

    public void SetIme(String Ime) {
        this.Ime = Ime;
    }

    public void SetName(String Prezime) {
        this.Prezime = Prezime;
    }

    public void SetIndexBroj(int IndexBroj) {
        this.IndexBroj = IndexBroj;
    }

    public String ToString() {
        return Prezime + " " + Ime + " (" + IndexBroj + ")";
    }

    public void IspisiStudenta() {
        System.out.println(this);
    }
}
