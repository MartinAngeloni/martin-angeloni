package point1;

/**
 * Created by martin on 30/6/2018.
 */
public class File implements IRecentFile {

    private String name;

    public File(String name){
        this.name = name;
    }

    public boolean open() {
        if(!RecentFile.listRecentFile().contains(this)
                && RecentFile.listRecentFile().size() < 5) {
            RecentFile.listRecentFile().add(this);
        }
        if(RecentFile.listRecentFile().contains(this)
                && RecentFile.listRecentFile().size() < 5){
            RecentFile.listRecentFile().remove(this);
            RecentFile.listRecentFile().add(this);
        }
        if(RecentFile.listRecentFile().size() == 5 && !RecentFile.listRecentFile().contains(this)){
            RecentFile.listRecentFile().remove(0);
            RecentFile.listRecentFile().add(this);
        }
        return true;
    }

    public boolean close() {
        return true;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof File)) return false;

        File file = (File) o;

        return name != null ? name.equals(file.name) : file.name == null;
    }

    @Override
    public String toString() {
        return "point1.File{" +
                "name='" + name + '\'' +
                '}';
    }
}
