import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components;

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

    public void addcomponent(FileSystemComponent component) {
        components.add(component);
    }

    public void removecomponent(FileSystemComponent component) {
        components.remove(component);
    }

    public FileSystemComponent getcomponent(int index) {
        return components.get(index);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory " + name);
        for (FileSystemComponent component : components) {
            component.showDetails();
        }
    }
}
