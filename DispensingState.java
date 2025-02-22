public class DispensingState implements VendingMachineState {
  @Override
  public void selectItem(VendingMachine vendingMachine) {
      System.out.println("Currently dispensing. Please wait.");
  }

  @Override
  public void insertCoin(VendingMachine vendingMachine, Double amount) {
      System.out.println("Cannot insert coin while dispensing.");
  }

  @Override
  public void dispenseItem(VendingMachine vendingMachine) {
      if (vendingMachine.getBalance() >= vendingMachine.getItemPrice() && vendingMachine.getItemInventory() > 0) {
          vendingMachine.setBalance(vendingMachine.getBalance() - vendingMachine.getItemPrice());
          vendingMachine.setItemInventory(vendingMachine.getItemInventory() - 1);
          System.out.println("Dispensing item...");
          System.out.println("Remaining balance: " + vendingMachine.getBalance() + ", Inventory: " + vendingMachine.getItemInventory());
          vendingMachine.setVendingMachineState(new IdleState());
      } else {
          System.out.println("Cannot dispense. Check balance or inventory.");
          vendingMachine.setVendingMachineState(new IdleState());
      }
  }

  @Override
  public void setOutOfOrder(VendingMachine vendingMachine) {
      System.out.println("Machine is now out of order.");
      vendingMachine.setVendingMachineState(new OutOfOrderState());
  }
}