package ConstructionTender;

import java.util.ArrayList;
import java.util.Objects;

public class Worker {
    private int salary;
    private ArrayList<Professions> workerProfessionsArrayList = new ArrayList<>();

    public Worker() {

    }

    public Worker(int salary) {
        this.salary = salary;
    }

    public Worker(int salary, Professions profession1) {
        this.salary = salary;
        this.workerProfessionsArrayList.add(profession1);
    }

    public Worker(int salary, Professions profession1, Professions profession2) {
        this.salary = salary;
        this.workerProfessionsArrayList.add(profession1);
        this.workerProfessionsArrayList.add(profession2);
    }

    public Worker(int salary, Professions profession1, Professions profession2, Professions profession3) {
        this.salary = salary;
        this.workerProfessionsArrayList.add(profession1);
        this.workerProfessionsArrayList.add(profession2);
        this.workerProfessionsArrayList.add(profession3);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public ArrayList<Professions> getProfessionsArrayList() {
        return workerProfessionsArrayList;
    }

    public void setWorkerProfessionsArrayList(ArrayList<Professions> workerProfessionsArrayList) {
        this.workerProfessionsArrayList = workerProfessionsArrayList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return salary == worker.salary &&
                Objects.equals(workerProfessionsArrayList, worker.workerProfessionsArrayList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary, workerProfessionsArrayList);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "salary=" + salary +
                ", workerProfessionsArrayList=" + workerProfessionsArrayList +
                '}';
    }
}
