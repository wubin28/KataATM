package com.wubinben.kata.kataatm.application;

/**
 * Created with IntelliJ IDEA.
 * User: Ben
 * Date: 13-8-16
 * Time: 下午9:39
 * To change this template use File | Settings | File Templates.
 */
public class WithdrawCommand extends Command {
    public WithdrawCommand(Account account) {
        super(account);
    }

    @Override
    public void execute(int amount) {
        super.account.withdraw(amount);
    }

    public static WithdrawCommand newInstance(Account account) {
        return new WithdrawCommand(account);
    }
}
