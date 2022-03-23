package com.company;

import java.util.Comparator;

public class Libro {
    public String titolo;
    public String autore;
    public Integer anno;

    public Libro(String titolo, String autore, Integer anno) {
        this.titolo = titolo;
        this.autore = autore;
        this.anno = anno;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public Integer getAnno() {
        return anno;
    }

    @Override
    public String toString() {
        return titolo + " " + autore + " " + anno;
    }

    static class annoComparator implements Comparator<Libro>{
        public int compare(Libro o1, Libro o2){
            return o1.getAnno().compareTo(o2.getAnno());
        }
    }
}
