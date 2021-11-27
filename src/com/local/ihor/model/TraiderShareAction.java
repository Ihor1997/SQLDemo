package com.local.ihor.model;

import com.local.ihor.repository.BaseTable;
import com.local.ihor.repository.TraidersRepository;

public class TraiderShareAction extends BaseModel {

    private int operation;
    private Traider traider;
    private ShareRate shareRate;
    private long amount;


    public TraiderShareAction(long id, int operation, Traider traider, ShareRate shareRate, long amount) {
        super(id);
        this.operation = operation;
        this.traider = traider;
        this.shareRate = shareRate;
        this.amount = amount;
    }

    public int getOperation() {
        return operation;
    }

    public void setOperation(int operation) {
        this.operation = operation;
    }

    public Traider getTraider() {
        return traider;
    }

    public void setTraider(Traider traider) {
        this.traider = traider;
    }

    public ShareRate getShareRate() {
        return shareRate;
    }

    public void setShareRate(ShareRate shareRate) {
        this.shareRate = shareRate;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}
