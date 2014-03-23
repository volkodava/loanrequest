package com.demo.activiti;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateApplicationTask implements JavaDelegate {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void execute(DelegateExecution execution) {
        LoanApplication la = new LoanApplication();

        la.setCreditCheckOk((Boolean) execution.getVariable("creditCheckOk"));
        la.setCustomerName((String) execution.getVariable("name"));
        la.setIncome((Long) execution.getVariable("income"));
        la.setRequestedAmount((Long) execution.getVariable("loanAmount"));
        la.setEmailAddress((String) execution.getVariable("emailAddress"));
        execution.setVariable("loanApplication", la);
        logger.info("Load application created.");
    }
}
