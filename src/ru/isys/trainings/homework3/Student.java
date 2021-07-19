package ru.isys.trainings.homework3;

public class Student {

    private Integer id;
    private String name;
    private Double scholarship;


    public Student(Integer id, String name, Double scholarship) {
        this.id = id;
        this.name = name;
        this.scholarship = scholarship;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScholarship() {
        return scholarship;
    }

    public void setScholarship(Double scholarship) {
        this.scholarship = scholarship;
    }

    public void printStudentsArray() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (!id.equals(student.id)) return false;
        if (!name.equals(student.name)) return false;
        return scholarship != null ? scholarship.equals(student.scholarship) : student.scholarship == null;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + (scholarship != null ? scholarship.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student {" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", scholarship = " + scholarship +
                '}';
    }
}
