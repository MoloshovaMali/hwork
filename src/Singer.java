public class Singer extends Person{
    private String bandName;
    public Singer(String name, String designation,String bandName) {
        super(name, designation);
        this.bandName=bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    public void singing(){
        System.out.println("Singing");
    }
    public void playGuitar(){
        System.out.println("play the guitar ");
    }
}
