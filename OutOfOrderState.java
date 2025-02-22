public class OutOfOrderState implements VendingMachineState {
  @Override
  public void selectItem(VendingMachine vendingMachine) {
      System.out.println("Machine is out of order. Cannot select item.");
  }

  @Override
  public void insertCoin(VendingMachine vendingMachine, Double amount) {
      System.out.println("Machine is out of order. Cannot insert coins.");
  }

  @Override
  public void dispenseItem(VendingMachine vendingMachine) {
      System.out.println("Machine is out of order. Cannot dispense.");
  }

  @Override
  public void setOutOfOrder(VendingMachine vendingMachine) {
      System.out.println("Machine is already out of order.");
  }
}