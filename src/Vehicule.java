public class Vehicule {
    private int matricule;
    private String constructeur;
    private String marque;
    private String[] etat = {"Disponible", "Loué", "En cours de réparation"};

    public Vehicule(int matricule, String constructeur, String marque, String[] etat) {
        this.matricule = matricule;
        this.constructeur = constructeur;
        this.marque = marque;
        this.etat = etat;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getConstructeur() {
        return constructeur;
    }

    public void setConstructeur(String constructeur) {
        this.constructeur = constructeur;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String[] getEtat() {
        return etat;
    }

    public void setEtat(String[] etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return  "Matricule=" + matricule + ", Marque=" + marque
                + ", Constructeur=" + constructeur + ", Etat=" + etat;
    }
}
