public class produit {
    private int identifiant;
    private String libelle;
    private String marque;
    private double prix;
    public static int cpt;

    public Produit (int identifiant, String libelle, String marque, double prix) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
        cpt++;

    }


    public Produit() {

    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }
    public int getIdentifiant() {
        return identifiant;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public String getMarque() {
        return marque;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public double getPrix() {
        return prix;
    }
    public void setDate(date date) {
        this.date = date;
    }
    public date getDate() {
        return date;
    }

    public void afficher (){
        System.out.println("identifiant:"+identifiant+"/"+"libellé:"+libelle+"/"+"marque:"+marque+"/"+"prix:"+prix);
    }


}