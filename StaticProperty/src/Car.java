public class Car {
    private String name;
    private String engine;
    public static int NumberOfCar;
    public Car(String name,String engine){
        this.name = name;
        this.engine = engine;
        NumberOfCar++;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setEngine(String newEngine){
        this.engine = newEngine;
    }
    public String getName(){
        return this.name;
    }
    public String getEngine(){
        return this.engine;
    }
}
