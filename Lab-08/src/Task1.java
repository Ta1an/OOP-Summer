public class Task1 {
    public static void main(String[] args) {
        Country country = new Country("USA");

        ResortPlace[] resortPlace = new ResortPlace[5];
        resortPlace[0] = new ResortPlace("Panama city Beach", "Panama-City");

        Tourist[] firstGroup = new Tourist[5];
        firstGroup[0] = new Tourist("Adam", 600);
        firstGroup[1] = new Tourist("Max", 500);
        firstGroup[2] = new Tourist("Michael", 1000);
        firstGroup[3] = new Tourist("Jane", 1200);
        firstGroup[4] = new Tourist("Jessey", 700);


        for (Tourist tourist : firstGroup) {
            resortPlace[0].addTourist(tourist);
        }

        resortPlace[1] = new ResortPlace("La Jolla", "San-Diego");
        Tourist[] secondGroup = new Tourist[5];
        secondGroup[0] = new Tourist("Ariana", 400);
        secondGroup[1] = new Tourist("Frank", 800);
        secondGroup[2] = new Tourist("George", 500);
        secondGroup[3] = new Tourist("Henry", 1400);
        secondGroup[4] = new Tourist("Alan", 2000);

        for (Tourist tourist : secondGroup) {
            resortPlace[1].addTourist(tourist);
        }

        resortPlace[2] = new ResortPlace("Kaanapai", "Maui");
        Tourist[] thirdGroup = new Tourist[5];
        thirdGroup[0] = new Tourist("Jade", 450);
        thirdGroup[1] = new Tourist("Milina", 300);
        thirdGroup[2] = new Tourist("James", 560);
        thirdGroup[3] = new Tourist("Emily", 1100);
        thirdGroup[4] = new Tourist("Olivia", 1450);

        for (Tourist tourist : thirdGroup) {
            resortPlace[2].addTourist(tourist);
        }

        resortPlace[3] = new ResortPlace("Dunes Village", "Charleston");
        Tourist[] fourthGroup = new Tourist[5];
        fourthGroup[0] = new Tourist("William", 550);
        fourthGroup[1] = new Tourist("Antony", 500);
        fourthGroup[2] = new Tourist("Claire", 530);
        fourthGroup[3] = new Tourist("Shaun", 1250);
        fourthGroup[4] = new Tourist("Lea", 720);

        for (Tourist tourist : fourthGroup) {
            resortPlace[3].addTourist(tourist);
        }

        resortPlace[4] = new ResortPlace("Dolphin Point Villas", "Ki-Largo");
        Tourist[] fifthGroup = new Tourist[5];
        fifthGroup[0] = new Tourist("Steven", 550);
        fifthGroup[1] = new Tourist("Paul", 500);
        fifthGroup[2] = new Tourist("Andrew", 530);
        fifthGroup[3] = new Tourist("Melissa", 1250);
        fifthGroup[4] = new Tourist("Nathan", 720);

        for (Tourist tourist : fifthGroup) {
            resortPlace[4].addTourist(tourist);
        }
        for(int i = 0; i < 5; i++){
            country.addResort(resortPlace[i]);
        }
        country.printAllResort();

        int totalTourists = 0;
        for(int i = 0; i < country.getResortCount(); i++){
            totalTourists += resortPlace[i].getTotalTourists();
        }
        System.out.println("Total tourists in country: " + totalTourists + "tourists");

        double sumOfIncomes = 0;
        for(int i = 0; i < 5; i++){
            sumOfIncomes += resortPlace[i].getTotalInCome();
        }
        System.out.println("Total incomes in country: " + sumOfIncomes + " USD\n");

        ResortPlace resortPlaceWithMaxIncomes = new ResortPlace();
        for(int i = 0; i < country.getResortCount(); i++){
            if(resortPlace[i].getTotalInCome() > resortPlaceWithMaxIncomes.getTotalInCome()){
                resortPlaceWithMaxIncomes = resortPlace[i];
            }
        }
        System.out.println(resortPlaceWithMaxIncomes);

        Tourist richestTourist = new Tourist();


        for(ResortPlace place : resortPlace) {
            for(Tourist tourist : firstGroup) {
                if(richestTourist.getIncomeMoney() < tourist.getIncomeMoney()){
                    richestTourist = tourist;
                }
            }
            for(Tourist tourist : secondGroup) {
                if(richestTourist.getIncomeMoney() < tourist.getIncomeMoney()){
                    richestTourist = tourist;
                }
            }
            for(Tourist tourist : thirdGroup) {
                if(richestTourist.getIncomeMoney() < tourist.getIncomeMoney()){
                    richestTourist = tourist;
                }
            }
            for(Tourist tourist : fourthGroup) {
                if(richestTourist.getIncomeMoney() < tourist.getIncomeMoney()){
                    richestTourist = tourist;
                }
            }
        }
        System.out.println("Richest tourist in country:\n" + richestTourist);
    }
}