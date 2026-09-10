public class TravelDirector {
   public void makeLuxuryVacation(TravelBuilder b) {
       b.setDestination("Maldives")
        .setAccommodation("Overwater Bungalow")
        .setTransport("Seaplane")
        .setDuration(10);
   }

   public void makeBackpackerTrip(TravelBuilder b) {
       b.setDestination("Southeast Asia")
        .setAccommodation("Hostel")
        .setTransport("Bus/Train")
        .setDuration(30);
   }
}
