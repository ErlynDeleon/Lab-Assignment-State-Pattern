public class VendingMachine {
  private VendingMachineState vendingMachineState;
  private int itemInventory;
  private double balance;
  private final int itemPrice;

  public VendingMachine(int itemInventory, int itemPrice) {
      this.vendingMachineState = new IdleState();
      this.itemInventory = itemInventory;
      this.balance = 0;
      this.itemPrice = itemPrice;
  }

  public VendingMachineState getVendingMachineState() {
      return vendingMachineState;
  }

  public void setVendingMachineState(VendingMachineState vendingMachineState) {
      this.vendingMachineState = vendingMachineState;
  }

  public int getItemInventory() {
      return itemInventory;
  }

  public void setItemInventory(int itemInventory) {
      this.itemInventory = itemInventory;
  }

  public double getBalance() {
      return balance;
  }

  public void setBalance(double balance) {
      this.balance = balance;
  }

  public int getItemPrice() {
      return itemPrice;
  }

  public void selectItem() {
      vendingMachineState.selectItem(this);
  }

  public void insertCoin(Double amount) {
      vendingMachineState.insertCoin(this, amount);
  }

  public void dispenseItem() {
      vendingMachineState.dispenseItem(this);
  }

  public void setOutOfOrder() {
      vendingMachineState.setOutOfOrder(this);
  }
}