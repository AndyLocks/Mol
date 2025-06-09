package com.locfox.mol_server.entity;

public enum Atoms {
    H("Hydrogen", 1, 1.008, 2.2, 8.988e-05),
    He("Helium", 2, 4.0026, null, 0.0001785),
    Li("Lithium", 3, 6.94, 0.98, 0.534),
    Be("Beryllium", 4, 9.0122, 1.57, 1.85),
    B("Boron", 5, 10.81, 2.04, 2.34),
    C("Carbon", 6, 12.011, 2.55, 2.267),
    N("Nitrogen", 7, 14.007, 3.04, 0.0012506),
    O("Oxygen", 8, 15.999, 3.44, 0.001429),
    F("Fluorine", 9, 18.998, 3.98, 0.001696),
    Ne("Neon", 10, 20.18, null, 0.0008999),
    Na("Sodium", 11, 22.99, 0.93, 0.971),
    Mg("Magnesium", 12, 24.305, 1.31, 1.738),
    Al("Aluminium", 13, 26.982, 1.61, 2.7),
    Si("Silicon", 14, 28.085, 1.9, 2.33),
    P("Phosphorus", 15, 30.974, 2.19, 1.823),
    S("Sulfur", 16, 32.06, 2.58, 2.067),
    Cl("Chlorine", 17, 35.45, 3.16, 0.003214),
    Ar("Argon", 18, 39.948, null, 0.0017837),
    K("Potassium", 19, 39.098, 0.82, 0.862),
    Ca("Calcium", 20, 40.078, 1.0, 1.55),
    Sc("Scandium", 21, 44.956, 1.36, 2.985),
    Ti("Titanium", 22, 47.867, 1.54, 4.506),
    V("Vanadium", 23, 50.942, 1.63, 6.11),
    Cr("Chromium", 24, 51.996, 1.66, 7.15),
    Mn("Manganese", 25, 54.938, 1.55, 7.44),
    Fe("Iron", 26, 55.845, 1.83, 7.874),
    Co("Cobalt", 27, 58.933, 1.88, 8.86),
    Ni("Nickel", 28, 58.693, 1.91, 8.908),
    Cu("Copper", 29, 63.546, 1.9, 8.96),
    Zn("Zinc", 30, 65.38, 1.65, 7.134),
    Ga("Gallium", 31, 69.723, 1.81, 5.904),
    Ge("Germanium", 32, 72.63, 2.01, 5.323),
    As("Arsenic", 33, 74.922, 2.18, 5.776),
    Se("Selenium", 34, 78.971, 2.55, 4.809),
    Br("Bromine", 35, 79.904, 2.96, 3.122),
    Kr("Krypton", 36, 83.798, 3.0, 0.003733),
    Rb("Rubidium", 37, 85.468, 0.82, 1.532),
    Sr("Strontium", 38, 87.62, 0.95, 2.64),
    Y("Yttrium", 39, 88.906, 1.22, 4.469),
    Zr("Zirconium", 40, 91.224, 1.33, 6.506),
    Nb("Niobium", 41, 92.906, 1.6, 8.57),
    Mo("Molybdenum", 42, 95.95, 2.16, 10.28),
    Tc("Technetium", 43, 98.0, 1.9, 11.5),
    Ru("Ruthenium", 44, 101.07, 2.2, 12.37),
    Rh("Rhodium", 45, 102.91, 2.28, 12.41),
    Pd("Palladium", 46, 106.42, 2.2, 12.02),
    Ag("Silver", 47, 107.87, 1.93, 10.49),
    Cd("Cadmium", 48, 112.41, 1.69, 8.65),
    In("Indium", 49, 114.82, 1.78, 7.31),
    Sn("Tin", 50, 118.71, 1.96, 7.265),
    Sb("Antimony", 51, 121.76, 2.05, 6.697),
    Te("Tellurium", 52, 127.6, 2.1, 6.24),
    I("Iodine", 53, 126.9, 2.66, 4.93),
    Xe("Xenon", 54, 131.29, 2.6, 0.005887),
    Cs("Caesium", 55, 132.91, 0.79, 1.873),
    Ba("Barium", 56, 137.33, 0.89, 3.62),
    La("Lanthanum", 57, 138.91, 1.1, 6.145),
    Ce("Cerium", 58, 140.12, 1.12, 6.77),
    Pr("Praseodymium", 59, 140.91, 1.13, 6.77),
    Nd("Neodymium", 60, 144.24, 1.14, 7.01),
    Pm("Promethium", 61, 145.0, 1.13, 7.26),
    Sm("Samarium", 62, 150.36, 1.17, 7.52),
    Eu("Europium", 63, 151.96, null, 5.24),
    Gd("Gadolinium", 64, 157.25, 1.2, 7.9),
    Tb("Terbium", 65, 158.93, 1.1, 8.23),
    Dy("Dysprosium", 66, 162.5, 1.22, 8.55),
    Ho("Holmium", 67, 164.93, 1.23, 8.8),
    Er("Erbium", 68, 167.26, 1.24, 9.07),
    Tm("Thulium", 69, 168.93, 1.25, 9.32),
    Yb("Ytterbium", 70, 173.05, null, 6.9),
    Lu("Lutetium", 71, 174.97, 1.27, 9.84),
    Hf("Hafnium", 72, 178.49, 1.3, 13.31),
    Ta("Tantalum", 73, 180.95, 1.5, 16.65),
    W("Tungsten", 74, 183.84, 2.36, 19.25),
    Re("Rhenium", 75, 186.21, 1.9, 21.02),
    Os("Osmium", 76, 190.23, 2.2, 22.59),
    Ir("Iridium", 77, 192.22, 2.2, 22.56),
    Pt("Platinum", 78, 195.08, 2.28, 21.45),
    Au("Gold", 79, 196.97, 2.54, 19.32),
    Hg("Mercury", 80, 200.59, 2.0, 13.53),
    Tl("Thallium", 81, 204.38, 1.62, 11.85),
    Pb("Lead", 82, 207.2, 2.33, 11.34),
    Bi("Bismuth", 83, 208.98, 2.02, 9.78),
    Po("Polonium", 84, 209.0, 2.0, 9.2),
    At("Astatine", 85, 210.0, 2.2, 7.0),
    Rn("Radon", 86, 222.0, 2.2, 0.00973),
    Fr("Francium", 87, 223.0, 0.7, 1.87),
    Ra("Radium", 88, 226.0, 0.9, 5.5),
    Ac("Actinium", 89, 227.0, 1.1, 10.07),
    Th("Thorium", 90, 232.04, 1.3, 11.72),
    Pa("Protactinium", 91, 231.04, 1.5, 15.37),
    U("Uranium", 92, 238.03, 1.38, 18.95),
    Np("Neptunium", 93, 237.0, 1.36, 20.25),
    Pu("Plutonium", 94, 244.0, 1.28, 19.84),
    Am("Americium", 95, 243.0, 1.13, 13.69),
    Cm("Curium", 96, 247.0, 1.28, 13.51),
    Bk("Berkelium", 97, 247.0, 1.3, 14.78),
    Cf("Californium", 98, 251.0, 1.3, 15.1),
    Es("Einsteinium", 99, 252.0, 1.3, 8.84),
    Fm("Fermium", 100, 257.0, 1.3, null),
    Md("Mendelevium", 101, 258.0, 1.3, null),
    No("Nobelium", 102, 259.0, 1.3, null),
    Lr("Lawrencium", 103, 266.0, 1.3, null),
    Rf("Rutherfordium", 104, 267.0, null, null),
    Db("Dubnium", 105, 268.0, null, null),
    Sg("Seaborgium", 106, 269.0, null, null),
    Bh("Bohrium", 107, 270.0, null, null),
    Hs("Hassium", 108, 277.0, null, null),
    Mt("Meitnerium", 109, 278.0, null, null),
    Ds("Darmstadtium", 110, 281.0, null, null),
    Rg("Roentgenium", 111, 282.0, null, null),
    Cn("Copernicium", 112, 285.0, null, null),
    Nh("Nihonium", 113, 286.0, null, null),
    Fl("Flerovium", 114, 289.0, null, null),
    Mc("Moscovium", 115, 290.0, null, null),
    Lv("Livermorium", 116, 293.0, null, null),
    Ts("Tennessine", 117, 294.0, null, null),
    Og("Oganesson", 118, 294.0, null, null);

    private final String name;
    private final int atomicNumber;
    private final double atomicMass;
    private final Double electronegativity;
    private final Double density;

    Atoms(String name, int atomicNumber, double atomicMass, Double electronegativity, Double density) {
        this.name = name;
        this.atomicNumber = atomicNumber;
        this.atomicMass = atomicMass;
        this.electronegativity = electronegativity;
        this.density = density;
    }

    public String getSymbol() {
        return this.name();
    }

    public String getName() {
        return name;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public double getAtomicMass() {
        return atomicMass;
    }

    public Double getElectronegativity() {
        return electronegativity;
    }

    public Double getDensity() {
        return density;
    }

}
