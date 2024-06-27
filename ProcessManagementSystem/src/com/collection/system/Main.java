package com.collection.system;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ProcessManager processManager = new ProcessManager();
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Select Below Options To Performing the Process Operations.....");

	        while (true) {
	            System.out.println("1. Add Process");
	            System.out.println("2. Remove Process");
	            System.out.println("3. Search for a Process");
	            System.out.println("4. List All Processes");
	            System.out.println("5. Update Process Status");
	            System.out.println("6. Get Pending Processes History");
	            System.out.println("7. Get Completed Processes History");
	            System.out.println("8. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter process ID: ");
	                    int processId = sc.nextInt();
	                    System.out.print("Enter process name: ");
	                    String processName = sc.next();
	                    Process process = new Process(processId, processName, "Pending");
	                    processManager.addProcess(process);
	                    System.out.println("Process added successfully");
	                    break;
	                case 2:
	                    System.out.print("Enter process ID to remove: ");
	                    int removeProcessId = sc.nextInt();
	                    processManager.removeProcess(removeProcessId);
	                    System.out.println("Process remove successfully");
	                    break;
	                case 3:
	                    System.out.print("Enter process ID to search: ");
	                    int searchProcessId = sc.nextInt();
	                    Process searchedProcess = processManager.searchProcess(searchProcessId);
	                    if (searchedProcess!= null) {
	                        System.out.println("Process found: " + searchedProcess);
	                    } else {
	                        System.out.println("Process not found");
	                    }
	                    break;
	                case 4:
	                    List<Process> allProcesses = processManager.listAllProcesses();
	                    for (Process p : allProcesses) {
	                        System.out.println(p);
	                    }
	                    break;
	                case 5:
	                    System.out.print("Enter process ID to update: ");
	                    int updateProcessId = sc.nextInt();
	                    System.out.print("Enter new status: ");
	                    String newStatus = sc.next();
	                    processManager.updateProcessStatus(updateProcessId, newStatus);
	                    System.out.println("Process status updated");
	                    break;
	                case 6:
	                    List<Process> pendingProcesses = processManager.getPendingProcessesHistory();
	                    for (Process p : pendingProcesses) {
	                        System.out.println(p);
	                    }
	                    break;
	                case 7:
	                    List<Process> completedProcesses = processManager.getCompletedProcessesHistory();
	                    for (Process p : completedProcesses) {
	                        System.out.println(p);
	                    }
	                    break;
	                case 8:
	                   // System.exit(0);
	                    System.out.println("Thank You .All Operations are Performed.....");
	                   break;
	                default:
	                    System.out.println("Invalid choice");
	            }
	        }
		
		/*ProcessManager processManager = new ProcessManager();

        // Add processes
        processManager.addProcess(new Process(1, "P1", "Pending"));
        processManager.addProcess(new Process(2, "P2", "Pending"));
        processManager.addProcess(new Process(3, "P3", "Pending"));

        // List all processes
        System.out.println("All processes:");
        for (Process p : processManager.listAllProcesses()) {
            System.out.println(p);
            
        }

        // Update process status
        processManager.updateProcessStatus(1, "Running");
        processManager.updateProcessStatus(2, "Completed");
      
        // List all processes
        System.out.println("All processes:");
        for (Process p : processManager.listAllProcesses()) {
            System.out.println(p);
            
        }
        System.out.println("==================================================");
        // Get pending processes history
        System.out.println("Pending processes history:");
        for (Process p : processManager.getPendingProcessesHistory()) {
            System.out.println(p);
            System.out.println("==================================================");
        }

        // Get completed processes history
        System.out.println("Completed processes history:");
        for (Process p : processManager.getCompletedProcessesHistory()) {
            System.out.println(p);
        }*/
    }
	    }

	


