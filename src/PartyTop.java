class PartyTop implements Top {
    private String pattern;

    public PartyTop(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public void wear() {
        System.out.println("Wearing a party top with pattern: " + pattern);
    }
}
