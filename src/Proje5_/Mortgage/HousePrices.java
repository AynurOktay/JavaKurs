package Proje5_.Mortgage;

public class HousePrices extends Users {


    private int price;


    public HousePrices(String username, String whichCondition, String houseType, int roomCount, int downPayment, int longTerm, StatesTax statesTax) {
        super(username, whichCondition, houseType, roomCount, downPayment, longTerm, statesTax);
        this.price = price;
    }


    public int getPrice() {
        return price;
    }

    public void roomCountToPrice() {
        if (getRoomCount() == 0) {
            this.price += 10000;
        } else if (getRoomCount() == 1) {
            this.price += 20000;
        } else if (getRoomCount() == 2) {
            this.price += 30000;
        } else if (getRoomCount() == 3) {
            this.price += 40000;
        } else if (getRoomCount() == 4) {
            this.price += 50000;
        } else if (getRoomCount() == 5) {
            this.price += 60000;
        }
        System.out.println(this.price);

    }

    public void conditionToPrice() {

        if (getWhichCondition().equalsIgnoreCase("new"))
            price += 50000;
        else if (getWhichCondition().equalsIgnoreCase("like new"))
            price += 40000;
        else if (getWhichCondition().equalsIgnoreCase("old"))
            price += 30000;
        else if (getWhichCondition().equalsIgnoreCase("renew required"))
            price += 15000;
        System.out.println(this.price);
    }




    public void houseTypeToPrice() {
        if (getHouseType().equalsIgnoreCase("apartment"))
            price += 20000;
        else if (this.getHouseType().equalsIgnoreCase("condo"))
            price += 30000;
        else if (this.getHouseType().equalsIgnoreCase("house"))
            price += 40000;
        System.out.print(this.price);

    }

        public int getPriceTotal(){
            int houseType;
            int Condition;
            int Room;
            houseTypeToPrice();
            houseType = this.price;
            roomCountToPrice();
            Room = this.price;
            conditionToPrice();
            Condition = this.price;
            return houseType + Condition + Room;
        }




    public void calculateTax() {

        System.out.println((getPriceTotal()* getStatesTax().getTax()) * 100);
    }


    public int getPriceEachMonth() {

        int restAmount =getPriceTotal()-getDownPayment();
        int priceEachMonth = restAmount / getLongTerm();
        return priceEachMonth;

    }
}

