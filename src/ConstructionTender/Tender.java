package ConstructionTender;

import java.util.ArrayList;
import java.util.List;

public class Tender {
    private List<Professions> requiredProfessions = new ArrayList<>();

    public List<Professions> getRequiredProfessions() {
        return requiredProfessions;
    }

    public void setRequiredProfessions(ArrayList<Professions> requiredProfessions) {
        this.requiredProfessions = requiredProfessions;
    }

    public void addProfession(Professions profession) {
        requiredProfessions.add(profession);
    }

    private boolean ifConformsToContract(Brigade brigade) {
        List<Professions> tempBrigadeProfessionsList = new ArrayList<>(brigade.getBrigadeProfessions());
        for (Professions requiredProfession : requiredProfessions) {
            if (tempBrigadeProfessionsList.contains(requiredProfession)) {
                tempBrigadeProfessionsList.remove(requiredProfession);
            } else {
                return false;
            }
        }
        return true;
    }

    public Brigade getSuitableBrigade(List<Brigade> allBrigades) {
        List<Brigade> applicants = new ArrayList<>();
        for (Brigade brigade: allBrigades) {
            if (ifConformsToContract(brigade)) {
                applicants.add(brigade);
            }
        }
        if (applicants.isEmpty()) {
            throw new TenderFailedException("Brigade not found");
        } else {
            BrigadeSalaryComparator brigadeSalaryComparator = new BrigadeSalaryComparator();
            applicants.sort(brigadeSalaryComparator);
            return applicants.get(0);
        }
    }
}
