public class EthansCrypt {
    Character cs;
    Character cf;

    EthansCrypt(Character cs, Character cf) {
        this.cs = cs;
        this.cf = cf;
    }

    EthansCrypt() {
        this('a','z');
    }


    public String TataCrypt(String text) throws UnsupportedOperationException {
        String input = text.toUpperCase();
        StringBuilder secret = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            String c = String.valueOf(input.charAt(i));
            if (c.equals("A")) c = "TA-";if (c.equals("B")) c = "TAB-";
            if (c.equals("C")) c = "TAC-";if (c.equals("D")) c = "TAD-";
            if (c.equals("E")) c = "TE-";if (c.equals("F")) c = "TEF-";
            if (c.equals("G")) c = "TEG-";if (c.equals("H")) c = "TEH-";
            if (c.equals("I")) c = "TI-";if (c.equals("J")) c = "TIJ-";
            if (c.equals("K")) c = "TIK-";if (c.equals("L")) c = "TIL-";
            if (c.equals("M")) c = "TIM-";if (c.equals("N")) c = "TIN-";
            if (c.equals("O")) c = "TO-";if (c.equals("P")) c = "TOP-";
            if (c.equals("Q")) c = "TOQ-";if (c.equals("R")) c = "TOR-";
            if (c.equals("S")) c = "TOS-";if (c.equals("T")) c = "TOT-";
            if (c.equals("U")) c = "TU-";if (c.equals("V")) c = "TUV-";
            if (c.equals("W")) c = "TUW-";if (c.equals("X")) c = "TUX-";
            if (c.equals("Y")) c = "TUY-";if (c.equals("Z")) c = "TUZ-";

            secret.append(c);
        }
        for (int i = 0; i < input.length(); i++) {
            String c = String.valueOf(input.charAt(i));
            if (c.equals("TA-")) c = "a";if (c.equals("TAB-")) c = "b";
            if (c.equals("TAC-")) c = "c";if (c.equals("TAD-")) c = "d";
            if (c.equals("TE-")) c = "e";if (c.equals("TEF-")) c = "f";
            if (c.equals("TEG-")) c = "g";if (c.equals("TEH-")) c = "h";
            if (c.equals("TI-")) c = "i";if (c.equals("TIJ-")) c = "j";
            if (c.equals("TIK-")) c = "k";if (c.equals("TIL-")) c = "l";
            if (c.equals("TIM-")) c = "m";if (c.equals("TIN-")) c = "n";
            if (c.equals("TO-")) c = "o";if (c.equals("TOP-")) c = "p";
            if (c.equals("TOQ-")) c = "q";if (c.equals("TOR-")) c = "r";
            if (c.equals("TOS-")) c = "s";if (c.equals("TOT-")) c = "t";
            if (c.equals("TU-")) c = "u";if (c.equals("TUV-")) c = "v";
            if (c.equals("TUW-")) c = "w";if (c.equals("TUX-")) c = "x";
            if (c.equals("TUY-")) c = "y";if (c.equals("TUZ-")) c = "z";
            secret.append(c);
        }
        return secret.toString();
    }
    public String encrypt(String text) {
        return TataCrypt(text);
    }

    public String decrypt(String text) {
        return TataCrypt(text);
    }
}
