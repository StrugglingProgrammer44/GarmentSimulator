class CasualPant implements Pant {
    private String color;

    public CasualPant(String color) {
        this.color = color;
    }

    @Override
    public void wear() {
        System.out.println("Wearing casual pants with color: " + color);
    }
}
