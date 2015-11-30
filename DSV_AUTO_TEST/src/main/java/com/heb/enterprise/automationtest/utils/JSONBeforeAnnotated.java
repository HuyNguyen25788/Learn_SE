package com.heb.enterprise.automationtest.utils;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class JSONBeforeAnnotated extends TestWatcher {
    private JSONBeforeTest jsonBeforeTest;

    @Override
    protected void starting( Description description) {
        jsonBeforeTest = description.getAnnotation( JSONBeforeTest.class);
    }

    public JSONBeforeTest getJsonBeforeTest() {
        return jsonBeforeTest;
    }

    /** @return the name field attached to the marker. 
                Null if no annotation, "" if no value field. */
    public String getJsonBeforeTestValue() {
        if( jsonBeforeTest == null) {
            return null;
        }
        return jsonBeforeTest.value();
    }
}
