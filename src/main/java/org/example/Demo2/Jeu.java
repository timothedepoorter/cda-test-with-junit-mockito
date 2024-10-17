package org.example.Demo2;

import java.util.ArrayList;

public class Jeu {
    private final Ide de;

    private ArrayList<String> arrayList;

    public Jeu(Ide de) {
        this.de = de;
    }

    public boolean jouer() {
        return de.lancer() == 7;
    }
}
