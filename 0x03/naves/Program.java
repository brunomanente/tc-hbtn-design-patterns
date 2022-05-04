public class Program {
    public static void main(String[] args) {
        NaveEspacial naveEspacial = new NaveEspacial(100, 50);
        System.out.println(naveEspacial);

        NaveEspacial naveComArmadura = new ArmaduraDecorator(new NaveEspacial(120, 30));
        System.out.println(naveComArmadura);

        NaveEspacial naveComArmaduraLaser = new LaserDecorator(new ArmaduraDecorator(new NaveEspacial(60, 20)));
        System.out.println(naveComArmaduraLaser);

        NaveEspacial naveComArmaduraNanoBots = new NanoBotsDecorator(new ArmaduraDecorator(new NaveEspacial(100, 100)));
        System.out.println(naveComArmaduraLaser);

        NaveEspacial naveComLaserNanoBots = new NanoBotsDecorator(new LaserDecorator(new NaveEspacial(75, 30)));
        System.out.println(naveComLaserNanoBots);

        NaveEspacial naveCompleta = new CanhaoExtraDecorator(new ArmaduraDecorator(new NanoBotsDecorator(new LaserDecorator(new NaveEspacial(50, 50)))));
        System.out.println(naveCompleta);
    }
}
