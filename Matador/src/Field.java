public class Field {

    private String label;
    private int id;
    protected int cost;
    private int income;

    public Field(int id, String label, int cost, int income) {
        this.label = label;
        this.id = id;
        this.cost = cost;
        this.income = income;
    }

    protected String getLabel() {
        return this.label;
    }

    public int getID() {
        return id;
    }

    public int getIncome() {
        return income;
    }

    public int getCost() {
        return cost;
    }

    public String onLand(Player p) {
        return p.getName() + " er landet på " + this;
    }

    @Override
    public String toString() {
        return id + ": " + label;
    }

    public String processChoice(String choice, Player p) {
        String s = "";
        if (choice.equalsIgnoreCase("J")) {
            s = onAccept(p);
        } else {
            s = onReject(p);
        }
        return s;
    }

    protected String onAccept(Player p) {
        return "";
    }

    protected String onReject(Player p) {
        return "";
    }
}