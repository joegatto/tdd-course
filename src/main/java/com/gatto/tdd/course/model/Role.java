package com.gatto.tdd.course.model;

import com.gatto.tdd.course.CalculationRule;
import com.gatto.tdd.course.FifteenTwentyPerCent;
import com.gatto.tdd.course.TenTwentyPerCent;

public enum Role {
    DEVELOPER(new TenTwentyPerCent()), DBA(new FifteenTwentyPerCent()), TESTER(new FifteenTwentyPerCent());

    private final CalculationRule rule;

    Role(CalculationRule rule) {
        this.rule = rule;
    }

    public CalculationRule getRule() {
        return rule;
    }
}
