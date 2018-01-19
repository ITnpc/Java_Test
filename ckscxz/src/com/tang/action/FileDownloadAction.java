package com.tang.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class FileDownloadAction extends ActionSupport {

    public String inputPath;

    public String filename;

    public String getInputPath() {
        return inputPath;
    }

    public void setInputPath(String inputPath) {
        this.inputPath = inputPath;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    public InputStream getInputStream() throws IOException {

        String path = ServletActionContext.getServletContext().getRealPath("/userfiles/images");
        System.out.println(path);
        String filepath = path + "\\" + filename;
        System.out.println(filepath);
        File file = new File(filepath);
        return FileUtils.openInputStream(file);
//        return ServletActionContext.getServletContext().getResourceAsStream(inputPath);
    }

    public String getDownloadFileName() {
        String downloadFileName = "";
        try {
            downloadFileName = URLEncoder.encode(filename, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return downloadFileName;
    }
}
