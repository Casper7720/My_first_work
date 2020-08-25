public class Addition {
    private  String name;
    private  int cost;

    Addition(String name, int cost){
        this.name = name;
        this.cost = cost;
    }

    public  int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName() + " стоимость = " + getCost();
    }
}
