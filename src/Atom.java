public class Atom
{
    public String name;
    public String chemSym;

    public int VSE;
    public int mass;
    public int protons;
    public int netCharge;

    enum CONFIG {ONE, TWO, THREE, POLYATOMIC};

    CONFIG config;

    private int ch1;
    private int ch2;
    private int ch3;

    public Atom(String name, String chemSym, int ch1, int VSE, int mass, int protons)
    {
        config = CONFIG.ONE;

        this.name = name;
        this.chemSym = chemSym;

        this.protons = protons;
        this.VSE = VSE;
        this.mass = mass;

        this.ch1 = ch1;
    }

    public Atom(String name, String chemSym, int ch1, int ch2, int VSE, int mass, int protons)
    {
        config = CONFIG.TWO;

        this.name = name;
        this.chemSym = chemSym;

        this.protons = protons;
        this.VSE = VSE;
        this.mass = mass;

        this.ch1 = ch1;
        this.ch2 = ch2;
    }

    public Atom(String name, String chemSym, int ch1, int ch2, int ch3, int VSE, int mass, int protons)
    {
        config = CONFIG.THREE;

        this.name = name;
        this.chemSym = chemSym;

        this.protons = protons;
        this.VSE = VSE;
        this.mass = mass;

        this.ch1 = ch1;
        this.ch2 = ch2;
        this.ch3 = ch3;
    }

    public Atom(String name, String chemSym, int netCharge)
    {
        config = CONFIG.POLYATOMIC;

        this.name = name;
        this.chemSym = chemSym;
        this.netCharge = netCharge;
    }

    public void print()
    {
        switch(config)
        {
            case ONE:
                System.out.println("\nName: " + name + "\nFormula: " + chemSym + "\nProtons: " + protons);
                System.out.println("Mass: " + mass + "\nNeutrons: " + (mass - protons) + "\nVSE: " + VSE);
                System.out.println("Charge: " + ch1);
                break;

            case TWO:
                System.out.println("\nName: " + name + "\nFormula: " + chemSym + "\nProtons: " + protons);
                System.out.println("Mass: " + mass + "\nNeutrons: " + (mass - protons) + "\nVSE: " + VSE);
                System.out.println("Charge 1: " + ch1 + "\nCharge2: " + ch2);
                break;

            case THREE:
                System.out.println("\nName: " + name + "\nFormula: " + chemSym + "\nProtons: " + protons);
                System.out.println("Mass: " + mass + "\nNeutrons: " + (mass - protons) + "\nVSE: " + VSE);
                System.out.println("Charge1: " + ch1 + "\nCharge2: " + ch2 + "\nCharge3 " + ch3);
                break;

            case POLYATOMIC:
                System.out.println("Name: " + name);
                System.out.println("Chemical name: " + chemSym);
                System.out.println("Net Charge: " + netCharge);
                break;

        }
    }
}