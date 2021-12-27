package javer.codewars.sixkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DevOpsLegacyRoastingDiscoInfernoBurnBabyBurnTest {

    @Test
    public void roastLegacy_BasicTest1() {
        String workloads = "";
        String expectedResult = "These guys are already DevOps and in the Cloud and the business is happy!";
        assertEquals(expectedResult, DevOpsLegacyRoastingDiscoInfernoBurnBabyBurn.roastLegacy(workloads));
    }

    @Test
    public void roastLegacy_BasicTest2() {
        String workloads = "cloudstatelesspython";
        String expectedResult = "These guys are already DevOps and in the Cloud and the business is happy!";
        assertEquals(expectedResult, DevOpsLegacyRoastingDiscoInfernoBurnBabyBurn.roastLegacy(workloads));
    }

    @Test
    public void roastLegacy_BasicTest3() {
        String workloads = "COBOL";
        String expectedResult = "Burn baby burn disco inferno 1000 points earned in this roasting and 0 complaints resolved!";
        assertEquals(expectedResult, DevOpsLegacyRoastingDiscoInfernoBurnBabyBurn.roastLegacy(workloads));
    }

    @Test
    public void roastLegacy_BasicTest4() {
        String workloads = "slow!expensive!";
        String expectedResult = "Burn baby burn disco inferno 0 points earned in this roasting and 2 complaints resolved!";
        assertEquals(expectedResult, DevOpsLegacyRoastingDiscoInfernoBurnBabyBurn.roastLegacy(workloads));
    }

    @Test
    public void roastLegacy_BasicTest5() {
        String workloads = "EXPENSIVE!AUTOMATEDRUBYCLOUDMONGOPAASTAPEACTIVE-ACTIVEPYTHONNOSQL";
        String expectedResult = "Burn baby burn disco inferno 50 points earned in this roasting and 1 complaints resolved!";
        assertEquals(expectedResult, DevOpsLegacyRoastingDiscoInfernoBurnBabyBurn.roastLegacy(workloads));
    }

    @Test
    public void roastLegacy_BasicTest6() {
        String workloads = "expensive!NONOBJECTexpensive!NONOBJECThostage!JAVASCRIPTexpensive!DEVOPS";
        String expectedResult = "Burn baby burn disco inferno 1000 points earned in this roasting and 4 complaints resolved!";
        assertEquals(expectedResult, DevOpsLegacyRoastingDiscoInfernoBurnBabyBurn.roastLegacy(workloads));
    }

    @Test
    public void roastLegacy_BasicTest7() {
        String workloads = "manual!COBOLnonobjectmonolithicfaxmodemthickclienttapefloppyoldschoolITslow!";
        String expectedResult = "Burn baby burn disco inferno 2400 points earned in this roasting and 2 complaints resolved!";
        assertEquals(expectedResult, DevOpsLegacyRoastingDiscoInfernoBurnBabyBurn.roastLegacy(workloads));
    }

    @Test
    public void roastLegacy_BasicTest8() {
        String workloads = "tapedistributedactive-activeoldschoolITmonolithicjavamodemnotfunctioning!thickclientCOBOLIAASexpensive!statelessrubyPAASautomatedimmutableagilemongonosqlhostage!nonobjectfaxpythoncontainerizedsecurity!floppyslow!manual!multi-tenantSAASserverlessDevOpscloudJavascriptCOBOL";
        String expectedResult = "Burn baby burn disco inferno 3400 points earned in this roasting and 5 complaints resolved!";
        assertEquals(expectedResult, DevOpsLegacyRoastingDiscoInfernoBurnBabyBurn.roastLegacy(workloads));
    }
}
