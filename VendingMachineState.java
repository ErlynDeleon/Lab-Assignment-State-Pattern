public interface  VendingMachineState {
  public void selectItem(VendingMachine vendingMachine);
  public void insertCoin(VendingMachine vendingMachine, Double amount);
  public void dispenseItem(VendingMachine vendingMachine);
  public void setOutOfOrder(VendingMachine vendingMachine);
}
