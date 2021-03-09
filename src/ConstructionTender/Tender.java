package ConstructionTender;

import java.util.ArrayList;

public class Tender {
    private ArrayList<Professions> requiredProfessions = new ArrayList<>();

    public ArrayList<Professions> getRequiredProfessions() {
        return requiredProfessions;
    }

    public void setRequiredProfessions(ArrayList<Professions> contactProfessions) {
        this.requiredProfessions = contactProfessions;
    }

    public void addProfession(Professions profession) {
        requiredProfessions.add(profession);
    }

    private boolean ifConformsToContract(Brigade brigade) {
        ArrayList<Professions> tempBrigadeProfessionsArrayList = new ArrayList<>(brigade.getBrigadeProfessions());
        for (Professions contractProfession : requiredProfessions) {
            if (tempBrigadeProfessionsArrayList.contains(contractProfession)) {
                tempBrigadeProfessionsArrayList.remove(contractProfession);
            } else {
                return false;
            }
        }
        return true;
    }

    public Brigade getSuitableBrigade(ArrayList<Brigade> allBrigades) {
        ArrayList<Brigade> applicants = new ArrayList<>();
        for (Brigade brigade: allBrigades) {
            if (ifConformsToContract(brigade)) {
                applicants.add(brigade);
            }
        }
        if (applicants.isEmpty()) {
            throw new TenderFailedException("Brigade not found");
        } else {
            BrigadeSalaryComporator brigadeSalaryComparator = new BrigadeSalaryComporator();
            applicants.sort(brigadeSalaryComparator);
            return applicants.get(0);
        }
    }
}
