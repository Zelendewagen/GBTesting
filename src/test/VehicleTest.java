import Auto.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

/*
    Написать следующие тесты:
    - проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    - проверка того, объект Car создается с 4-мя колесами
    - проверка того, объект Motorcycle создается с 2-мя колесами
    - проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    - проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    - проверить, что в режиме парковки машина останавливается (speed = 0)
    - проверить, что в режиме парковки мотоцикл останавливается (speed = 0)
*/

class VehicleTest {
    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        car = new Car("yotota", "test", 2020);
        motorcycle = new Motorcycle("mayaha", "test", 2020);

    }

    @Test
    void implement() {
        assertThat(car).isInstanceOf(Vehicle.class);
        assertInstanceOf(Vehicle.class, car);
    }

    @Test
    void carWheelsCount() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    void carTestDriveSpeed() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    void carParkingSpeed() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    void motorcycleWheelsCount() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    void motorcycleTestDriveSpeed() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    void motorcycleParkingSpeed() {
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }

}