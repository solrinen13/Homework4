public class Main {
    public static void main(String[] args) {

        System.out.println("Старт");
        {
            int age = 50;
            if (age > 18) {
                System.out.println("Ты можешь водить");
            }
        }
        System.out.println("task № 1");
        {
            int age = 30;
            if (age < 18) {
                System.out.println("Вам еще нет 18");
            }
            if (age >= 18) {
                System.out.println("Поздравляем, вам уже исполнилось 18!");
            }
        }

        System.out.println("task № 2");
        int ageKid = 23;
        if (ageKid >= 7 && ageKid < 18) {
            System.out.println("Человек ходит в школу!");
        }
        if (ageKid >= 18 && ageKid < 24) {
            System.out.println("Неплохо бы уже пойти в институт");
        }
        if (ageKid >= 24) {
            System.out.println("Пора уже работать");
        }

        System.out.println("task № 3");
        int freeSeatPlace = 0;
        int freeStandingPlace = 0;
        int allPlace = freeSeatPlace + freeStandingPlace;
        if (freeSeatPlace > 0 && freeStandingPlace > 0) {
            System.out.println("свободных сидячих мест " + freeSeatPlace + " , свободных стоячих мест " + freeStandingPlace);
        } else if (freeSeatPlace == 0 && freeStandingPlace == 0) {
            System.out.println("свободных мест нет");
        }

        System.out.println("task № 2.1");
        {
            int age = 22;
            if (age < 18) {
                System.out.println("Вам еще нет 18");
            } else {
                System.out.println("Поздравляем, вам уже исполнилось 18!");
            }
        }

        System.out.println("task № 2.2");
        {
            int ageKids = 23;
            if (ageKid >= 7 && ageKids < 18) {
                System.out.println("Человек ходит в школу!");
            } else if (ageKids >= 18 && ageKids < 24) {
                System.out.println("Неплохо бы уже пойти в институт");
            } else {
                System.out.println("Пора уже работать");
            }
        }

        System.out.println("task № 3.1");
        {
            int ageHuman = 18;
            if (ageHuman >= 2 && ageHuman <= 6) {
                System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить детский сад");
            } else if (ageHuman >= 7 && ageHuman < 18) {
                System.out.println("Если возраст человека равен " + ageHuman + " , то ему нужно ходить школу");
            } else if (ageHuman >= 18 && ageHuman <= 24) {
                System.out.println("Если возраст человека равен " + ageHuman + " , то ему нужно ходить в институт");
            } else if (ageHuman > 24) {
                System.out.println("Если возраст человека равен " + ageHuman + " , то ему нужно ходить на работу");
            }
        }

        System.out.println("task № 3.2");
        {
            int ageKids = 18;
            if (ageKids < 5) {
                System.out.println("Если возраст ребенка " + ageKids + ", то ему нельзя кататься на аттракционе");
            } else if (ageKids >= 5 && ageKids < 14) {
                System.out.println("Если возраст ребенка равен " + ageKids + " , то ему можно кататься только с сопровождением взрослого");
            } else if (ageKids >= 14) {
                System.out.println("Если возраст ребенка равен " + ageKids + " , то ему можно кататься и одному");
            }
        }

        System.out.println("task № 3.3");
        {
            int one = 1;
            int two = 2;
            int three = 3;
            if (one > three && one > two) {
                System.out.println("Число " +one+ " самое большое");
            }
            if (two > three && two > one) {
                System.out.println("Число " +two+ " самое большое");
            }

            if (three > one && three > two) {
                System.out.println("Число " +three+ " самое большое");
            }


        }

    }


}