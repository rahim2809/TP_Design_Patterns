package composite;

public class Product implements IComponent {

    private String name;
    private int level;

    public Product(String name) {
        this.name = name;
    }


    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
