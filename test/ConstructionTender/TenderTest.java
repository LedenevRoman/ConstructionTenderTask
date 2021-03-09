package ConstructionTender;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TenderTest {
    private Tender tender;
    private static final ArrayList<Brigade> ALL_BRIGADES = new ArrayList<>();
    private static final Brigade BRIGADE_EMPTY = new Brigade();
    private static final Brigade BRIGADE_WITH_ENGINEER_ARCHITECT_SURVEYOR_ECONOMIST_TECHNOLOGIST_SALARY_14500
            = new Brigade();
    private static final Brigade
            BRIGADE_WITH_CRANEOPERATOR_MASTEROFCONSTRUCTION_CARPENTER_ROOFER_CONCRETEWORKER_PAINTER_SALARY_11700
            = new Brigade();
    private static final Brigade BRIGADE_WITH_ENGINEER_ENGINEER_ARCHITECT_ECONOMIST_SALARY_12400 = new Brigade();
    private static final Brigade BRIGADE_WITH_ALL_WORKERS_SALARY_26200 = new Brigade();
    private static final Worker CIVILENGINEER3200 = new Worker();
    private static final Worker ARCHITECT3100 = new Worker();
    private static final Worker SURVEYOR3000 = new Worker();
    private static final Worker ECONOMIST2900 = new Worker();
    private static final Worker TECHNOLOGIST2300 = new Worker();
    private static final Worker CRANEOPERATOR2200 = new Worker();
    private static final Worker MASTEROFCONSTUCTION2100 = new Worker();
    private static final Worker CARPENTER2000 = new Worker();
    private static final Worker ROOFER1900 = new Worker();
    private static final Worker CONCRETEWORKER1800 = new Worker();
    private static final Worker PAINTERPLASTERER1700 = new Worker();

    static {
        CIVILENGINEER3200.setSalary(3200);
        CIVILENGINEER3200.addProfession(Professions.CIVIL_ENGINEER);

        ARCHITECT3100.setSalary(3100);
        ARCHITECT3100.addProfession(Professions.ARCHITECT);

        SURVEYOR3000.setSalary(3000);
        SURVEYOR3000.addProfession(Professions.SURVEYOR);

        ECONOMIST2900.setSalary(2900);
        ECONOMIST2900.addProfession(Professions.ECONOMIST);

        TECHNOLOGIST2300.setSalary(2300);
        TECHNOLOGIST2300.addProfession(Professions.TECHNOLOGIST);

        CRANEOPERATOR2200.setSalary(2200);
        CRANEOPERATOR2200.addProfession(Professions.CRANE_OPERATOR);

        MASTEROFCONSTUCTION2100.setSalary(2100);
        MASTEROFCONSTUCTION2100.addProfession(Professions.MASTER_OF_CONSTRUCTION_AND_INSTALLATION_WORKS);

        CARPENTER2000.setSalary(2000);
        CARPENTER2000.addProfession(Professions.CARPENTER);

        ROOFER1900.setSalary(1900);
        ROOFER1900.addProfession(Professions.ROOFER);

        CONCRETEWORKER1800.setSalary(1800);
        CONCRETEWORKER1800.addProfession(Professions.CONCRETE_WORKER);

        PAINTERPLASTERER1700.setSalary(1700);
        PAINTERPLASTERER1700.addProfession(Professions.PAINTER_PLASTERER);

        BRIGADE_WITH_ENGINEER_ARCHITECT_SURVEYOR_ECONOMIST_TECHNOLOGIST_SALARY_14500.addWorker(CIVILENGINEER3200);
        BRIGADE_WITH_ENGINEER_ARCHITECT_SURVEYOR_ECONOMIST_TECHNOLOGIST_SALARY_14500.addWorker(ARCHITECT3100);
        BRIGADE_WITH_ENGINEER_ARCHITECT_SURVEYOR_ECONOMIST_TECHNOLOGIST_SALARY_14500.addWorker(SURVEYOR3000);
        BRIGADE_WITH_ENGINEER_ARCHITECT_SURVEYOR_ECONOMIST_TECHNOLOGIST_SALARY_14500.addWorker(ECONOMIST2900);
        BRIGADE_WITH_ENGINEER_ARCHITECT_SURVEYOR_ECONOMIST_TECHNOLOGIST_SALARY_14500.addWorker(TECHNOLOGIST2300);

        BRIGADE_WITH_CRANEOPERATOR_MASTEROFCONSTRUCTION_CARPENTER_ROOFER_CONCRETEWORKER_PAINTER_SALARY_11700
                .addWorker(CRANEOPERATOR2200);
        BRIGADE_WITH_CRANEOPERATOR_MASTEROFCONSTRUCTION_CARPENTER_ROOFER_CONCRETEWORKER_PAINTER_SALARY_11700
                .addWorker(MASTEROFCONSTUCTION2100);
        BRIGADE_WITH_CRANEOPERATOR_MASTEROFCONSTRUCTION_CARPENTER_ROOFER_CONCRETEWORKER_PAINTER_SALARY_11700
                .addWorker(CARPENTER2000);
        BRIGADE_WITH_CRANEOPERATOR_MASTEROFCONSTRUCTION_CARPENTER_ROOFER_CONCRETEWORKER_PAINTER_SALARY_11700
                .addWorker(ROOFER1900);
        BRIGADE_WITH_CRANEOPERATOR_MASTEROFCONSTRUCTION_CARPENTER_ROOFER_CONCRETEWORKER_PAINTER_SALARY_11700
                .addWorker(CONCRETEWORKER1800);
        BRIGADE_WITH_CRANEOPERATOR_MASTEROFCONSTRUCTION_CARPENTER_ROOFER_CONCRETEWORKER_PAINTER_SALARY_11700
                .addWorker(PAINTERPLASTERER1700);

        BRIGADE_WITH_ENGINEER_ENGINEER_ARCHITECT_ECONOMIST_SALARY_12400.addWorker(CIVILENGINEER3200);
        BRIGADE_WITH_ENGINEER_ENGINEER_ARCHITECT_ECONOMIST_SALARY_12400.addWorker(CIVILENGINEER3200);
        BRIGADE_WITH_ENGINEER_ENGINEER_ARCHITECT_ECONOMIST_SALARY_12400.addWorker(ARCHITECT3100);
        BRIGADE_WITH_ENGINEER_ENGINEER_ARCHITECT_ECONOMIST_SALARY_12400.addWorker(ECONOMIST2900);

        BRIGADE_WITH_ALL_WORKERS_SALARY_26200.addWorker(CIVILENGINEER3200);
        BRIGADE_WITH_ALL_WORKERS_SALARY_26200.addWorker(ARCHITECT3100);
        BRIGADE_WITH_ALL_WORKERS_SALARY_26200.addWorker(SURVEYOR3000);
        BRIGADE_WITH_ALL_WORKERS_SALARY_26200.addWorker(ECONOMIST2900);
        BRIGADE_WITH_ALL_WORKERS_SALARY_26200.addWorker(TECHNOLOGIST2300);
        BRIGADE_WITH_ALL_WORKERS_SALARY_26200.addWorker(CRANEOPERATOR2200);
        BRIGADE_WITH_ALL_WORKERS_SALARY_26200.addWorker(MASTEROFCONSTUCTION2100);
        BRIGADE_WITH_ALL_WORKERS_SALARY_26200.addWorker(CARPENTER2000);
        BRIGADE_WITH_ALL_WORKERS_SALARY_26200.addWorker(ROOFER1900);
        BRIGADE_WITH_ALL_WORKERS_SALARY_26200.addWorker(CONCRETEWORKER1800);
        BRIGADE_WITH_ALL_WORKERS_SALARY_26200.addWorker(PAINTERPLASTERER1700);

        ALL_BRIGADES.add(BRIGADE_EMPTY);
        ALL_BRIGADES.add(BRIGADE_WITH_ALL_WORKERS_SALARY_26200);
        ALL_BRIGADES.add(BRIGADE_WITH_ENGINEER_ARCHITECT_SURVEYOR_ECONOMIST_TECHNOLOGIST_SALARY_14500);
        ALL_BRIGADES.add(BRIGADE_WITH_ENGINEER_ENGINEER_ARCHITECT_ECONOMIST_SALARY_12400);
        ALL_BRIGADES.add
                (BRIGADE_WITH_CRANEOPERATOR_MASTEROFCONSTRUCTION_CARPENTER_ROOFER_CONCRETEWORKER_PAINTER_SALARY_11700);
    }

    @Before
    public void setUp() {
        tender = new Tender();

    }

    @After
    public void tearDown() {
        tender = null;

    }

    @Test
    public void getSuitableBrigadeArchitectAndEngineer() {
        tender.addProfession(Professions.ARCHITECT);
        tender.addProfession(Professions.CIVIL_ENGINEER);
        Brigade actual = tender.getSuitableBrigade(ALL_BRIGADES);
        Assert.assertEquals(BRIGADE_WITH_ENGINEER_ENGINEER_ARCHITECT_ECONOMIST_SALARY_12400, actual);
    }

    @Test
    public void getSuitableBrigadeEngineerAndEngineer() {
        tender.addProfession(Professions.CIVIL_ENGINEER);
        tender.addProfession(Professions.CIVIL_ENGINEER);
        Brigade actual = tender.getSuitableBrigade(ALL_BRIGADES);
        Assert.assertEquals(BRIGADE_WITH_ENGINEER_ENGINEER_ARCHITECT_ECONOMIST_SALARY_12400, actual);
    }

    @Test
    public void getSuitableBrigadeEconomistTechnologistAndSurveyor() {
        tender.addProfession(Professions.ECONOMIST);
        tender.addProfession(Professions.TECHNOLOGIST);
        Brigade actual = tender.getSuitableBrigade(ALL_BRIGADES);
        Assert.assertEquals(BRIGADE_WITH_ENGINEER_ARCHITECT_SURVEYOR_ECONOMIST_TECHNOLOGIST_SALARY_14500, actual);
    }

    @Test
    public void getSuitableBrigadeEmpty() {
        Brigade actual = tender.getSuitableBrigade(ALL_BRIGADES);
        Assert.assertEquals(BRIGADE_EMPTY, actual);
    }

    @Test
    public void getSuitableBrigadeTechnologistAndCraneOperator() {
        tender.addProfession(Professions.TECHNOLOGIST);
        tender.addProfession(Professions.CRANE_OPERATOR);
        Brigade actual = tender.getSuitableBrigade(ALL_BRIGADES);
        Assert.assertEquals(BRIGADE_WITH_ALL_WORKERS_SALARY_26200, actual);
    }

    @Test
    public void getSuitableBrigadeRooferPainter() {
        tender.addProfession(Professions.ROOFER);
        tender.addProfession(Professions.PAINTER_PLASTERER);
        Brigade actual = tender.getSuitableBrigade(ALL_BRIGADES);
        Assert.assertEquals
                (BRIGADE_WITH_CRANEOPERATOR_MASTEROFCONSTRUCTION_CARPENTER_ROOFER_CONCRETEWORKER_PAINTER_SALARY_11700,
                        actual);
    }

    @Test (expected = TenderFailedException.class)
    public void getSuitableBrigadeEngineerEngineerPainterWorkers() {
        tender.addProfession(Professions.CIVIL_ENGINEER);
        tender.addProfession(Professions.CIVIL_ENGINEER);
        tender.addProfession(Professions.PAINTER_PLASTERER);
        tender.getSuitableBrigade(ALL_BRIGADES);
    }
}