package formageometrica;

public abstract class FormaGeometrica {
    private int id;

    protected FormaGeometrica() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Id:" + id;
    }
}
