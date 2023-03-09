package TouristVoucher;

abstract class TouristVoucher {
    String typeOfTour;
    int costOfTour;
    int amountOfDaysOff;
    String destinationOfTour;
    String transport;
    boolean haveFreeBreakfast;

    public String getTypeOfTour() {
        return typeOfTour;
    }

    public int getCostOfTour() {
        return costOfTour;
    }

    public int getAmountOfDaysOff() {
        return amountOfDaysOff;
    }

    public String getDestinationOfTour() {
        return destinationOfTour;
    }

    public String getTransport() {
        return transport;
    }

    public boolean isHaveFreeBreakfast() {
        return haveFreeBreakfast;
    }

    public void setTypeOfTour(String typeOfTour) {
        this.typeOfTour = typeOfTour;
    }

    public void setCostOfTour(int costOfTour) {
        this.costOfTour = costOfTour;
    }

    public void setAmountOfDaysOff(int amountOfDaysOff) {
        this.amountOfDaysOff = amountOfDaysOff;
    }

    public void setDestinationOfTour(String destinationOfTour) {
        this.destinationOfTour = destinationOfTour;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public void setHaveFreeBreakfast(boolean haveFreeBreakfast) {
        this.haveFreeBreakfast = haveFreeBreakfast;
    }

    public TouristVoucher() {

    }

    public TouristVoucher(String typeOfTour, int costOfTour, int amountOfDaysOff, String destinationOfTour, String transport, boolean haveFreeBreakfast) {
        this.typeOfTour = typeOfTour;
        this.costOfTour = costOfTour;
        this.amountOfDaysOff = amountOfDaysOff;
        this.destinationOfTour = destinationOfTour;
        this.transport = transport;
        this.haveFreeBreakfast = haveFreeBreakfast;
    }


    @Override
    public String toString() {
        return "Путёвка{" +
                "Тип путёвки='" + typeOfTour + '\'' +
                ", Цена путёвки=" + costOfTour +
                ", Количество дней путёвки=" + amountOfDaysOff +
                ", Место пребывания='" + destinationOfTour + '\'' +
                ", Транспорт='" + transport + '\'' +
                ", Есть ли бесплатный завтрак=" + haveFreeBreakfast +
                '}';
    }
}
