package ru.isys.trainings.homework5;

public class Computer {
    private ComputerInfo computerInfo;

    public Computer(ComputerInfo computerInfo) {
        this.computerInfo = computerInfo;
    }

    public ComputerInfo getComputerInfo() {
        return computerInfo;
    }

    private class ComputerInfo {
        private String os;
        private String cpu;
        private String ram;

        public ComputerInfo(String os, String cpu, String ram) {
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
