package com.company;


public class Predmet {
    private Student[] NizStudenata=null;
    private String ImePredmeta;
    private int SifraPredmeta, BrojStudenata = 0;
    private final int MAX_BROJ_STUDENATA;

    public Predmet(String imePredmeta,int sifraPredmeta, int maxBroj){
        this.ImePredmeta = imePredmeta;
        this.SifraPredmeta = sifraPredmeta;
        MAX_BROJ_STUDENATA = maxBroj;
        BrojStudenata = 0;
        NizStudenata = new Student[MAX_BROJ_STUDENATA];
    }

    public int getSifraPredmeta() {
        return SifraPredmeta;
    }
    public String getImePredmeta() {
        return ImePredmeta;
    }
    public Student[] getNizStudenata() {
        return NizStudenata;
    }
    public void setImePredmeta(String imePredmeta) {
        this.ImePredmeta = imePredmeta;
    }
    public void setSifraPredmeta(int sifraPredmeta) {
        this.SifraPredmeta = sifraPredmeta;
    }
    public void setNizStudenata(Student[] nizStudenata) {
        this.NizStudenata = nizStudenata;
    }

    public void upisi(Student s) throws Exception{
        if(BrojStudenata >= MAX_BROJ_STUDENATA){
            throw new Exception("Dostignut je maksimalan broj studenata");
        }
        NizStudenata[BrojStudenata++] = s;
    }



    public void ispisi(Student s){
        for(int i = 0; i < BrojStudenata; i++){
            if(s.equals(NizStudenata[i])){
                for(int j=i; j<(BrojStudenata-1) ;j++){
                    NizStudenata[j] = NizStudenata[j+1];
                }
                BrojStudenata--;
            }
        }
    }
    public void ispisiStudente(){
        for(int i = 0; i < BrojStudenata; i++){
            System.out.print(i + 1 + ". ");
            NizStudenata[i].IspisiStudenta();
        }
    }

    public int getBrojStudenata() {
        return BrojStudenata;
    }
}
