package test;

import main.controller.ATMController;
import main.controller.BankAccount;
import main.controller.User;

public class ATMControllerTest {
    public static void main(String[] args) {
        ATMController atm = new ATMController();

        // 테스트 데이터
        atm.addUser("card1", new User("card1", 1234));
        atm.addAccount("acc1", new BankAccount("acc1", 1000, "card1"));
        atm.addAccount("acc2", new BankAccount("acc2", 2000, "card1"));

        // 테스트 진행
        System.out.println("카드 삽입 테스트: " + (atm.insertCard("card1") ? "성공" : "실패"));
        System.out.println("잘못된 카드 테스트: " + (atm.insertCard("wrongCard") ? "성공" : "실패"));

        System.out.println("PIN 입력 테스트: " + (atm.enterPIN(1234) ? "성공" : "실패"));
        System.out.println("잘못된 PIN 테스트: " + (atm.enterPIN(1111) ? "성공" : "실패"));

        System.out.println("계좌 선택 테스트: " + (atm.selectAccount("acc1") ? "성공" : "실패"));
        System.out.println("잘못된 계좌 선택 테스트: " + (atm.selectAccount("acc3") ? "성공" : "실패"));

        System.out.println("잔액 조회 테스트: $" + atm.checkBalance());

        System.out.println("입금 테스트 (1000 추가): " + (atm.deposit(1000) ? "성공" : "실패"));
        System.out.println("잔액 조회 테스트: $" + atm.checkBalance());

        System.out.println("출금 테스트 (500 출금): " + (atm.withdraw(500) ? "성공" : "실패"));
        System.out.println("잔액 조회 테스트: $" + atm.checkBalance());

        System.out.println("잔액 부족 테스트 (5000 출금): " + (atm.withdraw(5000) ? "성공" : "실패"));

    }
}
