/**
 * @author XuMenglin
 * @date 2019年9月2日
 *
 */
package com.controller;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>Title: fileController</p>
 * <p>Description:用户手册下载 </p>
 * @author XuMenglin
 * @date 2019年9月2日
 */
@Controller
@RequestMapping("file")
public class fileController {
	
	

	
	
	
	
	
	@RequestMapping("download")
    public void download(HttpServletRequest request,
            HttpServletResponse response) {
        OutputStream outputStream = null;
        InputStream inputStream=null;
        try {
            outputStream = response.getOutputStream();
            response.setContentType("application/octet-stream;charset=UTF-8");// 设置文件输出类型
            response.setHeader("Content-disposition", "attachment; filename="
                    + new String("自我介绍.txt".getBytes("utf-8"), "ISO8859-1"));//设置下载的文件名

            /*String basePath01 = request.getScheme() + "://"
                    + request.getServerName() + ":" + request.getServerPort()
                    + request.getContextPath() + "/";
            String basePath02=this.getRequestBasePath(request);*/

            String baseAbsoluteFilePath=request.getServletContext().getRealPath("");//获取的是项目在磁盘中的绝对路径，最后包括"\"

            String fileRelativePath="E:/workspace/citylife/src/main/webapp/自我介绍.txt";//文件相对于webRoot的路径
            
            System.out.println(baseAbsoluteFilePath);

            inputStream=new FileInputStream(fileRelativePath);
            byte[] buff=new byte[1024];
            Integer readLength=0;
            while((readLength=inputStream.read(buff,0,buff.length))>0){
                outputStream.write(buff, 0, readLength);
            }
            outputStream.close();
            inputStream.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
