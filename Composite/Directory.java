import java.util.ArrayList;
import java.util.List;

public class Directory implements IFileSystemComponent {
    private String name;
    private List<IFileSystemComponent> components;

    public Directory(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void addcomponent(IFileSystemComponent component) {
        components.add(component);
    }

    public void removecomponent(IFileSystemComponent component) {
        components.remove(component);
    }

    public IFileSystemComponent getcomponent(int index) {
        return components.get(index);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory " + name);
        for (IFileSystemComponent component : components) {
            component.showDetails();
        }
    }
}
