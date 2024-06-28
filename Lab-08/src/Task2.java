public class Task2 {
    public static void main(String[] args) {

        Continent continent = new Continent("Europe");

        Country country = new Country("Greece");
        Country country2 = new Country("Germany");
        Country country3 = new Country("France");

        ResortPlace[] resortPlaces = new ResortPlace[9];

        resortPlaces[0] = new ResortPlace("Afines", "Afines");
        Tourist[] firstGroup = new Tourist[3];
        firstGroup[0] = new Tourist("Alex", 1200);
        firstGroup[1] = new Tourist("Jessey", 1330);
        firstGroup[2] = new Tourist("Jade", 760);

        for(Tourist tourist : firstGroup){
            resortPlaces[0].addTourist(tourist);
        }

        resortPlaces[1] = new ResortPlace("Corfu", "Corfu");
        Tourist[] secondGroup = new Tourist[3];
        secondGroup[0] = new Tourist("Alan", 2500);
        secondGroup[1] = new Tourist("Nathan", 2190);
        secondGroup[2] = new Tourist("Ben", 1645);

        for(Tourist tourist : secondGroup){
            resortPlaces[1].addTourist(tourist);
        }

        resortPlaces[2] = new ResortPlace("Halkidiki", "Halkidiki");
        Tourist[] thirdGroup = new Tourist[3];
        thirdGroup[0] = new Tourist("Melina", 1300);
        thirdGroup[1] = new Tourist("Kara", 780);
        thirdGroup[2] = new Tourist("Alice", 995);

        for(Tourist tourist : thirdGroup){
            resortPlaces[2].addTourist(tourist);
        }
        country.addResort(resortPlaces[0]);
        country3.addResort(resortPlaces[1]);
        country3.addResort(resortPlaces[2]);

        resortPlaces[3] = new ResortPlace("Zealt Island", "Zult");
        Tourist[] fourthGroup = new Tourist[3];
        fourthGroup[0] = new Tourist("Ben", 670);
        fourthGroup[1] = new Tourist("Jessey", 1210);
        fourthGroup[2] = new Tourist("William", 1340);

        for(Tourist tourist : fourthGroup){
            resortPlaces[3].addTourist(tourist);
        }

        resortPlaces[4] = new ResortPlace("Borkum Island", "Borkum");
        Tourist[] fifthGroup = new Tourist[3];
        fifthGroup[0] = new Tourist("Henry", 1532);
        fifthGroup[1] = new Tourist("James", 360);
        fifthGroup[2] = new Tourist("Harry", 430);

        for(Tourist tourist : fifthGroup){
            resortPlaces[4].addTourist(tourist);
        }

        resortPlaces[5] = new ResortPlace("Rugen Island", "Rugen");
        Tourist[] sixthGroup = new Tourist[3];
        sixthGroup[0] = new Tourist("Diaz", 1453);
        sixthGroup[1] = new Tourist("Melissa", 1673);
        sixthGroup[2] = new Tourist("Jessica", 1970);

        for(Tourist tourist : sixthGroup){
            resortPlaces[5].addTourist(tourist);
        }
        country2.addResort(resortPlaces[3]);
        country2.addResort(resortPlaces[4]);
        country2.addResort(resortPlaces[5]);

        resortPlaces[6] = new ResortPlace("Paris", "Paris");
        Tourist[] seventhGroup = new Tourist[3];
        seventhGroup[0] = new Tourist("Michael", 651);
        seventhGroup[1] = new Tourist("Jenifer", 1343);
        seventhGroup[2] = new Tourist("Trevor", 563);

        for(Tourist tourist : seventhGroup){
            resortPlaces[6].addTourist(tourist);
        }

        resortPlaces[7] = new ResortPlace("Lazure Beach", "Marsel");
        Tourist[] eighthGroup = new Tourist[3];
        eighthGroup[0] = new Tourist("Nayla", 2221);
        eighthGroup[1] = new Tourist("Angelo", 1450);
        eighthGroup[2] = new Tourist("Franklin", 890);

        for(Tourist tourist : eighthGroup){
            resortPlaces[7].addTourist(tourist);
        }

        resortPlaces[8] = new ResortPlace("Nice", "Nice");
        Tourist[] ninthGroup = new Tourist[3];
        ninthGroup[0] = new Tourist("Jackson", 1670);
        ninthGroup[1] = new Tourist("Kendall", 360);
        ninthGroup[2] = new Tourist("George", 430);

        for(Tourist tourist : ninthGroup){
            resortPlaces[8].addTourist(tourist);
        }

        country3.addResort(resortPlaces[6]);
        country3.addResort(resortPlaces[7]);
        country3.addResort(resortPlaces[8]);

        Country[] countries = new Country[]{country, country2, country3};
        for(int i = 0; i < 3; i++){
            continent.addCountry(countries[i]);
        }

        System.out.println("Total income of all countries in continent: " + continent.getTotalInComeOfAllResorts());
        System.out.println("The most profitable country: " + continent.getTheMostProfitableCountry());

        Country theMostProfitableCountry = continent.getTheMostProfitableCountry();
        ResortPlace[] resortPlacesTheMostProfitableCountry = theMostProfitableCountry.getResortPlaces();

        ResortPlace theMostProfitableResortPlaceInTheMost = new ResortPlace();

        for(int i = 0; i < theMostProfitableCountry.getResortCount(); i++){
            if(theMostProfitableResortPlaceInTheMost.getTotalInCome() < resortPlacesTheMostProfitableCountry[i].getTotalInCome()){
                theMostProfitableResortPlaceInTheMost = resortPlacesTheMostProfitableCountry[i];
            }
        }
        System.out.println(theMostProfitableResortPlaceInTheMost);
    }
}
