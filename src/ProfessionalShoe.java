class ProfessionalShoe implements Shoe {
    private String material;

    public ProfessionalShoe(String material) {
        this.material = material;
    }

    @Override
    public void wear() {
        System.out.println("Wearing professional shoes with material: " + material);
    }
}
