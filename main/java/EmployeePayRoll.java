import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeePayRoll {
    public static void main(String[] args) {
        String FETCH = "SELECT * FROM employee_payroll";
        EmployeeConfig eConfig = new EmployeeConfig();
        eConfig.getConfig();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = eConfig.getConfig().prepareStatement(FETCH);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.print("EmpId: " + resultSet.getInt("EmpId") + ",");
                System.out.print("EmpName: " + resultSet.getString("EmpName") + ",");
                System.out.print("PhoneNumber: " + resultSet.getString("PhoneNumber") + ",");
                System.out.print("Address: " + resultSet.getString("Address") + ",");
                System.out.print("Department: " + resultSet.getString("Department") + ",");
                System.out.print("Gender: " + resultSet.getString("Gender") + ",");
                System.out.print("BasicPay: " + resultSet.getString("BasicPay") + ",");
                System.out.print("Deductions: " + resultSet.getString("Deductions") + ",");
                System.out.print("TaxablePay: " + resultSet.getString("TaxablePay") + ",");
                System.out.print("IncomeTax: " + resultSet.getString("IncomeTax") + ",");
                System.out.print("NetPay: " + resultSet.getString("NetPay") + ",");
                System.out.print("EmpStart: " + resultSet.getString("EmpStart"));
                System.out.println("-------------------------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}