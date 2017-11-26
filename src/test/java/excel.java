import com.jm.excel.export.ExcelExport;
import com.tofree.erxi_excel.erxi.dao.OrderDetailDAO;
import com.tofree.erxi_excel.erxi.domain.OrderMoney;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

public class excel {
//    @Test
    public void typeTest() throws FileNotFoundException {
         System.out.println("开始导出");
       try {
            FileOutputStream fileOut=new FileOutputStream("d:\\test.xls");
            List<OrderMoney> orders;
            OrderDetailDAO od=new OrderDetailDAO();
            orders= od.getTest("2017-10-1","2017-11-1");
            System.out.println(orders.size());
            System.out.println(orders);
            ExcelExport.exportExcel(fileOut,orders);
        } catch (Exception e) {
            e.printStackTrace();
        }


      /*  System.out.println("开始导出");

        FileOutputStream fileOut=new FileOutputStream("d:\\test.xls");
        //List<test> tests=new ArrayList<test>();
        List<test> orders=new ArrayList<test>();
        OrderDetailDAO od=new OrderDetailDAO();
        orders=od.getTest("2017-10-1","2017-11-1");


        ExcelExport.exportExcel(fileOut,orders);
        fileOut.close();*/


        /*String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; //加载JDBC驱动
        String dbURL = "jdbc:sqlserver://localhost:1433; DatabaseName=erxi_app"; //连接服务器和数据库sample
        String userName = "erxi_api"; //默认用户名
        String userPwd = "^ba9)32!Kq"; //密码
        Connection dbConn;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
           dbConn = DriverManager.getConnection(dbURL, userName, userPwd);
            System.out.println( "Connection Successful! :"); //如果连接成功 控制台输出Connection Successful!
//            dbConn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }

}