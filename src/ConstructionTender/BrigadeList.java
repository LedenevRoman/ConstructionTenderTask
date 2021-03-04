package ConstructionTender;

import java.util.ArrayList;

public class BrigadeList {
    private ArrayList<Brigade> brigadeList = new ArrayList<>();

    public ArrayList<Brigade> getBrigadeList() {
        return brigadeList;
    }

    public void setBrigadeList(ArrayList<Brigade> brigadeList) {
        this.brigadeList = brigadeList;
    }

    public void addBrigade(Brigade brigade) {
        this.brigadeList.add(brigade);
    }

    public Brigade chooseTenderWinner(Contract contract) {
        ArrayList<Brigade> applicants = new ArrayList<>();
        for (Brigade brigade: brigadeList) {
            if (contract.ifConformsToContract(brigade)) {
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
