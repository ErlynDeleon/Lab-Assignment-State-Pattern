public class ItemSelectedState implements VendingMachineState {
  @Override
  public void selectItem(VendingMachine vendingMachine) {
      System.out.println("Item already selected.");
  }

  @Override
  public void insertCoin(VendingMachine vendingMachine, Double amount) {
      vendingMachine.setBalance(vendingMachine.getBalance() + amount);
      System.out.println("Inserted " + amount + ". Current balance: " + vendingMachine.getBalance());
      if (vendingMachine.getBalance() >= vendingMachine.getItemPrice()) {
          vendingMachine.setVendingMachineState(new DispensingState());
      }
  }

  @Override
  public void dispenseItem(VendingMachine vendingMachine) {
      System.out.println("Not enough balance to dispense.");
  }

  @Override
  public void setOutOfOrder(VendingMachine vendingMachine) {
      System.out.println("Machine is now out of order.");
      vendingMachine.setVendingMachineState(new OutOfOrderState());
  }
}