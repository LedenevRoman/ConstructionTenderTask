package ConstructionTender;

import java.util.ArrayList;
import java.util.Objects;

public class Brigade {
    private final ArrayList<Worker> workerArrayList = new ArrayList<>();
    private int brigadeSalary;

    public Brigade(){
    }

    public ArrayList<Worker> getWorkerArrayList() {
        return workerArrayList;
    }

    public int getBrigadeSalary() {
        return brigadeSalary;
    }

    public void addWorker(Worker worker) {
        this.workerArrayList.add(worker);
        this.brigadeSalary += worker.getSalary();
    }

    public ArrayList<Professions> getBrigadeProfessions() {
        ArrayList<Professions> brigadeProfessions = new ArrayList<>();
        for (Worker worker : workerArrayList) {
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
                workerArrayList.equals(brigade.workerArrayList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workerArrayList, brigadeSalary);
    }

    @Override
    public String toString() {
        return "Brigade{" +
                "workerArrayList=" + workerArrayList +
                ", brigadeSalary=" + brigadeSalary +
                '}';
    }
}
