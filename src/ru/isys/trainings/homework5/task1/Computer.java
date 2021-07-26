package ru.isys.trainings.homework5.task1;

public class Computer {
    private ComputerInfo computerInfo;

    public Computer(String os, String cpu, String ram) {
        this.computerInfo = new ComputerInfo(os, cpu, ram);
    }

    public ComputerInfo getComputerInfo() {
        return computerInfo;
    }

    public class ComputerInfo {
        private String os;
        private String cpu;
        private String ram;

        private ComputerInfo(String os, String cpu, String ram) {
            this.os = os;
            this.cpu = cpu;
            this.ram = ram;
        }

        public String getOs() {
            return os;
        }

        public String getCpu() {
            return cpu;
        }

        public String getRam() {
            return ram;
        }

    }
}
