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

    public boolean ifConformsToContract(Brigade brigade) {
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
            for (int i = 0; i < applicants.size() - 1; i++) {
                if (applicants.get(i).getBrigadeSalary() <= applicants.get(i + 1).getBrigadeSalary()) {
                    Brigade temp = applicants.get(i);
                    applicants.set(i, applicants.get(i + 1));
                    applicants.set(i + 1, temp);
                }
            }
            return applicants.get(applicants.size() - 1);
        }
    }
}