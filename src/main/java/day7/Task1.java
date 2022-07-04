package day7;




public class Task1 {
    public static void main(String[] args) {
        Airplane1 airplane = new Airplane1("Airbus A320",10,30, 77000 );
        Airplane1 airplane1 = new Airplane1("Airbus A320",10,30, 77000 );
        Airplane1.compareAirplanes(airplane, airplane1);

    }

}

class Airplane1 {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane1(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }
    void info(){
        System.out.println("Изготовитель: " + manufacturer + "\n"
                +"год выпуска: " + year + "\n"
                + "Длина: " + length + "\n"
                + "Вес: " + weight + "\n"
                +"Количество топлива в баке: " + fuel);
    }
    public int getFuel() {
        return fuel;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
    public void fillUp (int n) {
        fuel += n;
    }

    public int getLength() {
        return length;
    }

    public static void compareAirplanes( Airplane1 airplane, Airplane1 airplane1 ){
        if (airplane.getLength()>airplane1.getLength()){
        System.out.println("Длина первого самолета больше длины второго" );}
        else if(airplane.getLength()< airplane1.getLength()){
            System.out.println("Длина первого самолета меньше длины второго");}
            else {
            System.out.println("Длины самолетов равны");
        }}
    }
