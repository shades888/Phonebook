package com.phonebok1;
import java.util.Scanner;
public class Phonebook2 {
	public static void main(String[] args) {
		displayMenu();
	}

	public static void displayMenu() {
		Scanner input = new Scanner(System.in);
		Scanner inString = new Scanner(System.in);

		Address person1Address = new Address("1234 Street", "Saint Louis", "MO", "63130");
		Address person2Address = new Address("2222 Street", "Saint Louis", "MO", "63133");
		Address person3Address = new Address("5555 Street", "Saint Louis", "MO", "63144");

		Person person1 = new Person("John", "", "Doe", "3142224444", person1Address);
		Person person2 = new Person("Jane", "Mary", "Doe", "6361114444", person2Address);
		Person person3 = new Person("Jesus", "Holy", "Christ", "3140007777", person3Address);

		Person[] peopleArray = new Person[3];
		peopleArray[0] = person1;
		peopleArray[1] = person2;
		peopleArray[2] = person3;



		Address[] address = new Address[3];
		address[0] = person1Address;
		address[1] = person2Address;
		address[2] = person3Address;

		while (true) {
			System.out.println("\n What would you like to do? \n" );
			System.out.println("1. Search First Name.");
			System.out.println("2. Search Last Name.");
			System.out.println("3. Search Full Name");
			System.out.println("4. Search Phone Number");
			System.out.println("5. Search by City or State");
			System.out.println("6. Search by Street");
			System.out.println("7. Search by Zip Code");
			System.out.println("8. Add Person");
			System.out.println("9. Show All Records");
			System.out.println("10. Delete Person");
			System.out.println("11. Update Record");
			int choice = input.nextInt();

			switch (choice) {

			case 1: //1. Search by first name
				System.out.println("Enter first name to search");
				String searchFirstName = inString.nextLine();
				for (int i = 0; i < peopleArray.length; i++) {
					if (peopleArray[i].getFirstName().equals(searchFirstName)) {
						System.out.println("\n" + peopleArray[i] + "\n");
					}	}
				

				break;

			case 2: //Search by last name
				System.out.println("Enter last name to search");
				String searchLastName = inString.nextLine();
				for (int i = 0; i < peopleArray.length; i++) {
					if (peopleArray[i].getLastName().equals(searchLastName)) {
						System.out.print("\n" + peopleArray[i] + "\n");
					}	}
				
				break;

			case 3: //Search by full name, first name, last name
				System.out.println("Enter first name: ");
				String searchFirstName1 = inString.nextLine();
				System.out.println("Enter Last name: ");
				String searchLastName1 = inString.nextLine();
				for (int i = 0; i < peopleArray.length; i++) {
					if (peopleArray[i].getFirstName().equals(searchFirstName1)
							&& (peopleArray[i].getLastName().equals(searchLastName1))) {
						System.out.print("\n" + peopleArray[i] + "\n");
						System.out.print("\n");
					}	}
				
				break;

			case 4: //4. Search by phone number (1112223333)
				System.out.println("Enter Phone Number to search(3142224444");
				String searchPhoneNumber = inString.nextLine();
				for (int i = 0; i < peopleArray.length; i++) {
					if (peopleArray[i].getPhoneNumber().equals(searchPhoneNumber)) {
						System.out.println("\n" + peopleArray[i] + "\n");
					}	}
				
				break;
			case 5: //5. Search by City or State
				System.out.println("Enter City or State to search by");
				String searchCityorState = inString.nextLine();
				for (int i = 0; i < address.length; i++) {
					if (peopleArray[i].getAddress().getCity().equals(searchCityorState) || peopleArray[i].getAddress().getState().equals(searchCityorState) ) {
						System.out.println("\n" + peopleArray[i] + "\n");
					}	}
				
				break;
			case 6: //6. Search by Street
				System.out.println("Enter Street to search by");
				String searchStreet = inString.nextLine();
				for (int i = 0; i < address.length; i++) {
					if (peopleArray[i].getAddress().getStreet().equals(searchStreet)) {
						System.out.println("\n" + peopleArray[i] + "\n");
					}	}
				
				break;
			case 7: //Enter Zip Code
				System.out.println("Enter Zip Code to Search");
				String searchzipCode = inString.nextLine();
				for (int i = 0; i < address.length; i++) {
					if (peopleArray[i].getAddress().getZipCode().equals(searchzipCode)) {
						System.out.println("\n" + peopleArray[i] + "\n");
					}	}
				
				break;
			case 8: //Add new person
				Scanner input1 = new Scanner(System.in);
				System.out.println("Enter First Name");
				String firstName = input1.nextLine();
				System.out.println("Enter Middle Name");
				String middleName = input1.nextLine();
				System.out.println("Enter Last Name");
				String lastName = input1.nextLine();
				System.out.println("Enter Phone Number (nospaces)");
				String phoneNumber = input1.nextLine();
				System.out.println("Enter Street (Address)");
				String street = input.nextLine();
				System.out.println("Enter City (Address)");
				String city = input.nextLine();
				System.out.println("Enter State (Address)");
				String state = input.nextLine();
				System.out.println("Enter Zip Code (Address)");
				String zipCode = input.next();

				Address address2 = new Address(street, city, state, zipCode);
				Person people2 = new Person(firstName, middleName, lastName, phoneNumber, address2);
				
				Person[] newArray = new Person[peopleArray.length +1];

				for(int i = 0; i < peopleArray.length ; i++ ) {
					newArray[i] = peopleArray[i];
				}
				peopleArray = newArray;
				peopleArray[peopleArray.length -1] = people2 ;
				System.out.println(people2);
				break;
			case 9: //Show all records
				for(int i = 0; i < peopleArray.length; i++) {
					System.out.println(peopleArray[i]);
				}
				break;

			case 10:
				//10. Delete person
				
				System.out.println("Enter phone number of Person to Delete");
				String deletePerson = inString.nextLine();
				Person[] target = null;
				for(int i =0; i<peopleArray.length; i++) {
					if(!peopleArray[i].getPhoneNumber().equals(deletePerson)) {
						addPerson(target, peopleArray[i]);
						System.out.println(peopleArray[i]);
					}
				}
			break;

		case 11: //11. Updating hte phonebook
			
			
			
			
			System.out.println("Enter Phone Number to search(3142224444");
			String searchPhoneNumber1 = inString.nextLine();
			for (int i = 0; i < peopleArray.length; i++) {
				if (peopleArray[i].getPhoneNumber().equals(searchPhoneNumber1)) {
					System.out.println("\n" + peopleArray[i] + "\n");
				}	}
			
			Scanner input11 = new Scanner(System.in);
			System.out.println("Enter First Name");
			String firstName1 = input11.nextLine();
			System.out.println("Enter Middle Name");
			String middleName1 = input11.nextLine();
			System.out.println("Enter Last Name");
			String lastName1 = input11.nextLine();
			System.out.println("Enter Phone Number (nospaces)");
			String phoneNumber1 = input11.nextLine();
			System.out.println("Enter Street (Address)");
			String street1 = input.nextLine();
			System.out.println("Enter City (Address)");
			String city1 = input.nextLine();
			System.out.println("Enter State (Address)");
			String state1 = input.nextLine();
			System.out.println("Enter Zip Code (Address)");
			String zipCode1 = input.next();

			Address address21 = new Address(street1, city1, state1, zipCode1);
			Person people21 = new Person(firstName1, middleName1, lastName1, phoneNumber1, address21);
			
			Person[] newArray1 = new Person[peopleArray.length +1];

			for(int i = 0; i < peopleArray.length ; i++ ) {
				newArray1[i] = peopleArray[i];
			}
			peopleArray = newArray1;
			peopleArray[peopleArray.length -1] = people21 ;
			System.out.println(people21);
			break;
		default:
			System.out.println("Select one of the options");
		
			}
		}
	}


	public static Person[] removePerson(Person[] persons, String phone) {

		Person[] target = null;
		for(int i =0; i<persons.length; i++) {
			if(!persons[i].getPhoneNumber().equals(phone)) {
				addPerson(target, persons[i]);
			}
		}
		return target;
	}

	public static void addPerson(Person[] persons, Person person) {
		Person[] target = null;
		if(persons == null) {
			target = new Person[1];
		}else {
			target = new Person[persons.length +1];
			for(int i =0; i<persons.length; i++) {
				target[i] = persons[i];
			}
		}
		target[target.length-1] = person;
		
		persons = target;

	}
}
