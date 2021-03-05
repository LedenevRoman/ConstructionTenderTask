package ConstructionTender;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker();
        worker1.setSalary(2000);
        worker1.addProfession(Professions.ARCHITECT);
        worker1.addProfession(Professions.CARPENTER);
        worker1.addProfession(Professions.CIVIL_ENGINEER);
        Worker worker2 = new Worker();
        worker2.setSalary(1200);
        worker2.addProfession(Professions.CONCRETE_WORKER);
        worker2.addProfession(Professions.CRANE_OPERATOR);
        Worker worker3 = new Worker();
        worker3.setSalary(1000);
        worker3.addProfession(Professions.ECONOMIST);
        worker3.addProfession(Professions.ARCHITECT);
        Worker worker4 = new Worker();
        worker4.setSalary(900);
        worker4.addProfession(Professions.PAINTER_PLASTERER);

        Brigade brigade1 = new Brigade();
        brigade1.addWorker(worker1);
        brigade1.addWorker(worker2);
        brigade1.addWorker(worker3);
        brigade1.addWorker(worker4);

        Worker worker5 = new Worker();
        worker5.setSalary(2500);
        worker5.addProfession(Professions.ARCHITECT);
        worker5.addProfession(Professions.CARPENTER);
        Worker worker6 = new Worker();
        worker6.setSalary(1200);
        worker6.addProfession(Professions.CONCRETE_WORKER);
        worker6.addProfession(Professions.CRANE_OPERATOR);
        Worker worker7 = new Worker();
        worker7.setSalary(900);
        worker7.addProfession(Professions.PAINTER_PLASTERER);

        Brigade brigade2 = new Brigade();
        brigade2.addWorker(worker5);
        brigade2.addWorker(worker6);
        brigade2.addWorker(worker7);

        Worker worker8 = new Worker();
        worker8.setSalary(2500);
        worker8.addProfession(Professions.ARCHITECT);
        worker8.addProfession(Professions.CARPENTER);
        Worker worker9 = new Worker();
        worker9.setSalary(1200);
        worker9.addProfession(Professions.CONCRETE_WORKER);
        worker9.addProfession(Professions.CRANE_OPERATOR);

        Brigade brigade3 = new Brigade();
        brigade3.addWorker(worker8);
        brigade3.addWorker(worker9);

        ArrayList<Brigade> brigadeList = new ArrayList<>();
        brigadeList.add(brigade1);
        brigadeList.add(brigade2);
        brigadeList.add(brigade3);

        Tender tender = new Tender();
        tender.addProfession(Professions.CARPENTER);
        tender.addProfession(Professions.ARCHITECT);
        tender.addProfession(Professions.PAINTER_PLASTERER);

        System.out.println(tender.getSuitableBrigade(brigadeList));
    }
}
