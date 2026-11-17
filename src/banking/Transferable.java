package banking;

import com.joysistvi.day28enums.Activity19_Madelo.Transaction;

public interface Transferable {
    boolean transfer(Transaction target, double amount);
}
