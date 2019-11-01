package basic;

public class flower extends plant {
    private boolean hassmell;
    private boolean hasthorn;

    public flower(String name, String color, boolean hassmell, boolean hasthorn) {
        super(name, color);
        this.hassmell = hassmell;
        this.hasthorn = hasthorn;
    }

    public boolean isHassmell() {
        return hassmell;
    }

    public void setHassmell(boolean hassmell) {
        this.hassmell = hassmell;
    }

    public boolean isHasthorn() {
        return hasthorn;
    }

    public void setHasthorn(boolean hasthorn) {
        this.hasthorn = hasthorn;
    }

    @Override
    public String toString() {
        return "flower{" +
                "hassmell=" + hassmell +
                ", hasthorn=" + hasthorn +
                '}';
    }
}
