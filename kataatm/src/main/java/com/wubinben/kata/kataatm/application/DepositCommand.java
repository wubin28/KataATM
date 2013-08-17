package com.wubinben.kata.kataatm.application;

/**
 * Created with IntelliJ IDEA.
 * User: Ben
 * Date: 13-8-16
 * Time: 下午9:16
 * To change this template use File | Settings | File Templates.
 */
public class DepositCommand extends Command {

    public DepositCommand(Account account) {
        super(account);
    }

    @Override
    public void execute(int amount) {
        super.account.deposit(amount);
    }

    public static DepositCommand newInstance(Account account) {
        return new DepositCommand(account);
    }
}
