//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var Dog = dog + 4;
        var Cat = cat + 4;
        var Paper = paper + 4;
        System.out.println(Dog);
        System.out.println(Cat);
        System.out.println(Paper);

        var DOG = dog - 3.5;
        var CAT = cat - 1.6;
        var PAPER = paper - 7639;
        System.out.println(DOG);
        System.out.println(CAT);
        System.out.println(PAPER);

        var friend = 19;
        System.out.println(friend);
        var friends = friend + 2;
        System.out.println(friends);
        var noFriends = friends / 7;
        System.out.println(noFriends);

        var frog = 3.5;
        System.out.println(frog);
        var bigFrog = frog * 10;
        System.out.println(bigFrog);
        var regularFrog = bigFrog / 3.5;
        System.out.println(regularFrog);
        var middleFrog = regularFrog + 4;
        System.out.println(middleFrog);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var summaryWeight = boxer1 + boxer2;
        System.out.println(summaryWeight);
        var weightDifference = boxer2 - boxer1;
        System.out.println(weightDifference);

        var Boxer1 = 78.2;
        var Boxer2 = 82.7;
        var weightDiff = Boxer2 % Boxer1;
        System.out.println(weightDiff);

        var workHours = 640;
        var hoursPerPerson = 8;
        var employees = workHours / hoursPerPerson;
        System.out.println("Всего работников в компании " + employees + " человек");
        var moreEmployees = employees + 94;
        var moreHours = moreEmployees * 8;
        System.out.println("Если в компании работает " + moreEmployees + " человек, то всего " + moreHours + " часа может быть поделено между сотрудниками.");


    }

}
