package ConstructionTender;

import java.util.ArrayList;

public class Contract {
    private ArrayList<Professions> contractProfessions = new ArrayList<>();
    private int NumberOfWorkers;

    public ArrayList<Professions> getContactProfessions() {
        return contractProfessions;
    }

    public void setContactProfessions(ArrayList<Professions> contactProfessions) {
        this.contractProfessions = contactProfessions;
    }

    public int getNumberOfWorkers() {
        return NumberOfWorkers;
    }

    public void setNumberOfWorkers(int numberOfWorkers) {
        NumberOfWorkers = numberOfWorkers;
    }

    public void addProfession(Professions profession) {
        contractProfessions.add(profession);
    }

    public boolean ifConformsToContract(Brigade brigade) {
        int numberOfWorkersInBrigade = brigade.getNumberOfWorkers();
        ArrayList<Professions> tempBrigadeProfessionsArrayList = new ArrayList<>();
        tempBrigadeProfessionsArrayList.addAll(brigade.getBrigadeProfessionsArrayList());
        for (int i = 0; i < contractProfessions.size(); i++) {
            if (tempBrigadeProfessionsArrayList.contains(contractProfessions.get(i))) {
                tempBrigadeProfessionsArrayList.remove(contractProfessions.get(i));
            } else {
                return false;
            }
        }
        return numberOfWorkersInBrigade >= this.NumberOfWorkers;
    }
}
