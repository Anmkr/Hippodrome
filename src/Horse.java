public class Horse {
    public String name;
    public double speed;
    public double distance;

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }


    public void move(){
   int num = (int) Math.random();
   speed =num*speed;
   distance+=speed;
   }
    public void print(){
        int dis= (int) distance;
        String point =".";
        for (int i = 0; i <dis ; i++) {
            point =point+".";

        }
        System.out.println(point+name);

    }
    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}


