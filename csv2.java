import java.io.*;
public class csv2{
    public static void main(String[] args) {
        String line=null;
        int totalCount=0;
        float totalSalary=0;
        try{
            BufferedReader input=new BufferedReader(new FileReader("csvFile.csv"));
            while((line=input.readLine())!=null)
            {
                String[] BillAmount=line.split(",");
                totalSalary+=Float.parseFloat(BillAmount[3]);
                totalCount++;
            }
        }catch(IOException e){
            e.printStackTrace();  
        }
        System.out.println("Total Number of Records: "+totalCount);
        System.out.println("Total Salary paid to all the Employees: "+totalSalary);
    }
}