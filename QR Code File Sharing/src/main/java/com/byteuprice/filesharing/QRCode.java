package com.byteuprice.filesharing;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Paths;
import java.rmi.ServerException;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/code")
public class QRCode extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
	throws IOException,  ServletException{
		PrintWriter pw=res.getWriter();
		String data=req.getParameter("data");
		String filename=req.getParameter("filename");
		if(filename!=null && !filename.isEmpty()&&data!=null&&!data.isEmpty()) {
		File f= new File("C:\\Users\\ramkr\\Downloads\\ProjectQR\\"+filename+".jpg");
		try {
		BitMatrix m=new MultiFormatWriter().encode(data,BarcodeFormat.QR_CODE,500,500);
		MatrixToImageWriter.writeToPath(m,"jpg",Paths.get(f.toURI()));
		//pw.println("Success!..");
		RequestDispatcher rd=req.getRequestDispatcher("success.jsp");
		rd.include(req, res);
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
		else {
			//pw.println("Faild!..");
			RequestDispatcher rd=req.getRequestDispatcher("failed.jsp");
			rd.include(req, res);
		
		}
	}

}
