package programs.P16.BalanceProblem.InnerPackage;
public class Balance {
    String name;
    double bal;
    public Balance(String n, double b){
        name = n;
        bal = b;
    }
    public void show(){
        if (bal < 0){
        System.out.print("balance less than zero ");
        System.out.println(name + " :$ " + bal);
        } else {
        System.out.print("balance greater than zero ");
        System.out.println(name + " :$ " + bal);
        }
    }
}
