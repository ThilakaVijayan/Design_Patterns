package com.thilaka.design.patterns.behavioural.template.mosh.example1;

public abstract class Task {
    private AuditTrail auditTrail;

    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public Task() {
        auditTrail = new AuditTrail();
    }

    public void execute(){
        auditTrail.record();
        doExecute();
    }

    protected abstract void doExecute();
}
