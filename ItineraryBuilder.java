public class ItineraryBuilder implements TravelBuilder {
   private final StringBuilder sb = new StringBuilder("=== Travel Itinerary ===\n");

   public ItineraryBuilder setDestination(String destination) { sb.append("Destination: ").append(destination).append("\n"); return this; }
   public ItineraryBuilder setAccommodation(String accommodation) { sb.append("Stay:        ").append(accommodation).append("\n"); return this; }
   public ItineraryBuilder setTransport(String transport) { sb.append("Transport:   ").append(transport).append("\n"); return this; }
   public ItineraryBuilder setDuration(int days) { sb.append("Duration:    ").append(days).append(" days\n"); return this; }

   public String getResult() {
       return sb.toString();
   }
}
