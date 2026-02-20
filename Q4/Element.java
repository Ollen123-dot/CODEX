public final class Element {
    private final int item;

    public Element(int item) {
        this.item = item;
    }

    public int getItem() {
        return item;
    }

    @Override
    public String toString() {
        return String.valueOf(item);
    }
}
