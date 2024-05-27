public class ApplePieRecipe {

    private Ingredient roomboster;
    private Ingredient suiker;
    private Ingredient bakmeel;
    private Ingredient ei;
    private Ingredient vanillesuiker;
    private Ingredient zout;
    private Ingredient appels;
    private Ingredient kaneel;
    private Ingredient paneermeel;



    // Precalentar
    public void verwarm() {
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }

    //Batir
    public void schudden() {
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    // Mezclar
    public void mengen() {
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    // Pelar y cortar
    public void pellenEnSnijden() {
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    //Molde
    public void springvorm() {
        System.out.println("Vet de springvorm in en bestrooi deze met bloem");
    }

    // Capa de masa
    public void deedLaag() {
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }

    // gevuld
    public void gevuld() {
        System.out.println("Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }

    // tiras de masa
    public void deegStroken() {
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }


    //montaje
    public void montage() {
        System.out.println("Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }

    // Hornear
    public void bakken() {
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }


}
