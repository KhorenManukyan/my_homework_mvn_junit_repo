package youtube.videos.uroki.java.patterns.pattern11.filter;

import java.util.ArrayList;
import java.util.List;

interface CarFilter {
    List<CarF> filter(List<CarF> cars);
}

public class FilterLesson {
    public static void main(String[] args) {
        CarF car = new CarF(150, "green", 4);
        CarF car2 = new CarF(200, "red", 2);
        CarF car3 = new CarF(250, "black", 4);
        List<CarF> cars = new ArrayList<>();
        cars.add(car);
        cars.add(car2);
        cars.add(car3);
/*        cars = new SpeedFilter().filter(cars);
        cars = new DoorFilter().filter(cars);
 */
        OrFilter andFilter = new OrFilter(new SpeedFilter(), new DoorFilter());
        cars = andFilter.filter(cars);
        for (CarF carr : cars) {
            System.out.println(carr.getMaxSpeed());
        }


    }
}

class SpeedFilter implements CarFilter {

    @Override
    public List<CarF> filter(List<CarF> cars) {
        List<CarF> list = new ArrayList<>();
        for (CarF car : cars) {
            if (car.getMaxSpeed() > 180) {
                list.add(car);
            }
        }
        return list;
    }
}

class AndFilter implements CarFilter {
    CarFilter filterOne;
    CarFilter filterTwo;

    public AndFilter(CarFilter filterOne, CarFilter filterTwo) {
        this.filterOne = filterOne;
        this.filterTwo = filterTwo;
    }


    @Override
    public List<CarF> filter(List<CarF> cars) {
        List<CarF> list = filterOne.filter(cars);
        return filterTwo.filter(list);
    }
}

class OrFilter implements CarFilter {
    CarFilter filterOne;
    CarFilter filterTwo;

    public OrFilter(CarFilter filterOne, CarFilter filterTwo) {
        this.filterOne = filterOne;
        this.filterTwo = filterTwo;
    }


    @Override
    public List<CarF> filter(List<CarF> cars) {
        List<CarF> list = filterOne.filter(cars);
        List<CarF> list1 = filterTwo.filter(cars);

        for (CarF carF : list1) {
            if (!list.contains(carF)){
                list.add(carF);
            }
        }
        return list;
    }
}

class DoorFilter implements CarFilter {

    @Override
    public List<CarF> filter(List<CarF> cars) {
        List<CarF> list = new ArrayList<>();
        for (CarF car : cars) {
            if (car.getDoors() > 2) {
                list.add(car);
            }
        }
        return list;
    }
}

class CarF {
    private int maxSpeed;
    private String color;
    private int doors;

    public CarF(int maxSpeed, String color, int doors) {
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.doors = doors;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}