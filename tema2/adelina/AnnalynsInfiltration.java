package tema2.adelina;

public class AnnalynsInfiltration {
    public static void main(String[] args) {
        boolean knightIsAwake = false;
        boolean archeIsAwake = false;
        boolean prisonerIsAwake = true;
        boolean ananasDogPetIsPresent = true;

//        System.out.println(canFastAttack(knightIsAwake));
//        System.out.println(canSpy(knightIsAwake, archeIsAwake, prisonerIsAwake));
//        System.out.println(canSignalPrisoner(archeIsAwake, prisonerIsAwake));
        System.out.println(canFreePrisoner(knightIsAwake, archeIsAwake, prisonerIsAwake, ananasDogPetIsPresent));
    }

    public static boolean canFastAttack(boolean knightIsAwake) {
        if (!knightIsAwake) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archeIsAwake, boolean prisonerIsAwake) {
//        if (knightIsAwake == true || archeIsAwake == true || prisonerIsAwake == true) {
//            return true;
//        } else {
//            return false;
//        }
        if(knightIsAwake) {     //si false if(!knightIsAwakw)

        }
        if(!knightIsAwake && archeIsAwake && !prisonerIsAwake) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean canSignalPrisoner(boolean archeIsAwake, boolean prisonerIsAwake) {
        if (archeIsAwake == false && prisonerIsAwake == true) { // acelasi lucru   (Simplify) if (!archeIsAwake  && prisonerIsAwake)
            return true;
        } else {
            return false;
        }
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archeIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
//        if(petDogIsPresent == true && archeIsAwake == false) {
//            return true;
//        } else {
//            return false;
//        }
        if (!knightIsAwake && !archeIsAwake && prisonerIsAwake && petDogIsPresent) {
            return true;
        } else {
            return false;
        }
    }
}
