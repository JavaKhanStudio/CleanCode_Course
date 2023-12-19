package exo3.codemystere;

import java.util.*;

public class Resa {

    private static final int NB_SIEGES = 100;
    private static Map<Integer, Boolean> sieges = new HashMap<>();

    static {
        for (int i = 1; i <= NB_SIEGES; i++) {
            sieges.put(i, Boolean.FALSE);
        }
    }

    public static void main(String[] args) {
        rS(15);
        rS(20);
        aS();
        cS(15);
        aS();
    }

    private static void rS(int nS) {
        if (nS > 0 && nS <= NB_SIEGES && !sieges.get(nS)) {
            sieges.put(nS, Boolean.TRUE);
        } else {
            System.out.println("Erreur");
        }
    }

    private static void cS(int nS) {
        if (nS > 0 && nS <= NB_SIEGES && sieges.get(nS)) {
            sieges.put(nS, Boolean.FALSE);
        } else {
            System.out.println("Erreur");
        }
    }

    private static void aS() {
        for (int i = 1; i <= NB_SIEGES; i++) {
            System.out.print(sieges.get(i) ? "X " : "_ ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
