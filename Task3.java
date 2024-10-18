package CodeSoft;
//Atm interface
public class Task3 {

    static interface ATM {
        public void depositing(int n);
        public void withdrawing(int n);
        public void checkBalance();
    }

    static class userBank implements ATM{
        static int Amount = 0;
        public void depositing(int amount){
            if(amount < 500){
                System.out.println("Tansition Failed!! : Your deposting should be more than 500 Rs!");
                return;
            }
            Amount += amount;
            System.out.println(amount + " has credited in your bank account");
        }
        public void withdrawing(int amount){
            if(amount > Amount){
                System.out.println("Tansiiton Failed!! : You don't have enough money to withdraw");
                return;
            }
            Amount -= amount;
            System.out.println(amount + " has debited from your bank account");
        }
        public void checkBalance(){
            System.out.println("Current Balance : " + Amount);
        }
    }

    public static void main(String[] args) {
        userBank u1 = new userBank();
        u1.depositing(3000);
        u1.withdrawing(500);
        u1.checkBalance();
        
    }
    
}
