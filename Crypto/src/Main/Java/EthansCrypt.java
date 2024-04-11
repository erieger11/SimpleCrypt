import java.util.ArrayList;

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

    public String encryptToTATA(String text) throws UnsupportedOperationException {
        String input = text.toUpperCase();
        StringBuilder secret = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            String c = String.valueOf(input.charAt(i));
            switch (c) {
                case "A": c = "TA-"; break;
                case "B": c = "TAB-"; break;
                case "C": c = "TAC-"; break;
                case "D": c = "TAD-"; break;
                case "E": c = "TE-"; break;
                case "F": c = "TEF-"; break;
                case "G": c = "TEG-"; break;
                case "H": c = "TEH-"; break;
                case "I": c = "TI-"; break;
                case "J": c = "TIJ-"; break;
                case "K": c = "TIK-"; break;
                case "L": c = "TIL-"; break;
                case "M": c = "TIM-"; break;
                case "N": c = "TIN-"; break;
                case "O": c = "TO-"; break;
                case "P": c = "TOP-"; break;
                case "Q": c = "TOQ-"; break;
                case "R": c = "TOR-"; break;
                case "S": c = "TOS-"; break;
                case "T": c = "TOT-"; break;
                case "U": c = "TU-"; break;
                case "V": c = "TUV-"; break;
                case "W": c = "TUW-"; break;
                case "X": c = "TUX-"; break;
                case "Y": c = "TUY-"; break;
                case "Z": c = "TUZ-"; break;
            }
            secret.append(c);
        }
        return secret.toString();
    }

    public String decryptTATA(String text) {
        String input = text.toUpperCase();
        StringBuilder secret = new StringBuilder();
        String[] tatain = input.split("-");
        String c;
        for (String s : tatain) {
            switch (s) {
                case "TA": c = "A"; break;
                case "TAB": c = "B"; break;
                case "TAC": c = "C"; break;
                case "TAD": c = "D"; break;
                case "TE": c = "E"; break;
                case "TEF": c = "F"; break;
                case "TEG": c = "G"; break;
                case "TEH": c = "H"; break;
                case "TI": c = "I"; break;
                case "TIJ": c = "J"; break;
                case "TIK": c = "K"; break;
                case "TIL": c = "L"; break;
                case "TIM": c = "M"; break;
                case "TIN": c = "N"; break;
                case "TO": c = "O"; break;
                case "TOP": c = "P"; break;
                case "TOQ": c = "Q"; break;
                case "TOR": c = "R"; break;
                case "TOS": c = "S"; break;
                case "TOT": c = "T"; break;
                case "TU": c = "U"; break;
                case "TUV": c = "V"; break;
                case "TUW": c = "W"; break;
                case "TUX": c = "X"; break;
                case "TUY": c = "Y"; break;
                case "TUZ": c = "Z"; break;
                default: c = ""; break;
            }
            secret.append(c);
        }
        return secret.toString().toLowerCase();
    }
}
