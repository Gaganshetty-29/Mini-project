package edubridge;
import java.util.ArrayList; 
import java.util.List;
import java.util.Scanner;


 

class Hotel { private String name; private int pricePerNight;

public Hotel(String name, int pricePerNight) {
    this.name = name;
    this.pricePerNight = pricePerNight;
}

public void displayInfo() {
    System.out.println("Hotel: " + name + ", Price per Night: $" + pricePerNight);
}

}

class Transport { private String type; private int fare;

public Transport(String type, int fare) {
    this.type = type;
    this.fare = fare;
}

public void displayInfo() {
    System.out.println("Transport: " + type + ", Fare: $" + fare);
}

}

class AirTicket { private String airline; private int price;

public AirTicket(String airline, int price) {
    this.airline = airline;
    this.price = price;
}

public void displayInfo() {
    System.out.println("Airline: " + airline + ", Ticket Price: $" + price);
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
	 public static void main(String[] args) { Scanner scanner = new Scanner(System.in);

	 List<Hotel> hotels = new ArrayList<>();
	     hotels.add(new Hotel("Grand Palace", 5000));
	     hotels.add(new Hotel("City Inn", 3000));

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

	     while (true) {
	         System.out.println("\nSmart City Guide");
	         System.out.println("1. View Hotels");
	         System.out.println("2. View Transport Options");
	         System.out.println("3. View Available Flights");
	         System.out.println("4. View Shopping Centers");
	         System.out.println("5. View City News");
	         System.out.println("6. Exit");
	         System.out.print("Enter your choice: ");
	         
	         int choice = scanner.nextInt();
	         System.out.println();
	         
	         switch (choice) {
	             case 1:
	                 System.out.println("Hotels:");
	                 for (Hotel hotel : hotels) hotel.displayInfo();
	                 break;
	             case 2:
	                 System.out.println("Transport Options:");
	                 for (Transport transport : transportOptions) transport.displayInfo();
	                 break;
	             case 3:
	                 System.out.println("Available Flights:");
	                 for (AirTicket ticket : flights) ticket.displayInfo();
	                 break;
	             case 4:
	                 System.out.println("Shopping Centers:");
	                 for (Shopping shop : shoppingCenters) shop.displayInfo();
	                 break;
	             case 5:
	                 System.out.println("City News:");
	                 for (CityNews news : newsList) news.displayInfo();
	                 break;
	             case 6:
	                 System.out.println("Exiting... Thank you!");
	                 scanner.close();
	                 return;
	             default:
	                 System.out.println("Invalid choice. Please try again.");
	         }
	     }
	 }

	 }