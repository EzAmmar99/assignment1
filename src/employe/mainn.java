/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employe;

import javax.swing.JOptionPane;

/**
 *
 * @author Ez Ammar
 */
public class mainn {

    public static void main(String[] args) {

        Employee[] employee = new Employee[10];

        for (int i = 0; i < employee.length; i++) {

            Employee em = new Employee();
            System.out.println("Enter a employee information : ");    //Enter The Enformation 

            em.setName(JOptionPane.
                    showInputDialog(null, "Name", "Employee",
                            JOptionPane.INFORMATION_MESSAGE));

            em.setDepartment(JOptionPane.
                    showInputDialog(null, "Department", "Employee",
                            JOptionPane.INFORMATION_MESSAGE));

            em.setSalary(Double.parseDouble(JOptionPane.
                    showInputDialog(null, "Salary", "Employee",
                            JOptionPane.INFORMATION_MESSAGE)));
            employee[i] = em;
        }

        sortArray(employee);
        showData(employee);

    }

    public static void sortArray(Employee[] em) {
        for (int i = 0; i < em.length; i++) {
            for (int j = i + 1; j < em.length - 1; j++) {
                if (em[j].getSalary() > em[i].getSalary()) {
                    Employee temp = em[i];
                    em[i] = em[j];
                    em[j] = temp;
                }
            }
        }
    }

    private static void showData(Employee[] em) {
        System.out.println("ـــــــــــــــــــــــ");
        System.out.printf("%-10s%-12s%-12s\n", "Name", "Department", "Salary");
        for (Employee employee : em) {
            System.out.printf("%-11s%-10s%-11.2f\n",
                    employee.getName(),
                    employee.getDepartment(),
                    employee.getSalary());
        }
    }
}
