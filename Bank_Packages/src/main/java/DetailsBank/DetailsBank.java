package DetailsBank;

import java.util.*;

public class DetailsBank {
    public int accno, bal, currentBalance = 0, depAmt, wAmt;
    public String name;
    Scanner sc = new Scanner(System.in);

    public DetailsBank(int accno, String name) {
        this.accno = accno;
        this.name = name;
    }

}
