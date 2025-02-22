public class VendingMachineMain {
  public static void main(String[] args) {
    VendingMachine vendingMachine = new VendingMachine(5, 10);
        vendingMachine.selectItem();
        vendingMachine.dispenseItem();
        vendingMachine.setOutOfOrder();
        vendingMachine.selectItem();
  }
}