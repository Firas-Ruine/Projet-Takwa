public class Client {
    private String cin;
    private String nomComplet;
    private String adresse;

    public Client(String cin, String nomComplet, String adresse) {
        this.cin = cin;
        this.nomComplet = nomComplet;
        this.adresse = adresse;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
