import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Login extends HttpServlet {
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException { 

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
out.println("welcome");
   try{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
Statement s=con.createStatement();
out.println("CONNECTION OK");
	//creating statement	
String funame=request.getParameter("e");
String fpwd=request.getParameter("p");
ResultSet rs=s.executeQuery("select * from SignUp where EmailId='"+funame+"' and Password='"+fpwd+"'");	//executing statement	
if(rs.next())
{
//out.println("<h1>User logged in successfully</h1>");
response.sendRedirect("./Responsive.html");
}
else  
{
response.sendRedirect("./Login.html");
//out.println("<h1>User Not Authorized</h1>");
}
con.close();	//closing connection	
out.close();

}catch(SQLException e)
{
out.println(e);
}
catch(ClassNotFoundException e)
 {out.println(e);
 }
   }
}