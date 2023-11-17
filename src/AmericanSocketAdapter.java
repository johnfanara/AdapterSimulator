public class AmericanSocketAdapter implements AmericanSocket {
    private EuropeanPlug europeanPlug;

    public AmericanSocketAdapter(EuropeanPlug europeanPlug) { this.europeanPlug = europeanPlug; }

    @Override
    public void powerUS() {
        europeanPlug.plugInEU();
        System.out.println("Adapter converts European plug to work with American sockets");
    }
}
