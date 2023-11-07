class ProfessionalTop implements Top {
    private String style;

    public ProfessionalTop(String style) {
        this.style = style;
    }

    @Override
    public void wear() {
        System.out.println("Wearing a professional top with style: " + style);
    }
}
