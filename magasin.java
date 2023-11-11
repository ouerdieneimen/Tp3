package tn.tuniprob.gestionmagasino;

    public class Magasin {
        public int identifiant;
        public String adresse;
        public int capacite=50;
        public Produit[50] ensembleProduits;
        public static int nbrProduit=0;
        public static int cpt;

        public Magasin(int identifiant, String adresse, int capacite ) {
            this.identifiant = identifiant;
            this.adresse = adresse;
            this.capacite = capacite;
            this.ensembleProduits = ensembleProduits [50];
            nbrProduit++;
            cpt++;

        }
        public Magasin() {

        }

        public void ajoutProduit(Produit produit){
            if( nbrProduit<50){
                ensembleProduits [nbrProduit] = new produit;
            }else {
                System.out.println(" ERREUR .. le magasin peut contenir 50 produits au maximum !! ");
            }
        }

        public void afficher() {
            System.out.println("l'identifiant de magasin :" + identifiant +
                    "l'adresse :" + adresse +
                    "la capacité:" + capacite +
                    "l'ensemble des produits :");
            for (int i = 0; i < nbrProduit; i++) {
                System.out.println("l'identifiant:"+produit[i].getIdentifiant+
                        "le libelle de produit:"+produit[i].getLibelle()+
                        "la marque:"+produit[i].getMarque+
                        "le prix:"+produit[i].getPrix);

            }

        }


}
