package edubridge;
import java.util.ArrayList; 
import java.util.List;

class Hotel { private String name; private int pricePerNight;

public Hotel(String name, int pricePerNight) {
    this.name = name;
    this.pricePerNight = pricePerNight;
}

public void displayInfo() {
    System.out.println("Hotel: " + name + ", Price per Night: " + pricePerNight);
}

}

class Transport { private String type; private int fare;

public Transport(String type, int fare) {
    this.type = type;
    this.fare = fare;
}

public void displayInfo() {
    System.out.println("Transport: " + type + ", Fare: " + fare);
}

}

class AirTicket { private String airline; private int price;

public AirTicket(String airline, int price) {
    this.airline = airline;
    this.price = price;
}

public void displayInfo() {
    System.out.println("Airline: " + airline + ", Ticket Price: " + price);
}

}

class Shopping { private String mallName; private String specialty;

public Shopping(String mallName, String specialty) {
    this.mallName = mallName;
    this.specialty = specialty;
}

public void displayInfo() {
    System.out.println("Mall: " + mallName + ", Famous for: " + specialty);
}

}

class CityNews { private String headline; private String description;

public CityNews(String headline, String description) {
    this.headline = headline;
    this.description = description;
}

public void displayInfo() {
    System.out.println("News: " + headline + " - " + description);
}

}
public class smartcity {


	public static void main(String[] args) { List<Hotel> hotels = new ArrayList<>(); hotels.add(new Hotel("Grand Palace", 5000)); hotels.add(new Hotel("City Inn", 3000));

	List<Transport> transportOptions = new ArrayList<>();
	    transportOptions.add(new Transport("Metro", 50));
	    transportOptions.add(new Transport("Taxi", 300));
	    
	    List<AirTicket> flights = new ArrayList<>();
	    flights.add(new AirTicket("Air India", 7000));
	    flights.add(new AirTicket("IndiGo", 5000));
	    
	    List<Shopping> shoppingCenters = new ArrayList<>();
	    shoppingCenters.add(new Shopping("Mall of City", "Branded Clothes"));
	    shoppingCenters.add(new Shopping("Local Market", "Handicrafts"));
	    
	    List<CityNews> newsList = new ArrayList<>();
	    newsList.add(new CityNews("New Metro Line Opened", "The city introduces a new metro line for better connectivity."));
	    newsList.add(new CityNews("Tech Conference 2025", "A major tech event is scheduled for next month."));

	    System.out.println("Welcome to the Smart City Guide!\n");
	    
	    System.out.println("Hotels:");
	    for (Hotel hotel : hotels) hotel.displayInfo();
	    
	    System.out.println("\nTransport Options:");
	    for (Transport transport : transportOptions) transport.displayInfo();
	    
	    System.out.println("\nAvailable Flights:");
	    for (AirTicket ticket : flights) ticket.displayInfo();
	    
	    System.out.println("\nShopping Centers:");
	    for (Shopping shop : shoppingCenters) shop.displayInfo();
	    
	    System.out.println("\nCity News:");
	    for (CityNews news : newsList) news.displayInfo();
	}

	
}
