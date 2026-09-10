public class Main {
   public static void main(String[] args) {
       TravelDirector director = new TravelDirector();

       //Object Representation
       PackageObjectBuilder objBuilder = new PackageObjectBuilder();
       director.makeLuxuryVacation(objBuilder);
       TravelPackage luxuryPackage = objBuilder.getResult();
       System.out.println("Object Representation:");
       System.out.println(luxuryPackage);
       System.out.println();

       //Text Representation
       ItineraryBuilder sheetBuilder = new ItineraryBuilder();
       director.makeLuxuryVacation(sheetBuilder);
       String itinerary = sheetBuilder.getResult();
       System.out.println("Text Representation:");
       System.out.println(itinerary);
   }
}
