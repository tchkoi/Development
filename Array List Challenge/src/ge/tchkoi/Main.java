package ge.tchkoi;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("545 45 21 32");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("\nEnter action: (6 to show available actions");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Shutting down ...");
                    quit = true;
                    break;

                case 1:
                    mobilePhone.printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateExistingContact();
                    break;

                case 4:
                    removeExistingContact();
                    break;

                case 5:
                    queryContact();
                    break;

                case 6:
                    printActions();
                    break;

            }
        }
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact created: name = " + name + " phone = " + phone);
        } else System.out.println("Cannot add, " + name + " already on file ");
    }

    private static void updateExistingContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.print("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if (mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated contact");
        } else
            System.out.println("Error updating record");

    }

    private static void removeExistingContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        if (mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Contact successfully removed");
        } else
            System.out.println("Error removing record");
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());
    }


    private static void startPhone() {
        System.out.println("Starting phone ...");
    }

    private static void printActions() {
        System.out.println("\nAvailable Actions:\nPress ");
        System.out.println("0 - to shutdown\n" +
                "1 - print contacts\n" +
                "2 - to add a new contact\n" +
                "3 - to update an existing contact\n" +
                "4 - to remove an existing contact\n" +
                "5 - query if existing contact exists\n" +
                "6 - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }
}
