package com.wubinben.kata.kataatm.application;

/**
 * Created with IntelliJ IDEA.
 * User: Ben
 * Date: 13-8-16
 * Time: 下午8:19
 * To change this template use File | Settings | File Templates.
 */
public abstract class Command {
    protected Account account;

    public Command(Account account) {
        this.account = account;
    }

    public abstract void execute(int amount);
}
