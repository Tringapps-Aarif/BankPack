package BankMethod;


import java.util.*;
import java.util.logging.Logger;

import DetailsBank.*;

public class BankMethod {
    Logger l =Logger.getLogger("BankMethod");
    Scanner sc = new Scanner(System.in);



  String name = sc.nextLine();

      int  accno = sc.nextInt();
       DetailsBank A = new DetailsBank(accno,name);

    public void getData() {
        l.info("NAME:" + A.name);
        l.info("ACCOUNT NUMBER:" + A.accno);
        l.info("CURRENT BALANCE:" + A.currentBalance);
    }

    public void deposit() {

        l.info("Enter the Amount");
        A.depAmt = sc.nextInt();
        A.currentBalance = A.currentBalance + A.depAmt;
        getData();

    }

    public void widthDrawal() {
        l.info("Enter the you need to widthdraw");
        A.wAmt = sc.nextInt();
        A.currentBalance = A.currentBalance - A.wAmt;
        getData();
    }
}