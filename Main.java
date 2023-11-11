public class Test {
    public static void main(String[] args) {

        produit prod1 = new produit();
        produit prod2 = new produit(123, "Lait", "Delice" ,0.0);
        produit prod3 = new produit(321, "Yaourt", "Vitalait",0.0);
        produit prod4 = new produit(231, "Tomate", "Sicam", 1.200);

        prod2.afficher();
        prod3.afficher();
        prod4.afficher();


        prod1.setIdentifiant(456);
        prod1.setLibelle("biscuit");
        prod1.setMarque("prince");
        prod1.setPrix(700);
        prod1.afficher();

        prod2.setPrix(1300);
        prod2.afficher();

        prod3.setPrix(0.550);
        prod3.afficher();


        System.out.println(prod1.toString());
        System.out.println(prod2.toString());
        System.out.println(prod3.toString());
        System.out.println(prod4.toString());

        date d1 = new date(12, 7, 2023);
        prod1.setDate(d1);
        prod2.setDate(new date(25, 11, 2023));
        prod3.setDate(new date(9, 5, 2023));
        prod4.setDate(new date(2, 1, 2024));

        System.out.println("le date d'expiration du Biscuit est");
        prod1.getDate().affDate();
        System.out.println("le date d'expiration de Lait est");
        prod2.getDate().affDate();
        System.out.println("le date d'expiration de Yaourt est");
        prod3.getDate().affDate();
        System.out.println("le date d'expiration de Tomate est");
        prod4.getDate().affDate();
    }
}