package ru.abcconsulting.wfmplatform;

import java.util.*;

public class ReportsManager {
     public ReportsManager() {
    	 
     }
     
     public void generateReport(Object[] reportsParameters) {
    	 try {
    	     showStateImpl("Started");
    	     // todo: umv: generate impl
    	     showStateImpl("Succeseeded");
    	 }
    	 catch (Exception e) {
    		 showStateImpl("Failed");
    	 }
    	 finally {
    		 showStateImpl("Finished");
    	 }
     }
     
     private void showStateImpl(String state) {
    	 System.out.printf(STATE_MESSAGE_TEMPLATE, new Object[] {state});
     }
     
     private static final String STATE_MESSAGE_TEMPLATE = "Current state is: %s";
}
