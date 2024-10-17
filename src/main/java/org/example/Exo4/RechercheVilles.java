package org.example.Exo4;

import java.util.ArrayList;
import java.util.List;

public class RechercheVilles {
    private List<String> villes;

    public RechercheVilles(List<String> villes) {
        this.villes = villes;
    }

    public List<String> getVilles() {
        return villes;
    }

    public List<String> rechercher(String mot) {
        String motClean = mot.trim().toLowerCase();
        List<String> result = new ArrayList<String>();

        if (motClean.equals("*")) {
            return villes;
        }

        if (motClean.length() < 2) {
            throw new CityNameTooShortException();
        }

        for (String v : villes) {
            if (v.toLowerCase().contains(motClean)) {
                result.add(v);
            }
        }

        return result;
    }
}
