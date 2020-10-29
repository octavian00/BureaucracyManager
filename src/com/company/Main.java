package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        List<String> documente=new ArrayList<>(5);
//        documente.add("A");
//        documente.add("B");
        List<Ghiseu> ghiseusList=new ArrayList<>(4);
        ghiseusList.add(new Ghiseu("ghiseu1", Collections.singletonList("A")));
        ghiseusList.add(new Ghiseu("ghiseu2",Collections.singletonList("B")));
        List<Birou> birouList = new ArrayList<>(2);

        birouList.add(new Birou("birou1",ghiseusList));
    }
}
