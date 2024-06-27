package com.collection.system;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProcessManager {
	 private List<Process> processes;
	    private LinkedList<Process> pendingProcessesHistory;
	    private LinkedList<Process> completedProcessesHistory;

	    public ProcessManager() {
	        this.processes = new ArrayList<>();
	        this.pendingProcessesHistory = new LinkedList<>();
	        this.completedProcessesHistory = new LinkedList<>();
	    }

	    public void addProcess(Process process) {
	        processes.add(process);
	        pendingProcessesHistory.add(process);
	    }

	    public boolean removeProcess(int processId) {
	        for (Process process : processes) {
	            if (process.processId == processId) {
	                processes.remove(process);
	                return true;
	            }
	        }
	        return false;
	    }

	    public Process searchProcess(int processId) {
	        for (Process process : processes) {
	            if (process.processId == processId) {
	                return process;
	            }
	        }
	        return null;
	    }

	    public List<Process> listAllProcesses() {
	        return processes;
	    }

	    public boolean updateProcessStatus(int processId, String newStatus) {
	        for (Process process : processes) {
	            if (process.processId == processId) {
	                process.status = newStatus;
	                if (newStatus.equals("Completed")) {
	                    completedProcessesHistory.add(process);
	                    pendingProcessesHistory.remove(process);
	                }
	                return true;
	            }
	        }
	        return false;
	    }

	    public void addPendingProcess(Process process) {
	        pendingProcessesHistory.add(process);
	    }

	    public void addCompletedProcess(Process process) {
	        completedProcessesHistory.add(process);
	    }

	    public List<Process> getPendingProcessesHistory() {
	        return pendingProcessesHistory;
	    }

	    public List<Process> getCompletedProcessesHistory() {
	        return completedProcessesHistory;
	    }
}

