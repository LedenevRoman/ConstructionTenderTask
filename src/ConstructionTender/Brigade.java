package ConstructionTender;

import java.util.ArrayList;
import java.util.Objects;

public class Brigade {
    private ArrayList<Worker> workerArrayList = new ArrayList<>();
    private ArrayList<Professions> brigadeProfessionsArrayList = new ArrayList<>();
    private int brigadeSalary;

    public Brigade(){

    }

    public Brigade(ArrayList<Worker> workerArrayList) {
        this.workerArrayList = workerArrayList;
        for (Worker w: workerArrayList) {
            this.brigadeProfessionsArrayList.addAll(w.getProfessionsArrayList());
        }
        for (Worker w: workerArrayList) {
            this.brigadeSalary += w.getSalary();
        }
    }

    public ArrayList<Worker> getWorkerArrayList() {
        return workerArrayList;
    }

    public ArrayList<Professions> getBrigadeProfessionsArrayList() {
        return brigadeProfessionsArrayList;
    }

    public int getBrigadeSalary() {
        return brigadeSalary;
    }

    public void setBrigadeSalary(int brigadeSalary) {
        this.brigadeSalary = brigadeSalary;
    }

    public int getNumberOfWorkers() {
        return workerArrayList.size();
    }

    public void addWorker(Worker worker) {
        this.workerArrayList.add(worker);
        this.brigadeProfessionsArrayList.addAll(worker.getProfessionsArrayList());
        this.brigadeSalary += worker.getSalary();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brigade brigade = (Brigade) o;
        return brigadeSalary == brigade.brigadeSalary &&
                workerArrayList.equals(brigade.workerArrayList) &&
                brigadeProfessionsArrayList.equals(brigade.brigadeProfessionsArrayList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workerArrayList, brigadeProfessionsArrayList, brigadeSalary);
    }

    @Override
    public String toString() {
        return "Brigade{" +
                "workerArrayList=" + workerArrayList +
                ", brigadeProfessionsArrayList=" + brigadeProfessionsArrayList +
                ", brigadeSalary=" + brigadeSalary +
                '}';
    }
}
