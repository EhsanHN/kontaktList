public class KontaktList {

    private String name;
    private String telefonNummer;

    public KontaktList(String name, String telefonNummer){
        this.name = name;
        this.telefonNummer = telefonNummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefonNummer() {
        return telefonNummer;
    }

    public void setTelefonNummer(String telefonNummer) {
        this.telefonNummer = telefonNummer;
    }
}
