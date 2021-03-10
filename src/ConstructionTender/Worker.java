package ConstructionTender;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class Worker {
    private int salary;
    private Set<Professions> workerProfessionsSet = new HashSet<>();

    public Worker() {
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Set<Professions> getProfessions() {
        return workerProfessionsSet;
    }

    public void setWorkerProfessionsSet(HashSet<Professions> workerProfessionsSet) {
        this.workerProfessionsSet = workerProfessionsSet;
    }

    public void addProfession(Professions profession) {
        workerProfessionsSet.add(profession);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return salary == worker.salary &&
                Objects.equals(workerProfessionsSet, worker.workerProfessionsSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary, workerProfessionsSet);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "salary=" + salary +
                ", workerProfessionsArrayList=" + workerProfessionsSet +
                '}';
    }
}
