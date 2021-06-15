package model;

import java.util.ArrayList;

public class EmailContent {

    String navn;
    String telefonnummer;
    String kommentar;

    private static ArrayList<EmailContent> content = new ArrayList<>();

    public static ArrayList<EmailContent> getContent() {
        return content;
    }

    public static void setContent(ArrayList<EmailContent> content) {
        EmailContent.content = content;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public String getKommentar() {
        return kommentar;
    }

    public void setKommentar(String kommentar) {
        this.kommentar = kommentar;
    }



}
