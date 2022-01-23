package composite;

import java.util.ArrayList;
import java.util.List;

public class Category implements IComponent {

    private List<IComponent> childList = new ArrayList<>();
    private String name;
    private int level;

    public Category(String name) {
        this.name = name;
    }

    public void addComponent(IComponent component) {
        component.setLevel(this.level + 1);
        childList.add(component);
    }


    public void deleteCategory(IComponent component) {
        childList.remove(component);
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
