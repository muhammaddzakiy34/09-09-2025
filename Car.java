public class Car {
    // property class
    int numdoors;
    boolean isElectric;
    
    //Constructor defaullt
    public Car(){
        numdoors = 6;
        isElectric = true;
    }
    //Constructor parameter
    public Car(int numdoors, boolean isElectric){
        this.numdoors = numdoors;
        this.isElectric = isElectric;
    }

    //setter
    //method
    public void println() {
        System.out.println("Number of doors: " + numdoors);
        System.out.println("Is Electric: " + isElectric);
        
    }
}
