package ru.abcconsulting.wfmplatform;

import java.util.*;

///
/// See https://docs.mulesoft.com/mule4-user-guide/v/4.1/intro-java-integration
/// and
/// https://docs.mulesoft.com/connectors/java-invoke-method
/// for how to invoke Java code
///
public class ReportsManager {
     public ReportsManager() {
    	 
     }
     
     ///
     /// data are going through transform message component:
     /// https://docs.mulesoft.com/mule4-user-guide/v/4.1/transform-component-about
     /// messageBody is string representation of HTTP Request
     ///
     public void generateReport(String messageBody) {
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
