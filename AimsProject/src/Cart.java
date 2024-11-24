public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private final DigitalVideoDisc[] digitalVideoDisc;
    private int quantity;
    private float totalCost;

    public Cart(){
        this.totalCost = 0;
        this.quantity = 0;
        this.digitalVideoDisc = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    }

    public void addDigitalVideoDisc(DigitalVideoDisc digitalVideoDisc){
        if (quantity == MAX_NUMBERS_ORDERED) System.out.println("Max quantity");
        else {
            this.digitalVideoDisc[quantity] = digitalVideoDisc;
            this.quantity ++;
            this.totalCost += digitalVideoDisc.getCost();
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc digitalVideoDisc){
        int index = -1;
        float cost = 0;
        for (int i =0; i < quantity; i++){
            if (this.digitalVideoDisc[i].equals(digitalVideoDisc)){
                index = i;
                cost = digitalVideoDisc.getCost();
                break;
            }
        }

        if (index == -1) System.out.println("Can't find");
        else {
            for (int i = index; i < quantity - 1; i++ ){
                this.digitalVideoDisc[i] = this.digitalVideoDisc[i+1];
            }
            this.quantity --;
            this.totalCost -= cost;
        }
    }

    public float totalCost(){
        return this.totalCost;
    }
}
