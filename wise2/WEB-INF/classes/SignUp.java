import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class SignUp extends HttpServlet {
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException { 

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
out.println("welcome");
String s1=request.getParameter("U");
String s2=request.getParameter("p");
String s3=request.getParameter("e");
String s4=request.getParameter("n");
   try{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
PreparedStatement stmt=con.prepareStatement("insert into SignUp values(?,?,?,?)");
stmt.setString(1,s1);
stmt.setString(2,s4);
stmt.setString(3,s3);
stmt.setString(4,s2);
int i=stmt.executeUpdate();
out.println("OK");
//if(i.next())
//System.out.println("recotrd inserted correctly");
response.sendRedirect("./Responsive.html");
stmt.close();	//closing connection	
con.close();
}
catch(SQLException e)
{
	out.println(e);}
catch(ClassNotFoundException e)
 {out.println(e);
 }
 }
}