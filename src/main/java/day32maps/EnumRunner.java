package day32maps;

public class EnumRunner {
    public static void main(String[] args) {


    String capital = UsStates.CALIFORNIA.getCapital();
    System.out.println(capital);

    String abbr = UsStates.FLORIDA.getAbbreviation();
    System.out.println(abbr);

    String state = UsStates.getStateNameFromAbbreviation("FL");
    System.out.println("state = " + state);

    String stateName =UsStates.getStateNameFromCapital("Denver");
    System.out.println("stateName = " + stateName);

    //Baskenti verilen state`nin kisaltmasini ekrana yazdiran method`u olusturunuz.

    String abbreviation = UsStates.getAbbreviationNameFromCapital("Atlanta");
    System.out.println("abbreviation = " + abbreviation);

    }
}
