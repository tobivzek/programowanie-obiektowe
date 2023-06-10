package controllers;

import models.Card;
import models.BasicData;
import models.Disease;
import java.util.Arrays;
import java.util.Scanner;
public class RunController extends BasicData{
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chcesz stworzyć kartę pacjenta (wpisz: card) czy dodać chorobę (wpisz: disease) ? ");
        String decision = String.valueOf(scanner.nextLine());

        switch (decision) {
            case "disease" -> {
                Disease disease = new Disease();
                disease.welcome(decision);
                disease.breakLine();
                System.out.println("Podaj nazwę choroby");
                disease.setName(String.valueOf(scanner.nextLine()));
                System.out.println("Czy choroba jest zakaźna?");
                disease.setContagious = String.valueOf(scanner.nextLine());
                System.out.println("Podaj lek, który pomoże zwalczyć chorobę");
                disease.setDrug = String.valueOf(scanner.nextLine());
                System.out.println(Arrays.toString(disease.DiseaseData()));
            }
            case "card" -> {
                Card card = new Card();
                card.welcome(decision);
                card.breakLine();
                System.out.println("Podaj imię pacjenta");
                card.setName(String.valueOf(scanner.nextLine()));
                System.out.println("Podaj nazwisko pacjenta");
                card.setSurname(String.valueOf(scanner.nextLine()));
                System.out.println("Podaj wiek pacjenta");
                card.setAge(Integer.parseInt(scanner.nextLine()));
                System.out.println(Arrays.toString(card.CardData()));
            }
            default -> {
                System.out.println("Wybierz ponownie");
                this.run();
            }
        }
        this.breakLine();
        System.out.println("Do zobaczenia");
    }
}