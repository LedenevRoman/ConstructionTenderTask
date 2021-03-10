package ConstructionTender;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Brigade {
    private final List<Worker> workerList = new ArrayList<>();
    private int brigadeSalary;

    public Brigade(){
    }

    public List<Worker> getWorkerList() {
        return workerList;
    }

    public int getBrigadeSalary() {
        return brigadeSalary;
    }

    public void addWorker(Worker worker) {
        this.workerList.add(worker);
        this.brigadeSalary += worker.getSalary();
    }

    public ArrayList<Professions> getBrigadeProfessions() {
        ArrayList<Professions> brigadeProfessions = new ArrayList<>();
        for (Worker worker : workerList) {
            brigadeProfessions.addAll(worker.getProfessions());
        }
        return brigadeProfessions;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brigade brigade = (Brigade) o;
        return brigadeSalary == brigade.brigadeSalary &&
                workerList.equals(brigade.workerList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workerList, brigadeSalary);
    }

    @Override
    public String toString() {
        return "Brigade{" +
                "workerArrayList=" + workerList +
                ", brigadeSalary=" + brigadeSalary +
                '}';
    }
}
