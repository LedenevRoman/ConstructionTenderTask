package ConstructionTender;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BrigadeListTest {
    private BrigadeList brigadeList;
    private Brigade brigadeEmpty;
    private Brigade brigadeWithFiveWorkers;
    private Brigade brigadeWithSixWorkers;
    private Brigade brigadeWithFourWorkersAndDoubleEngineers;
    private Brigade brigadeWithAllWorkers;
    private static final Worker CIVILENGINEER3200 = new Worker(3200, Professions.CIVIL_ENGINEER);
    private static final Worker ARCHITECT3100 = new Worker(3100, Professions.ARCHITECT);
    private static final Worker SURVEYOR3000 = new Worker(3000, Professions.SURVEYOR);
    private static final Worker ECONOMIST2900 = new Worker(2900, Professions.ECONOMIST);
    private static final Worker TECHNOLOGIST2300 = new Worker(2300, Professions.TECHNOLOGIST);
    private static final Worker CRANEOPERATOR2200 = new Worker(2200, Professions.CRANE_OPERATOR);
    private static final Worker MASTEROFCONSTUCTION2100 =
            new Worker(2100, Professions.MASTER_OF_CONSTRUCTION_AND_INSTALLATION_WORKS);
    private static final Worker CARPENTER2000 = new Worker(2000, Professions.CARPENTER);
    private static final Worker ROOFER1900 = new Worker(1900, Professions.ROOFER);
    private static final Worker CONCRETEWORKER1800 = new Worker(1800, Professions.CONCRETE_WORKER);
    private static final Worker PAINTERPLASTERER1700 = new Worker(1700, Professions.PAINTER_PLASTERER);


    @Before
    public void setUp() {
        brigadeEmpty = new Brigade();
        brigadeWithFiveWorkers = new Brigade();
        brigadeWithFiveWorkers.addWorker(CIVILENGINEER3200);
        brigadeWithFiveWorkers.addWorker(ARCHITECT3100);
        brigadeWithFiveWorkers.addWorker(SURVEYOR3000);
        brigadeWithFiveWorkers.addWorker(ECONOMIST2900);
        brigadeWithFiveWorkers.addWorker(TECHNOLOGIST2300);
        brigadeWithSixWorkers = new Brigade();
        brigadeWithSixWorkers.addWorker(CRANEOPERATOR2200);
        brigadeWithSixWorkers.addWorker(MASTEROFCONSTUCTION2100);
        brigadeWithSixWorkers.addWorker(CARPENTER2000);
        brigadeWithSixWorkers.addWorker(ROOFER1900);
        brigadeWithSixWorkers.addWorker(CONCRETEWORKER1800);
        brigadeWithSixWorkers.addWorker(PAINTERPLASTERER1700);
        brigadeWithFourWorkersAndDoubleEngineers = new Brigade();
        brigadeWithFourWorkersAndDoubleEngineers.addWorker(CIVILENGINEER3200);
        brigadeWithFourWorkersAndDoubleEngineers.addWorker(CIVILENGINEER3200);
        brigadeWithFourWorkersAndDoubleEngineers.addWorker(ARCHITECT3100);
        brigadeWithFourWorkersAndDoubleEngineers.addWorker(ECONOMIST2900);
        brigadeWithAllWorkers = new Brigade();
        brigadeWithAllWorkers.addWorker(CIVILENGINEER3200);
        brigadeWithAllWorkers.addWorker(ARCHITECT3100);
        brigadeWithAllWorkers.addWorker(SURVEYOR3000);
        brigadeWithAllWorkers.addWorker(ECONOMIST2900);
        brigadeWithAllWorkers.addWorker(TECHNOLOGIST2300);
        brigadeWithAllWorkers.addWorker(CRANEOPERATOR2200);
        brigadeWithAllWorkers.addWorker(MASTEROFCONSTUCTION2100);
        brigadeWithAllWorkers.addWorker(CARPENTER2000);
        brigadeWithAllWorkers.addWorker(ROOFER1900);
        brigadeWithAllWorkers.addWorker(CONCRETEWORKER1800);
        brigadeWithAllWorkers.addWorker(PAINTERPLASTERER1700);
        brigadeList = new BrigadeList();
        brigadeList.addBrigade(brigadeEmpty);
        brigadeList.addBrigade(brigadeWithAllWorkers);
        brigadeList.addBrigade(brigadeWithFiveWorkers);
        brigadeList.addBrigade(brigadeWithFourWorkersAndDoubleEngineers);
        brigadeList.addBrigade(brigadeWithSixWorkers);
    }

    @After
    public void tearDown() {
        brigadeEmpty = null;
        brigadeWithFiveWorkers = null;
        brigadeWithSixWorkers = null;
        brigadeWithAllWorkers = null;
        brigadeWithFourWorkersAndDoubleEngineers = null;
        brigadeList = null;
    }

    @Test
    public void chooseTenderWinnerArchitectAndEngineerTwoWorkers() {
        Contract contract = new Contract();
        contract.addProfession(Professions.ARCHITECT);
        contract.addProfession(Professions.CIVIL_ENGINEER);
        contract.setNumberOfWorkers(2);
        Brigade actual = brigadeList.chooseTenderWinner(contract);
        Brigade expected = brigadeWithFourWorkersAndDoubleEngineers;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void chooseTenderWinnerEngineerAndEngineerTwoWorkers() {
        Contract contract = new Contract();
        contract.addProfession(Professions.CIVIL_ENGINEER);
        contract.addProfession(Professions.CIVIL_ENGINEER);
        contract.setNumberOfWorkers(2);
        Brigade actual = brigadeList.chooseTenderWinner(contract);
        Brigade expected = brigadeWithFourWorkersAndDoubleEngineers;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void chooseTenderWinnerEconomistAndTechnologistTwoWorkers() {
        Contract contract = new Contract();
        contract.addProfession(Professions.ECONOMIST);
        contract.addProfession(Professions.TECHNOLOGIST);
        contract.setNumberOfWorkers(2);
        Brigade actual = brigadeList.chooseTenderWinner(contract);
        Brigade expected = brigadeWithFiveWorkers;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void chooseTenderWinnerEmpty() {
        Contract contract = new Contract();
        Brigade actual = brigadeList.chooseTenderWinner(contract);
        Brigade expected = brigadeEmpty;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void chooseTenderWinnerTechnologistAndCraneOperatorTwoWorkers() {
        Contract contract = new Contract();
        contract.addProfession(Professions.TECHNOLOGIST);
        contract.addProfession(Professions.CRANE_OPERATOR);
        contract.setNumberOfWorkers(2);
        Brigade actual = brigadeList.chooseTenderWinner(contract);
        Brigade expected = brigadeWithAllWorkers;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void chooseTenderWinnerRooferAndSixWorkers() {
        Contract contract = new Contract();
        contract.addProfession(Professions.ROOFER);
        contract.setNumberOfWorkers(6);
        Brigade actual = brigadeList.chooseTenderWinner(contract);
        Brigade expected = brigadeWithSixWorkers;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void chooseTenderWinnerSevenWorkers() {
        Contract contract = new Contract();
        contract.setNumberOfWorkers(7);
        Brigade actual = brigadeList.chooseTenderWinner(contract);
        Brigade expected = brigadeWithAllWorkers;
        Assert.assertEquals(expected, actual);
    }
}