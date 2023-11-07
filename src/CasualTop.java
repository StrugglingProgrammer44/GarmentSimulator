class CasualTop implements Top {
    private String design;

    public CasualTop(String design) {
        this.design = design;
    }

    @Override
    public void wear() {
        System.out.println("Wearing a casual top with design: " + design);
    }
}
