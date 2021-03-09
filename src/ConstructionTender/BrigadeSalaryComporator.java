package ConstructionTender;

import java.util.Comparator;

public class BrigadeSalaryComporator implements Comparator<Brigade> {

    @Override
    public int compare(Brigade o1, Brigade o2) {
        return o1.getBrigadeSalary() - o2.getBrigadeSalary();
    }
}
