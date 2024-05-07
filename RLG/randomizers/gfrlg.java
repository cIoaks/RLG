package randomizers;

import java.util.Random;

public class gfrlg {

    public static final String ANSI_RED = "\u001B[38;5;52m";
    public static final String ANSI_BRIGHTRED = "\u001B[38;5;9m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_BLUE = "\u001B[38;5;39m";
    public static final String ANSI_LIGHTBLUE = "\u001B[38;5;75m";
    public static final String ANSI_CHUGBLUE = "\u001B[38;5;50m";
    public static final String ANSI_YELLOW = "\u001B[38;5;11m";
    public static final String ANSI_GREEN = "\u001B[38;5;36m";
    public static final String ANSI_NEONGREEN = "\u001B[38;5;46m";
    public static final String ANSI_MINT = "\u001B[38;5;121m";
    public static final String ANSI_PINK = "\u001b[38;5;213m";
    public static final String ANSI_PURPLE = "\u001b[38;5;57m";
    public static final String ANSI_BLACK = "\u001b[38;5;16m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void Run()
    {
        Random rand = new Random();
    
        //Shotguns
        String AUTO = "Frenzy Auto Shotgun";
        String PUMP = "Hammer Pump Shotgun";
        String GATEKEEPER = "Gatekeeper Shotgun";
    
        //ARs
        String WARFORGED = "Warforged Assault Rifle";
        String NEMESIS = "Nemesis Assault Rifle";
        String TACTICAL = "Tacticle Assault Rifle";
        String E11 = ANSI_BLACK + "E-11 Blaster Rifle" + ANSI_RESET;

        //Bow
        String BOW = ANSI_BLACK + "Wookiee Bowcaster" + ANSI_RESET;
    
        //SMGs
        String HARBINGER = "Harbinger SMG";
        String DRUM = "Drum Gun";
        String BURST = "Thunder Burst SMG";
    
        //Waterbending
        String WATER = ANSI_LIGHTBLUE + "Waterbending" + ANSI_RESET;
    
        //Pistols
        String RANGER = "Ranger Pistol";
        String DEAG = "Hand Cannon";
    
        //Snipers
        String BOLT = "Reaper Sniper Rifle";
        String DMR = "Huntress DMR";

        //Misc DMG
        String CHAIN = ANSI_GREEN + "Chain of Hades" + ANSI_RESET;
        String SABER = ANSI_BLACK + "Darth " + ANSI_BRIGHTRED + "Vader's " + ANSI_RESET + "Lightsaber" + ANSI_RESET;
        String THUNDER = ANSI_LIGHTBLUE + "Thunderbolt of Zeus" + ANSI_RESET;
    
        //Movement
        String SHOCK = ANSI_PURPLE + "Shockwaves" + ANSI_RESET;
        String WINGS = ANSI_BLACK + "Wings " + ANSI_RESET + "of" + ANSI_YELLOW + " Icarus" + ANSI_RESET;

        //Utility Items
        String BUNKER = ANSI_BLACK + "Port" + ANSI_RESET + "-a-" + ANSI_MINT + "Bunker" + ANSI_RESET;
        String BUBBLE = "Shield " + ANSI_LIGHTBLUE + "Bubble" + ANSI_RESET;
    
        //Heals
        String SHIELDS = "Shield " + ANSI_LIGHTBLUE + "Potion" + ANSI_RESET;
        String MEDKIT = "Med" + ANSI_BRIGHTRED +"kit" + ANSI_RESET;
        String FIZZ = ANSI_LIGHTBLUE + "Flow" + ANSI_PINK + "berry " + ANSI_PURPLE + "Fizz" + ANSI_RESET;
        String SPLASH = ANSI_CHUGBLUE + "Chug Splash" + ANSI_RESET;
    
        //SLOT 1 - SHOTGUNs
        //SLOT 2 - ARs, SMGs, Pistol, Waterbending
        //SLOT 3 - SMGs, Snipers, Pistols, Waterbending
        //SLOT 4 MOVEMENT - Shockwaves, Wings
        //SLOT 5 HEAL - Shield Potion, Medkit, Flowberry Fizz
            
            int slot1 = rand.nextInt(3) + 1;
            if (slot1 == 1) {
                System.out.println("Slot 1 (Shotgun): " + AUTO);
            }
            else if (slot1 == 2) {
                System.out.println("Slot 1 (Shotgun): " + PUMP);
            }
            else if (slot1 == 3) {
                System.out.println("Slot 1 (Shotgun): " + GATEKEEPER);
            }

            int slot2 = rand.nextInt(10) + 1;
            if (slot2 == 1) {
                System.out.println("Slot 2 (AR): " + WARFORGED);

                int slot3 = rand.nextInt(12) + 1; {
                    if (slot3 == 1) {
                        System.out.println("Slot 3 (SMG): " + HARBINGER);
                    }
                    else if (slot3 == 2) {
                        System.out.println("Slot 3 (SMG): " + DRUM);
                    }
                    else if (slot3 == 3) {
                        System.out.println("Slot 3 (SMG): " + BURST);
                    }
                    else if (slot3 == 4) {
                        System.out.println("Slot 3 (Pistol): " + RANGER);
                    }
                    else if (slot3 == 5) {
                        System.out.println("Slot 3 (Pistol): " + DEAG);
                    }
                    else if (slot3 == 6) {
                        System.out.println("Slot 3 (Bending): " + WATER);
                    }
                    else if (slot3 == 7) {
                        System.out.println("Slot 3 (Sniper): " + BOLT);
                    }
                    else if (slot3 == 8) {
                        System.out.println("Slot 3 (Sniper): " + DMR);
                    }
                    else if (slot3 == 9) {
                        System.out.println("Slot 3 (Melee): " + CHAIN);
                    }
                    else if (slot3 == 10) {
                        System.out.println("Slot 3 (Melee): " + SABER);
                    }
                    else if (slot3 == 11) {
                        System.out.println("Slot 3 (Misc DMG): " + THUNDER);
                    }
                    else if (slot3 == 12) {
                        System.out.println("Slot 3 (Bow): " + BOW);
                    }
                }
            }
            else if (slot2 == 2) {
                System.out.println("Slot 2 (AR): " + NEMESIS);

                int slot3 = rand.nextInt(12) + 1; {
                    if (slot3 == 1) {
                        System.out.println("Slot 3 (SMG): " + HARBINGER);
                    }
                    else if (slot3 == 2) {
                        System.out.println("Slot 3 (SMG): " + DRUM);
                    }
                    else if (slot3 == 3) {
                        System.out.println("Slot 3 (SMG): " + BURST);
                    }
                    else if (slot3 == 4) {
                        System.out.println("Slot 3 (Pistol): " + RANGER);
                    }
                    else if (slot3 == 5) {
                        System.out.println("Slot 3 (Pistol): " + DEAG);
                    }
                    else if (slot3 == 6) {
                        System.out.println("Slot 3 (Bending): " + WATER);
                    }
                    else if (slot3 == 7) {
                        System.out.println("Slot 3 (Sniper): " + BOLT);
                    }
                    else if (slot3 == 8) {
                        System.out.println("Slot 3 (Sniper): " + DMR);
                    }
                    else if (slot3 == 9) {
                        System.out.println("Slot 3 (Melee): " + CHAIN);
                    }
                    else if (slot3 == 10) {
                        System.out.println("Slot 3 (Melee): " + SABER);
                    }
                    else if (slot3 == 11) {
                        System.out.println("Slot 3 (Misc DMG): " + THUNDER);
                    }
                    else if (slot3 == 12) {
                        System.out.println("Slot 3 (Bow): " + BOW);
                    }
                }
            }
            else if (slot2 == 3) {
                System.out.println("Slot 2 (AR): " + TACTICAL);

                int slot3 = rand.nextInt(12) + 1;
                if (slot3 == 1) {
                    System.out.println("Slot 3 (SMG): " + HARBINGER);
                }
                else if (slot3 == 2) {
                    System.out.println("Slot 3 (SMG): " + DRUM);
                }
                else if (slot3 == 3) {
                    System.out.println("Slot 3 (SMG): " + BURST);
                }
                else if (slot3 == 4) {
                    System.out.println("Slot 3 (Pistol): " + RANGER);
                }
                else if (slot3 == 5) {
                    System.out.println("Slot 3 (Pistol): " + DEAG);
                }
                else if (slot3 == 6) {
                    System.out.println("Slot 3 (Bending): " + WATER);
                }
                else if (slot3 == 7) {
                    System.out.println("Slot 3 (Sniper): " + BOLT);
                }
                else if (slot3 == 8) {
                    System.out.println("Slot 3 (Sniper): " + DMR);
                }
                else if (slot3 == 9) {
                    System.out.println("Slot 3 (Melee): " + CHAIN);
                }
                else if (slot3 == 10) {
                    System.out.println("Slot 3 (Melee): " + SABER);
                }
                else if (slot3 == 11) {
                    System.out.println("Slot 3 (Misc DMG): " + THUNDER);
                }
                else if (slot3 == 12) {
                    System.out.println("Slot 3 (Bow): " + BOW);


                }
            }
            else if (slot2 == 4) {
                System.out.println("Slot 2 (SMG): " + HARBINGER);

                int slot3 = rand.nextInt(11) + 1;
                if (slot3 == 1) {
                    System.out.println("Slot 3 (Pistol): " + RANGER);
                }
                else if (slot3 == 2) {
                    System.out.println("Slot 3 (Pistol): " + DEAG);
                }
                else if (slot3 == 3) {
                    System.out.println("Slot 3 (Bending): " + WATER);
                }
                else if (slot3 == 4) {
                    System.out.println("Slot 3 (Sniper): " + BOLT);
                }
                else if (slot3 == 5) {
                    System.out.println("Slot 3 (Sniper): " + DMR);
                }
                else if (slot3 == 6) {
                    System.out.println("Slot 3 (SMG): " + DRUM);
                }
                else if (slot3 == 7) {
                    System.out.println("Slot 3 (SMG): " + BURST);
                }
                else if (slot3 == 8) {
                    System.out.println("Slot 3 (Melee): " + CHAIN);
                }
                else if (slot3 == 9) {
                    System.out.println("Slot 3 (Melee): " + SABER);
                }
                else if (slot3 == 10) {
                    System.out.println("Slot 3 (Misc DMG): " + THUNDER);
                }
                else if (slot3 == 11) {
                    System.out.println("Slot 3 (Bow): " + BOW);
                }
            }
            else if (slot2 == 5) {
                System.out.println("Slot 2 (SMG): " + DRUM);

                int slot3 = rand.nextInt(11) + 1;
                if (slot3 == 1) {
                    System.out.println("Slot 3 (Pistol): " + RANGER);
                }
                else if (slot3 == 2) {
                    System.out.println("Slot 3 (Pistol): " + DEAG);
                }
                else if (slot3 == 3) {
                    System.out.println("Slot 3 (Bending): " + WATER);
                }
                else if (slot3 == 4) {
                    System.out.println("Slot 3 (Sniper): " + BOLT);
                }
                else if (slot3 == 5) {
                    System.out.println("Slot 3 (Sniper): " + DMR);
                }
                else if (slot3 == 6) {
                    System.out.println("Slot 3 (SMG): " + BURST);
                }
                else if (slot3 == 7) {
                    System.out.println("Slot 3 (SMG): " + HARBINGER);
                }
                else if (slot3 == 8) {
                    System.out.println("Slot 3 (Melee): " + CHAIN);
                }
                else if (slot3 == 9) {
                    System.out.println("Slot 3 (Melee): " + SABER);
                }
                else if (slot3 == 10) {
                    System.out.println("Slot 3 (Misc DMG): " + THUNDER);
                }
                else if (slot3 == 11) {
                    System.out.println("Slot 3 (Bow): " + BOW);
                }
            }
            else if (slot2 == 6) {
                System.out.println("Slot 2 (SMG): " + BURST);

                int slot3 = rand.nextInt(11) + 1;
                if (slot3 == 1) {
                    System.out.println("Slot 3 (Pistol): " + RANGER);
                }
                else if (slot3 == 2) {
                    System.out.println("Slot 3 (Pistol): " + DEAG);
                }
                else if (slot3 == 3) {
                    System.out.println("Slot 3 (Bending): " + WATER);
                }
                else if (slot3 == 4) {
                    System.out.println("Slot 3 (Sniper): " + BOLT);
                }
                else if (slot3 == 5) {
                    System.out.println("Slot 3 (Sniper): " + DMR);
                }
                else if (slot3 == 6) {
                    System.out.println("Slot 3 (SMG): " + DRUM);
                }
                else if (slot3 == 7) {
                    System.out.println("Slot 3 (SMG): " + HARBINGER);
                }
                else if (slot3 == 8) {
                    System.out.println("Slot 3 (Melee): " + CHAIN);
                }
                else if (slot3 == 9) {
                    System.out.println("Slot 3 (Melee): " + SABER);
                }
                else if (slot3 == 10) {
                    System.out.println("Slot 3 (Misc DMG): " + THUNDER);
                }
                else if (slot3 == 11) {
                    System.out.println("Slot 3 (Bow): " + BOW);
                }
            }
            else if (slot2 == 7) {
                System.out.println("Slot 2 (Pistol): " + RANGER);

                int slot3 = rand.nextInt(11) + 1;
                if (slot3 == 1) {
                    System.out.println("Slot 3 (SMG): " + HARBINGER);
                }
                else if (slot3 == 2) {
                    System.out.println("Slot 3 (SMG): " + DRUM);
                }
                else if (slot3 == 3) {
                    System.out.println("Slot 3 (SMG): " + BURST);
                }
                else if (slot3 == 4) {
                    System.out.println("Slot 3 (Pistol): " + DEAG);
                }
                else if (slot3 == 5) {
                    System.out.println("Slot 3 (Bending): " + WATER);
                }
                else if (slot3 == 6) {
                    System.out.println("Slot 3 (Sniper): " + BOLT);
                }
                else if (slot3 == 7) {
                    System.out.println("Slot 3 (Sniper): " + DMR);
                }
                else if (slot3 == 8) {
                    System.out.println("Slot 3 (Melee): " + CHAIN);
                }
                else if (slot3 == 9) {
                    System.out.println("Slot 3 (Melee): " + SABER);
                }
                else if (slot3 == 10) {
                    System.out.println("Slot 3 (Misc DMG): " + THUNDER);
                }
                else if (slot3 == 11) {
                    System.out.println("Slot 3 (Bow): " + BOW);
                }
            }
            else if (slot2 == 8) {
                System.out.println("Slot 2 (Bending): " + WATER);

                int slot3 = rand.nextInt(11) + 1;
                if (slot3 == 1) {
                    System.out.println("Slot 3 (SMG): " + HARBINGER);
                }
                else if (slot3 == 2) {
                    System.out.println("Slot 3 (SMG): " + DRUM);
                }
                else if (slot3 == 3) {
                    System.out.println("Slot 3 (SMG): " + BURST);
                }
                else if (slot3 == 4) {
                    System.out.println("Slot 3 (Pistol): " + RANGER);
                }
                else if (slot3 == 5) {
                    System.out.println("Slot 3 (Pistol): " + DEAG);
                }
                else if (slot3 == 6) {
                    System.out.println("Slot 3 (Sniper): " + BOLT);
                }
                else if (slot3 == 7) {
                    System.out.println("Slot 3 (Sniper): " + DMR);
                }
                else if (slot3 == 8) {
                    System.out.println("Slot 3 (Melee): " + CHAIN);
                }
                else if (slot3 == 9) {
                    System.out.println("Slot 3 (Melee): " + SABER);
                }
                else if (slot3 == 10) {
                    System.out.println("Slot 3 (Misc DMG): " + THUNDER);
                }
                else if (slot3 == 11) {
                    System.out.println("Slot 3 (Bow): " + BOW);
                }
            }
            else if (slot2 == 9) {
                System.out.println("Slot 2 (AR): " +  E11);

                int slot3 = rand.nextInt(12) + 1; {
                    if (slot3 == 1) {
                        System.out.println("Slot 3 (SMG): " + HARBINGER);
                    }
                    else if (slot3 == 2) {
                        System.out.println("Slot 3 (SMG): " + DRUM);
                    }
                    else if (slot3 == 3) {
                        System.out.println("Slot 3 (SMG): " + BURST);
                    }
                    else if (slot3 == 4) {
                        System.out.println("Slot 3 (Pistol): " + RANGER);
                    }
                    else if (slot3 == 5) {
                        System.out.println("Slot 3 (Pistol): " + DEAG);
                    }
                    else if (slot3 == 6) {
                        System.out.println("Slot 3 (Bending): " + WATER);
                    }
                    else if (slot3 == 7) {
                        System.out.println("Slot 3 (Sniper): " + BOLT);
                    }
                    else if (slot3 == 8) {
                        System.out.println("Slot 3 (Sniper): " + DMR);
                    }
                    else if (slot3 == 9) {
                        System.out.println("Slot 3 (Melee): " + CHAIN);
                    }
                    else if (slot3 == 10) {
                        System.out.println("Slot 3 (Melee): " + SABER);
                    }
                    else if (slot3 == 11) {
                        System.out.println("Slot 3 (Misc DMG): " + THUNDER);
                    }
                    else if (slot3 == 12) {
                        System.out.println("Slot 3 (Bow): " + BOW);
                    }
                }
            }
            else if (slot2 == 10) {
                System.out.println("Slot 2 (Bow): " + BOW);

                int slot3 = rand.nextInt(12) + 1; {
                    if (slot3 == 1) {
                        System.out.println("Slot 3 (SMG): " + HARBINGER);
                    }
                    else if (slot3 == 2) {
                        System.out.println("Slot 3 (SMG): " + DRUM);
                    }
                    else if (slot3 == 3) {
                        System.out.println("Slot 3 (SMG): " + BURST);
                    }
                    else if (slot3 == 4) {
                        System.out.println("Slot 3 (Pistol): " + RANGER);
                    }
                    else if (slot3 == 5) {
                        System.out.println("Slot 3 (Pistol): " + DEAG);
                    }
                    else if (slot3 == 6) {
                        System.out.println("Slot 3 (Bending): " + WATER);
                    }
                    else if (slot3 == 7) {
                        System.out.println("Slot 3 (Sniper): " + BOLT);
                    }
                    else if (slot3 == 8) {
                        System.out.println("Slot 3 (Sniper): " + DMR);
                    }
                    else if (slot3 == 9) {
                        System.out.println("Slot 3 (Melee): " + CHAIN);
                    }
                    else if (slot3 == 10) {
                        System.out.println("Slot 3 (Melee): " + SABER);
                    }
                    else if (slot3 == 11) {
                        System.out.println("Slot 3 (Misc DMG): " + THUNDER);
                    }
                    else if (slot3 == 12) {
                        System.out.println("Slot 3 (Bow): " + BOW);
                    }
                }
            }

            int slot4 = rand.nextInt(4) + 1;
            if (slot4 == 1) {
                System.out.println("Slot 4 (Movement): " + SHOCK);
            }
            else if (slot4 == 2) {
                System.out.println("Slot 4 (Movement): " + WINGS);
            }
            else if (slot4 == 3) {
                System.out.println("Slot 4 (Utility): " + BUNKER);
            }
            else if (slot4 == 4) {
                System.out.println("Slot 4 (Utility): " + BUBBLE);
            }

            int slot5 = rand.nextInt(4) + 1;
            if (slot5 == 1) {
                System.out.println("Slot 5 (Heal): " + SHIELDS);
            }
            else if (slot5 == 2) {
                System.out.println("Slot 5 (Heal): " + MEDKIT);
            }
            else if (slot5 == 3) {
                System.out.println("Slot 5 (Heal): " + FIZZ);
            }
            else if (slot5 == 4) {
                System.out.println ("Slot 5 (Heal): " + SPLASH);
            }
    }
}
