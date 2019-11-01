package basic;

public class herb extends plant {
    private boolean ismedicinal;
    private String season;

    public herb(String name, String color, boolean ismedicinal, String season) {
        super(name, color);
        this.ismedicinal = ismedicinal;
        this.season = season;
    }

    public boolean isIsmedicinal() {
        return ismedicinal;
    }

    public void setIsmedicinal(boolean ismedicinal) {
        this.ismedicinal = ismedicinal;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return "herb{" +
                "ismedicinal=" + ismedicinal +
                ", season='" + season + '\'' +
                '}';
    }
}
