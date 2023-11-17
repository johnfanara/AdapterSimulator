public class AdapterSimulator {
    public static void main(String[] args) {
        AmericanPlug americanPlug = new AmericanPlug();
        EuropeanSocket europeanSocket = new EuropeanSocketAdapter(americanPlug);

        europeanSocket.powerEU();

        EuropeanPlug europeanPlug = new EuropeanPlug();
        AmericanSocket americanSocket = new AmericanSocketAdapter(europeanPlug);

        americanSocket.powerUS();
    }
}
