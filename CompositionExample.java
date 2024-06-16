class CPU {
    String model;

    CPU(String model) {
        this.model = model;
    }

    void displayCPU() {
        System.out.println("CPU Model: " + model);
    }
}

class Computer {
    String brand;
    private CPU cpu; // Composition relationship

    Computer(String brand, String cpuModel) {
        this.brand = brand;
        this.cpu = new CPU(cpuModel); // CPU is created when Computer is created
    }

    void displayComputer() {
        System.out.println("Computer Brand: " + brand);
        cpu.displayCPU();
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        Computer computer = new Computer("Dell", "Intel i7"); // CPU is created as part of Computer
        computer.displayComputer();
    }
}



