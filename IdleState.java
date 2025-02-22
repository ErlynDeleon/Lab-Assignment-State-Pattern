public class IdleState implements VendingMachineState {
  @Override
  public void selectItem(VendingMachine vendingMachine) {
      System.out.println("Item selected.");
      vendingMachine.setBalance(vendingMachine.getItemPrice());
      vendingMachine.setVendingMachineState(new ItemSelectedState());
  }

  @Override
  public void insertCoin(VendingMachine vendingMachine, Double amount) {
      System.out.println("Cannot insert coin, select an item first.");
  }

  @Override
  public void dispenseItem(VendingMachine vendingMachine) {
      System.out.println("Cannot dispense, select an item first.");
  }

  @Override
  public void setOutOfOrder(VendingMachine vendingMachine) {
      System.out.println("Machine is now out of order.");
      vendingMachine.setVendingMachineState(new OutOfOrderState());
  }
}