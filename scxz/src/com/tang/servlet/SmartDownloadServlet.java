package com.tang.servlet;

import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SmartDownloadServlet  extends HttpServlet{


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String filename = req.getParameter("filename");

        SmartUpload su = new SmartUpload();
        su.initialize(getServletConfig(), req, resp);
        su.setContentDisposition(null);
        try {
            su.downloadFile("/images/"+filename);
        } catch (SmartUploadException e) {
            e.printStackTrace();
        }
    }
}
