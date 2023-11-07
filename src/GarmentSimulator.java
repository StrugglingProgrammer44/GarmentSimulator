// Driver Class
public class GarmentSimulator {
    public static void main(String[] args) {
        // Example usage for the Professional variant
        GarmentFactory professionalFactory = new ProfessionalGarmentFactory();
        Top professionalTop = professionalFactory.createTop("Formal style");
        Pant professionalPant = professionalFactory.createPant("Slim fit");
        Shoe professionalShoe = professionalFactory.createShoe("Leather");

        professionalTop.wear();
        professionalPant.wear();
        professionalShoe.wear();

        // Example usage for the Casual variant
        GarmentFactory casualFactory = new CasualGarmentFactory();
        Top casualTop = casualFactory.createTop("Striped design");
        Pant casualPant = casualFactory.createPant("Blue color");
        Shoe casualShoe = casualFactory.createShoe("Rubber sole");

        casualTop.wear();
        casualPant.wear();
        casualShoe.wear();

        // Example usage for the Party variant
        GarmentFactory partyFactory = new PartyGarmentFactory();
        Top partyTop = partyFactory.createTop("Floral pattern");
        Pant partyPant = partyFactory.createPant("Fancy style");
        Shoe partyShoe = partyFactory.createShoe("Glitter embellishments");

        partyTop.wear();
        partyPant.wear();
        partyShoe.wear();
    }
}
