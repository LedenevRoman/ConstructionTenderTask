package ConstructionTender;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker(2000, Professions.ARCHITECT, Professions.CARPENTER,
                Professions.CIVIL_ENGINEER);
        Worker worker2 = new Worker(1200, Professions.CONCRETE_WORKER, Professions.CRANE_OPERATOR);
        Worker worker3 = new Worker(1000, Professions.ECONOMIST, Professions.ARCHITECT);
        Worker worker4 = new Worker(900, Professions.PAINTER_PLASTERER);

        Brigade brigade1 = new Brigade();
        brigade1.addWorker(worker1);
        brigade1.addWorker(worker2);
        brigade1.addWorker(worker3);
        brigade1.addWorker(worker4);

        Worker worker5 = new Worker(2500, Professions.ARCHITECT, Professions.CARPENTER);
        Worker worker6 = new Worker(1200, Professions.CONCRETE_WORKER, Professions.CRANE_OPERATOR);
        Worker worker7 = new Worker(900, Professions.PAINTER_PLASTERER);

        Brigade brigade2 = new Brigade();
        brigade2.addWorker(worker5);
        brigade2.addWorker(worker6);
        brigade2.addWorker(worker7);

        Worker worker8 = new Worker(2500, Professions.ARCHITECT, Professions.CARPENTER);
        Worker worker9 = new Worker(1200, Professions.CONCRETE_WORKER, Professions.CRANE_OPERATOR);

        Brigade brigade3 = new Brigade();
        brigade3.addWorker(worker8);
        brigade3.addWorker(worker9);

        BrigadeList brigadeList = new BrigadeList();
        brigadeList.addBrigade(brigade1);
        brigadeList.addBrigade(brigade2);
        brigadeList.addBrigade(brigade3);

        Contract contract = new Contract();
        contract.addProfession(Professions.CARPENTER);
        contract.addProfession(Professions.ARCHITECT);
        contract.addProfession(Professions.PAINTER_PLASTERER);
        contract.setNumberOfWorkers(3);

        System.out.println(brigadeList.chooseTenderWinner(contract));
    }
}
