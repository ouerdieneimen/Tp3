public class date {
    int jour;
    int mois;
    int annee;

    public date( int jour, int annee,int mois){
        this.jour=jour;
        this.annee=annee;
        this. mois= mois;

    }
    public date(){

    }
    public void affDate(){
        System.out.println(jour+"/"+mois+"/"+annee);
    }

}
