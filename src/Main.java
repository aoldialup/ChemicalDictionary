import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    static ArrayList<Atom> table = new ArrayList<Atom>();

    private static Scanner input = new Scanner(System.in);
    private static String userInput;
    private static String option;

    public static void main(String[] args)
    {
        init();
        input();
    }

    private static void init()
    {
        table.add(new Atom("Hydrogen", "H", 1, 1, 1, 1));
        table.add(new Atom("Lithium", "Li", 1, 1, 23, 11));
        table.add(new Atom("Sodium", "Na", 1, 1, 23, 11));
        table.add(new Atom("Potassium", "K", 1, 1, 39, 19));
        table.add(new Atom("Ribbidium", "Rb", 1, 1, 85, 37));
        table.add(new Atom("Cesium", "Cs", 1, 1, 133, 55));
        table.add(new Atom("Francium", "Fr", 1, 1, 223, 87));

        table.add(new Atom("Beryllium", "Be", 2, 2, 9, 4));
        table.add(new Atom("Magnesium", "Mg", 2, 2, 24, 12));
        table.add(new Atom("Calcium", "Ca", 2, 2, 40, 20));
        table.add(new Atom("Strontium", "Sr", 2, 2, 88, 38));
        table.add(new Atom("Barium", "Ba", 2, 2, 137, 56));
        table.add(new Atom("Radium", "Ra",  2,2, 226, 88));

        //trans metals
        table.add(new Atom("Arsenic", "As", 3,5,5,75, 33));
        table.add(new Atom("Copper", "Cu", 1,2,2,75,33));
        table.add(new Atom("Nickel", "Ni", 3,3,2,59,28));
        table.add(new Atom("Chromium", "Cr", 2,3,6,6,52,24));
        table.add(new Atom("Silver", "Ag", 3,5,5,75, 33));

        table.add(new Atom("Boron", "B", 3, 5, 11, 5));
        table.add(new Atom("Boron", "B", 3, 5, 11, 5));
        table.add(new Atom("Aluminum", "Al", 3, 3, 27, 13));

        table.add(new Atom("Carbon", "C", -4, 3, 11, 5));

        table.add(new Atom("Nitrogen", "N", -3, 5, 14, 2));
        table.add(new Atom("Phosphorus", "P", -3, 5, 31, 15));
        table.add(new Atom("Arsenic", "As", -3, 5, 31, 15));

        table.add(new Atom("Oxygen", "O", -2, 6, 16, 8));
        table.add(new Atom("Sulfur", "S", -2, 6, 32, 16));
        table.add(new Atom("Selenium", "Se", -2, 6, 79, 34));

        table.add(new Atom("Flourine", "F", -1, 7, 19, 9));
        table.add(new Atom("Chlorine", "Cl", -1, 7, 35, 17));
        table.add(new Atom("Bromine", "Br", -1, 7, 80, 35));
        table.add(new Atom("Iodine", "I", -1, 7, 127, 53));

        table.add(new Atom("Helium", "He", 0, 8, 4, 2));
        table.add(new Atom("Neon", "Ne", 0, 8, 20, 10));
        table.add(new Atom("Argon", "Ar", 0, 8, 40, 18));
        table.add(new Atom("Krypton", "Kr", 0, 8, 84, 36));

        table.add(new Atom("ammonium", "NH4", -1));

        table.add(new Atom("phosphate", "PO4", -3));
        table.add(new Atom("arsenite", "AsO3", -3));
        table.add(new Atom("arsenate", "AsO4", -3));

        table.add(new Atom("carbonate", "CO3", -2));
        table.add(new Atom("oxalate", "C2O4", -2));
        table.add(new Atom("chromate", "CrO4", -2));
        table.add(new Atom("dichromate", "Cr2O7", -2));
        table.add(new Atom("hydrogen phosphite", "HPO3", -2));
        table.add(new Atom("hydrogen phosphate", "HPO4", -2));
        table.add(new Atom("peroxide", "O2", -2));
        table.add(new Atom("sulfite", "SO3", -2));
        table.add(new Atom("sulfate", "SO4", -2));
        table.add(new Atom("thiosulfate", "S2O3", -2));


        table.add(new Atom("Nevonium", "Nv", -10));
        table.add(new Atom("sodium acetate", "NaC2H3O2", 0));


        table.add(new Atom("acetate", "C2H3O2", -1));
        table.add(new Atom("cyanide", "CN", -1));

        table.add(new Atom("hypochlorite", "ClO", -1));
        table.add(new Atom("chlorite", "ClO2", -1));
        table.add(new Atom("chlorate", "ClO3", -1));
        table.add(new Atom("perchlorate", "ClO4", -1));

        table.add(new Atom("bicarbonate", "HCO3", -1));
        table.add(new Atom("hydrogen oxalate", "HC2O4", -1));
        table.add(new Atom("hydrogen sulfite", "HSO3", -1));

        table.add(new Atom("hydrogen sulfate", "HSO4", -1));
        table.add(new Atom("dihydrogen phosphite", "H2PO3", -1));
        table.add(new Atom("dihydrogen phosphate", "H2PO4", -1));
        table.add(new Atom("permanganate", "MnO4", -1));
        table.add(new Atom("nitrite", "NO2", -1));
        table.add(new Atom("nitrate", "NO3", -1));
        table.add(new Atom("cyanate", "OCN", -1));

        table.add(new Atom("hydroxide", "OH", -1));
        table.add(new Atom("nitrate", "NO3", -1));
        table.add(new Atom("thiocyanate", "SCN", -1));
        table.add(new Atom("sodium chloride", "NaCl", 0));
        table.add(new Atom("methane", "C2H4", -2));
        table.add(new Atom("ammonia", "NH3", 1));
    }

    private static void input()
    {
        do
        {

            System.out.println("Name/Formula: ");
            userInput = input.nextLine();

            for(Atom atom: table) {

                if(atom.name.contains(userInput)||
                        atom.chemSym.contains(userInput))
                {
                    atom.print();
                    break;
                }
            }

            System.out.println("\n\nPress e to continue");
            option = input.nextLine();

        }

        while(option.equals("e"));
    }
}