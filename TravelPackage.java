public class TravelPackage {
   private final String destination;
   private final String accommodation;
   private final String transport;
   private final int durationDays;

   // Built only via a builder
   TravelPackage(String destination, String accommodation, String transport, int durationDays) {
       this.destination = destination;
       this.accommodation = accommodation;
       this.transport = transport;
       this.durationDays = durationDays;
   }

   @Override
   public String toString() {
       return "TravelPackage[Dest: " + destination + ", Acc: " + accommodation +
              ", Trans: " + transport + ", Days: " + durationDays + "]";
   }
}
