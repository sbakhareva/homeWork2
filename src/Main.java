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

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

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


        var weightDiff = boxer2 % boxer1;
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
