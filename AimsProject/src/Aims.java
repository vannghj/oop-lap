public class Aims {
    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc disc1 = new DigitalVideoDisc("The lion King","Animation","Roger Allers",87,19.95f);
        cart.addDigitalVideoDisc(disc1);
        DigitalVideoDisc disc2 = new DigitalVideoDisc("Star wars","Science Fiction","Lucas",87,24.95f);
        cart.addDigitalVideoDisc(disc2);
        DigitalVideoDisc disc3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
        cart.addDigitalVideoDisc(disc3);
        System.out.println("Total Cost is: " );
        System.out.println(cart.totalCost());
    }
}