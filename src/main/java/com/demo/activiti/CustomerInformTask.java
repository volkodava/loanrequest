package com.demo.activiti;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomerInformTask implements JavaDelegate {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void execute(DelegateExecution execution) {
        LoanApplication la = (LoanApplication) execution.getVariable("loanApplication");

        logger.info("Dear {}, your request was regected.", la.getCustomerName());
    }
}
