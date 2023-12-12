package inheritance;

public class Result {
    public static void main(String[] args) {

        Doctor doctor = new Doctor();
        Kinderarzt kinderarzt = new Kinderarzt();
        Chirurg chirurg = new Chirurg();

        System.out.println("Doctor's name is " + kinderarzt.name);
        System.out.println("He works at " + kinderarzt.workingPlace);
        System.out.println("His specialty is " + kinderarzt.specialization);
        kinderarzt.wear();
        System.out.println("________________________________________");

        System.out.println("Doctor's name is " + chirurg.name);
        System.out.println("He works at " + chirurg.workingPlace);
        System.out.println("His specialty is " + chirurg.specialization);
        chirurg.wear();
        System.out.println("_____________________________________________");

        System.out.println("Their profession is " + chirurg.profession);
        chirurg.canDo();


    }
}
