public class PackageObjectBuilder implements TravelBuilder {
   private String destination, accommodation, transport;
   private int durationDays;

   public PackageObjectBuilder setDestination(String destination) { this.destination = destination; return this; }
   public PackageObjectBuilder setAccommodation(String accommodation) { this.accommodation = accommodation; return this; }
   public PackageObjectBuilder setTransport(String transport) { this.transport = transport; return this; }
   public PackageObjectBuilder setDuration(int days) { this.durationDays = days; return this; }

   public TravelPackage getResult() {
       if (destination == null || destination.trim().isEmpty()) {
           throw new IllegalStateException("Destination is required.");
       }
       if (durationDays <= 0) {
           throw new IllegalStateException("Duration must be strictly positive.");
       }
       return new TravelPackage(destination, accommodation, transport, durationDays);
   }
}
