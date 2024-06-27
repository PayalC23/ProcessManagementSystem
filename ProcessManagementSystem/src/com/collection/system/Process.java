package com.collection.system;

public class Process {
	
	    int processId;
	    String processName;
	    String status;

	    public Process(int processId, String processName, String status) {
	        this.processId = processId;
	        this.processName = processName;
	        this.status = status;
	    }

		@Override
		public String toString() {
			return "Process [processId=" + processId + ", processName=" + processName + ", status=" + status + "]";
		}

}
