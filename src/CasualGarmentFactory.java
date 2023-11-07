class CasualGarmentFactory implements GarmentFactory {
    @Override
    public Top createTop(String characteristic) {
        return new CasualTop(characteristic);
    }

    @Override
    public Pant createPant(String characteristic) {
        return new CasualPant(characteristic);
    }

    @Override
    public Shoe createShoe(String characteristic) {
        return new CasualShoe(characteristic);
    }
}
