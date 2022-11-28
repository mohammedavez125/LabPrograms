package programs.P16.BalanceProblem;


import programs.P16.BalanceProblem.InnerPackage.Balance;

class AccountBal {
    public static void main(String args[]){
        Balance current[] = new Balance[3];
        current[0] = new Balance("Amogus", 123.23);
        current[1] = new Balance("Osas", 157.02);
        current[2] = new Balance("Fake", -12.23);
        for (int i = 0; i < 3; i++) {
            current[i].show();
        }
    }
}
