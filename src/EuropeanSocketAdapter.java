public class EuropeanSocketAdapter implements EuropeanSocket {
    private AmericanPlug americanPlug;

    public EuropeanSocketAdapter(AmericanPlug americanPlug) {
        this.americanPlug = americanPlug;
    }

    @Override
    public void powerEU() {
        americanPlug.plugInUS();
        System.out.println("Adapter converts American plug to work with European sockets");
    }
}
