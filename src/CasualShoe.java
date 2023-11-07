class CasualShoe implements Shoe {
    private String soleType;

    public CasualShoe(String soleType) {
        this.soleType = soleType;
    }

    @Override
    public void wear() {
        System.out.println("Wearing casual shoes with sole type: " + soleType);
    }
}
