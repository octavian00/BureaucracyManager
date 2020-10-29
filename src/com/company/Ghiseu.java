package com.company;

import java.util.List;

public class Ghiseu {
    private String name;
    private List<String> documents;

    public Ghiseu(String name, List<String> documents) {
        this.name = name;
        this.documents = documents;
    }

    public String getName() {
        return name;
    }

    public List<String> getDocuments() {
        return documents;
    }

    public synchronized void proceseazaDocument(String document){
        System.out.println("Documentul " + document + " a fost procesat");
    }
}
