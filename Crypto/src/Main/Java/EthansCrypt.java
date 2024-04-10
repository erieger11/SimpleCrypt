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

    public String encryptToTATA(String text)throws UnsupportedOperationException {
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
        return secret.toString();
    }

    public String decryptTATA(String text) {
        String input = text.toUpperCase();
        StringBuilder secret = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            String c = String.valueOf(input.charAt(i));
            if (c.equals("TA-")) c = "A";if (c.equals("TAB-")) c = "B";
            if (c.equals("TAC-")) c = "C";if (c.equals("TAD-")) c = "D";
            if (c.equals("TE-")) c = "E";if (c.equals("TEF-")) c = "F";
            if (c.equals("TEG-")) c = "g";if (c.equals("TEH-")) c = "H";
            if (c.equals("TI-")) c = "I";if (c.equals("TIJ-")) c = "J";
            if (c.equals("TIK-")) c = "K";if (c.equals("TIL-")) c = "L";
            if (c.equals("TIM-")) c = "M";if (c.equals("TIN-")) c = "N";
            if (c.equals("TO-")) c = "O";if (c.equals("TOP-")) c = "P";
            if (c.equals("TOQ-")) c = "Q";if (c.equals("TOR-")) c = "R";
            if (c.equals("TOS-")) c = "S";if (c.equals("TOT-")) c = "T";
            if (c.equals("TU-")) c = "U";if (c.equals("TUV-")) c = "V";
            if (c.equals("TUW-")) c = "W";if (c.equals("TUX-")) c = "X";
            if (c.equals("TUY-")) c = "Y";if (c.equals("TUZ-")) c = "Z";
            secret.append(c);
        }
        return secret.toString().toLowerCase();
    }
}
