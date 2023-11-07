class PartyShoe implements Shoe {
    private String embellishments;

    public PartyShoe(String embellishments) {
        this.embellishments = embellishments;
    }

    @Override
    public void wear() {
        System.out.println("Wearing party shoes with embellishments: " + embellishments);
    }
}
