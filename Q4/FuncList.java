public final class FuncList {
    private static final FuncList EMPTY = new FuncList();

    private final boolean empty;
    private final Element head;
    private final FuncList tail;

    private FuncList() {
        this.empty = true;
        this.head = null;
        this.tail = null;
    }

    private FuncList(Element head, FuncList tail) {
        this.empty = false;
        this.head = head;
        this.tail = tail;
    }

    public static FuncList empty() {
        return EMPTY;
    }

    public FuncList cons(int value) {
        return new FuncList(new Element(value), this);
    }

    public int head() {
        if (empty) {
            throw new IllegalStateException("Cannot call head() on an empty list.");
        }
        return head.getItem();
    }

    public FuncList tail() {
        if (empty) {
            throw new IllegalStateException("Cannot call tail() on an empty list.");
        }
        return tail;
    }

    public boolean isEmpty() {
        return empty;
    }

    @Override
    public String toString() {
        if (empty) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        FuncList current = this;
        while (!current.isEmpty()) {
            builder.append(current.head());
            current = current.tail();
            if (!current.isEmpty()) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }

    public static void main(String[] args) {
        FuncList list = FuncList.empty().cons(30).cons(20).cons(10);
        System.out.println("List: " + list);
        System.out.println("Head: " + list.head());
        System.out.println("Tail: " + list.tail());
    }
}
