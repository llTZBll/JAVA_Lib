import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int balance = scanner.nextInt();
        BankAccount bankAccount = new BankAccount(balance);
        for (int n = scanner.nextInt(); n > 0 ; n--){
            int pattern = scanner.nextInt();
            int amount = scanner.nextInt();
            if(pattern == 1){
                if(!bankAccount.deposit(amount)){
                    System.out.println("请检查金额");
                    return;
                }
                System.out.println(bankAccount.getBalance());
            }else if(pattern == 2){
                if(!bankAccount.withdraw(amount)){
                    System.out.println("请检查金额");
                    return;
                }
                System.out.println(bankAccount.getBalance());
            }else{
                System.out.println("模式错误");
                return;
            }
        }
    }
}