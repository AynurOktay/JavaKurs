package Proje5_.Mortgage;

public class Users {
      private String username;
      private String whichCondition;
      private String HouseType;
      private  int roomCount;
       private int downPayment;
       private int longTerm;
       private StatesTax statesTax;



    public Users(String username, String whichCondition, String houseType, int roomCount, int downPayment, int longTerm, StatesTax statesTax) {
        this.username=username;
        this.whichCondition = whichCondition;
        HouseType = houseType;
        this.roomCount = roomCount;
        this.downPayment = downPayment;
        this.longTerm = longTerm;
        this.statesTax = statesTax;
    }

    public String getUsername() {
        return username;
    }

    public String getWhichCondition() {
        return whichCondition;
    }

    public String getHouseType() {
        return HouseType;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public int getDownPayment() {
        return downPayment;
    }

    public int getLongTerm() {
        return longTerm;
    }

    public Proje5_.Mortgage.StatesTax getStatesTax() {
        return statesTax;
    }




}



