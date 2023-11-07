class ProfessionalGarmentFactory implements GarmentFactory {
    @Override
    public Top createTop(String characteristic) {
        return new ProfessionalTop(characteristic);
    }

    @Override
    public Pant createPant(String characteristic) {
        return new ProfessionalPant(characteristic);
    }

    @Override
    public Shoe createShoe(String characteristic) {
        return new ProfessionalShoe(characteristic);
    }
}
