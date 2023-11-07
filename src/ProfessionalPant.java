class ProfessionalPant implements Pant {
    private String fit;

    public ProfessionalPant(String fit) {
        this.fit = fit;
    }

    @Override
    public void wear() {
        System.out.println("Wearing professional pants with fit: " + fit);
    }
}
