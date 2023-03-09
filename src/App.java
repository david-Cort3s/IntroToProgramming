
public class App {
    public static void main(String[] args) throws Exception {
        
        conditional();
        loopWhile();
        loopDoWhile();
        loopFor();
        walkArray();
        switchCase();

        auto myAuto = new auto("ford");
        System.out.println(myAuto.getBrand());
        System.out.println(myAuto.getPower());
        myAuto.setPowerOn();
        System.out.println(myAuto.getPower());

    }

    public static void conditional() {
        String station = "Spring";

        if (station == "Spring") {
            System.out.println("It's spring");
        } else if (station == "summer") {
            System.out.println("It's summer");
        } else {
            System.out.println("It's season");
        }
    }

    public static void loopWhile() {
        int counter = 10;

        while (counter >= 0) {
            System.out.println("Counter: " + counter);
            counter = counter - 1;
            /*counter--;
            counter -= 2;*/
        }
    }

    public static void loopDoWhile() {
        int counter = 20;

        do {
            System.out.println("Counter: " + counter);
            counter = counter - 1;
        } while (counter >= 10);
    }

    public static void loopFor() {
        for (int counter=1000; counter<=1050; counter++) {
            System.out.println(counter);
            //counter++ is executed at the end of the rest of the code
        }
    }

    public static void walkArray() {
        int array[] = { 10, 20, 30, 40, 50};

        for (int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void switchCase() {
        String currentSeason = "Spring";

        switch (currentSeason) {
            case "Spring":
                System.out.println("It's spring");
                break;
            case "Winter":
                System.out.println("It's winter");
                break;
            default:
                System.out.println("It's default");
        }
    }
}

class auto {
    private String brand;
    private boolean power;

    public auto(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setPowerOn() {
        this.power = !this.power;
    }

    public boolean getPower() {
        return power;
    }
}
