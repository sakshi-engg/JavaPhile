package Oops;

public class Car{

    //properties or state
    private String doors;
    private String engine;
    private String driver;
   
    private int speed;
   
    //constructor
   
    public Car() {
     doors="opend";
     engine="off";
     driver="Absent";
   
     speed =0;
   
    }
   
    //overloading constructor here to initilized the custom properties
   
    public Car(String doors, String engine, String driver, int speed) {
   
    super();
   
    this.doors = doors;
   
    this.engine = engine;
   
    this.driver = driver;
   
    this.speed = speed;
   
    }
   
    //getter and setter
   
    public void setSpeed(int speed) {
   
     this.speed= speed;
   
    }
   
     public int getSpeed() {
   
     return speed;
   
    }
   
    public String getDoors() {
   
    return doors;
   
    }
   
    public void setDoors(String doors) {
   
    this.doors = doors;
   
    }
   
    public String getEngine() {
   
    return engine;
   
    }
   
    public void setEngine(String engine) {
   
    this.engine = engine;
   
    }
   
    public String getDriver() {
   
    return driver;
   
    }
   
    public void setDriver(String driver) {
    this.driver = driver;
    }
   
    public String run() {
   
    if(doors.equals("closed") && engine.equals("on") && driver.equals("seated") && speed>0 ) {
    return "running";
} else {
      return "stop";
    }
   
   }

   public static void main(String[] args) {
    Car obj = new Car();
    System.out.print(obj.run());
    obj.setDoors("closed");
    obj.setEngine("on");
    obj.setDriver("seated");
    obj.setSpeed(22);
    System.out.print(obj.run());
     }
   }
   
   
