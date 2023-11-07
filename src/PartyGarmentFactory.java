class PartyGarmentFactory implements GarmentFactory {
    @Override
    public Top createTop(String characteristic) {
        return new PartyTop(characteristic);
    }

    @Override
    public Pant createPant(String characteristic) {
        return new PartyPant(characteristic);
    }

    @Override
    public Shoe createShoe(String characteristic) {
        return new PartyShoe(characteristic);
    }
}
