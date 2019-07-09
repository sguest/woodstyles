package sguest.woodstyles;

public enum WoodType {
    OAK("oak"),
    SPRUCE("spruce"),
    BIRCH("birch"),
    JUNGLE("jungle"),
    ACACIA("acacia"),
    DARK_OAK("dark_oak");

    private final String text;

    WoodType(String text)
    {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
