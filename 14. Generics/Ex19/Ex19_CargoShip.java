/**
 * Following the form of Store.java, build a model of a containerized cargo ship.
 */

import net.mindview.util.*;

import java.util.ArrayList;
import java.util.Random;

class Container {
    private final int id;
    private String destination;
    private double weight;

    public Container(int id, String destination, double weight) {
        this.id = id;
        this.destination = destination;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Container{" +
                "id=" + id +
                ", destination='" + destination + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static Generator<Container> generator =
            new Generator<Container>() {
                private Random rand = new Random(47);

                @Override
                public Container next() {
                    return new Container(rand.nextInt(1000), "Destination#" + rand.nextInt(100),
                            Math.round(rand.nextDouble() * 100.0) + 500.12);
                }
            };
}

class ContainersPack extends ArrayList<Container> {
    public ContainersPack(int packSize) {
        Generators.fill(this, Container.generator, packSize);
    }
}

class Shipment extends ArrayList<ContainersPack> {
    public Shipment(int shipmentSize, int packSize) {
        for (int i = 0; i < shipmentSize; i++) {
            add(new ContainersPack(packSize));
        }
    }
}


public class Ex19_CargoShip extends ArrayList<Shipment> {
    public Ex19_CargoShip(int shipmentCount, int shipmentSize, int packSize) {
        for (int i = 0; i < shipmentCount; i++) {
            add(new Shipment(shipmentSize, packSize));
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for(Shipment sp : this)
            for(ContainersPack cp : sp)
                for(Container c : cp) {
                    result.append(c);
                    result.append("\n");
                }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Ex19_CargoShip(2, 3, 3));
    }
}
