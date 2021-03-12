public class Hotel {
    public String name;
    public String location;
    public String ownerName;

    Hotel() {

    }

    public Hotel(String name, String location, String ownerName) {
        this.name = name;
        this.location = location;
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
