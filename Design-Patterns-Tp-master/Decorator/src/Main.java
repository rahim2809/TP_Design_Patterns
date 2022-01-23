public class Main {
    public static void main(String[] args) {
        Assurance assurance = new ResponsabiliteCivile();
        System.out.println("frais = " + assurance.cost());
        assurance = new Incendie(assurance);
        System.out.println("frais = " + assurance.cost());
        assurance = new Vol(assurance);
        System.out.println("frais = " + assurance.cost());
        assurance = new Inondation(assurance);
        System.out.println("frais = " + assurance.cost());
        assurance = new DommageEtCollision(assurance);
        System.out.println("frais = " + assurance.cost());
    }
}
