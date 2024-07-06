public class Main {
    public static void main(String[] args) {
        // Create 5 Toshiba batteries
        ToshibaBattery tb1 = new ToshibaBattery(3.7, 2.0, 10000, 500);
        ToshibaBattery tb2 = new ToshibaBattery(3.6, 1.8, 9000, 450);
        ToshibaBattery tb3 = new ToshibaBattery(3.8, 2.1, 11000, 550);
        ToshibaBattery tb4 = new ToshibaBattery(3.5, 2.2, 12000, 600);
        ToshibaBattery tb5 = new ToshibaBattery(3.9, 1.9, 9500, 475);

        // Create 5 Duracell batteries
        DuracellBattery db1 = new DuracellBattery(1.5, 2.0, 5000, 0.1);
        DuracellBattery db2 = new DuracellBattery(1.6, 1.8, 4500, 0.2);
        DuracellBattery db3 = new DuracellBattery(1.4, 2.1, 5500, 0.3);
        DuracellBattery db4 = new DuracellBattery(1.7, 2.2, 6000, 0.2);
        DuracellBattery db5 = new DuracellBattery(1.8, 1.9, 4750, 0.1);

        // Create 5 FlashLights with different parameters
        Flashlight fl1 = new Flashlight(new Battery[]{tb1, db1});
        Flashlight fl2 = new Flashlight(new Battery[]{tb2, db2});
        Flashlight fl3 = new Flashlight(new Battery[]{tb3, db3});
        Flashlight fl4 = new Flashlight(new Battery[]{tb4, db4});
        Flashlight fl5 = new Flashlight(new Battery[]{tb5, db5});

        Flashlight[] flashlights = {fl1, fl2, fl3, fl4, fl5};

        for(Flashlight flashlight : flashlights){
            System.out.println(flashlight.getTotalLifeTime());
        }
        Flashlight maxLifeTimeFlashLight = flashlights[0];
        for (Flashlight flashLight : flashlights) {
            if (flashLight.getTotalLifeTime() > maxLifeTimeFlashLight.getTotalLifeTime()) {
                maxLifeTimeFlashLight = flashLight;
            }
        }
        System.out.println("Flashlight with maximum lifetime: " + maxLifeTimeFlashLight.getTotalLifeTime());
    }
}
