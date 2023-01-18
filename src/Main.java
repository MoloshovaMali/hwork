public class Main {
    public static void main(String[] args) {

        Programmer programmer=new Programmer("Amir","Programmer","Peaksoft");
        System.out.println(programmer.getName()+","+programmer.getDesignation()+",CompanyName->"+programmer.getCompanyName());
        programmer.coding();
        programmer.eat();
        programmer.learn();
        programmer.walk();

        System.out.println("------------------------");

        Dancer dancer =new Dancer("Milana","Dancer","Fourty1");
        System.out.println( dancer.getName()+","+dancer.getDesignation()+",GroupName-"+dancer.getGroupName());
        dancer.dancing();
        dancer.eat();
        dancer.learn();
        dancer.walk();
        System.out.println("---------------------");

        Singer singer=new Singer("Ariana","Singer","Smile");
        System.out.println( singer.getName()+","+singer.getDesignation()+",BandName-"+singer.getBandName());
        singer.singing();
        singer.playGuitar();
        singer.eat();
        singer.learn();
        singer.walk();


    }
}