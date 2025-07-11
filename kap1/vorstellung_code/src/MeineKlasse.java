public class MeineKlasse {
    public static void main(String[] args) {

        Auto Audi = new Auto("A6", "Audi", 2020);
    }
}

class Auto {
    private String model;
    private String marke;
    private int baujahr;

    public Auto(String model, String marke, int baujahr) {
        this.model = model;
        this.marke = marke;
        this.baujahr = baujahr;
    }

    public void fahren(){
        System.out.println("Auto fährt");
    }
    public boolean bremsen(){
        System.out.println("Auto bremsen");
        return true;
    }
}