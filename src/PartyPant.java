class PartyPant implements Pant {
    private String style;

    public PartyPant(String style) {
        this.style = style;
    }

    @Override
    public void wear() {
        System.out.println("Wearing party pants with style: " + style);
    }
}
