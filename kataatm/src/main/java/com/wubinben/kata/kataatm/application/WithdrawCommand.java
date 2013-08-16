package com.wubinben.kata.kataatm.application;

/**
 * Created with IntelliJ IDEA.
 * User: Ben
 * Date: 13-8-16
 * Time: 下午9:39
 * To change this template use File | Settings | File Templates.
 */
public class WithdrawCommand extends Command {
    @Override
    public void execute(Account account, int amount) {
        account.withdraw(amount);
    }

    public static WithdrawCommand newInstance() {
        return new WithdrawCommand();
    }
}
