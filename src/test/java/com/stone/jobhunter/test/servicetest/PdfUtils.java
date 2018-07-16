package com.stone.jobhunter.test.servicetest;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
/**
 * Created by wangpeng on 2018/02/01.
 */
public class PdfUtils {
    // 利用模板生成pdf  
    public static void pdfout(Map<String,Object> o) {
        // 模板路径  
        String templatePath = "/Users/liyue/Downloads/PDF测试1.pdf";
        // 生成的新文件路径  
        String newPDFPath = "/Users/liyue/Downloads/简历.pdf";

        PdfReader reader;
        FileOutputStream out;
        ByteArrayOutputStream bos;
        PdfStamper stamper;
        try {
            BaseFont bf = BaseFont.createFont("STSong-Light" ,"UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
            Font FontChinese = new Font(bf, 3, Font.NORMAL);
            out = new FileOutputStream(newPDFPath);// 输出流
            reader = new PdfReader(templatePath);// 读取pdf模板  
            bos = new ByteArrayOutputStream();
            stamper = new PdfStamper(reader, bos);
            AcroFields form = stamper.getAcroFields();
            //文字类的内容处理
            Map<String,String> datemap = (Map<String,String>)o.get("datemap");
            form.addSubstitutionFont(bf);
            for(String key : datemap.keySet()){
                String value = datemap.get(key);
                form.setField(key,value);
            }
            //图片类的内容处理
            Map<String,String> imgmap = (Map<String,String>)o.get("imgmap");
            for(String key : imgmap.keySet()) {
                String value = imgmap.get(key);
                String imgpath = value;
                int pageNo = form.getFieldPositions(key).get(0).page;
                Rectangle signRect = form.getFieldPositions(key).get(0).position;
                float x = signRect.getLeft();
                float y = signRect.getBottom();
                //根据路径读取图片
                Image image = Image.getInstance(imgpath);
                //获取图片页面
                PdfContentByte under = stamper.getOverContent(pageNo);
                //图片大小自适应
                image.scaleToFit(signRect.getWidth(), signRect.getHeight());
                //添加图片
                image.setAbsolutePosition(x, y);
                under.addImage(image);
            }
            stamper.setFormFlattening(true);// 如果为false，生成的PDF文件可以编辑，如果为true，生成的PDF文件不可以编辑
            stamper.close();
            Document doc = new Document();
            Font font = new Font(bf, 32);
            PdfCopy copy = new PdfCopy(doc, out);
            doc.open();
            PdfImportedPage importPage = copy.getImportedPage(new PdfReader(bos.toByteArray()), 1);
            copy.addPage(importPage);
            doc.close();

        } catch (IOException e) {
            System.out.println(e);
        } catch (DocumentException e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        Map<String,String> map = new HashMap();
        map.put("mingzi","李越");
        map.put("gender","男");
       map.put("profess","软件工程");
        map.put("face","共产党员");
      java.util.List<String> list=new ArrayList<>();
      list.add("2017年9月-至今 华中科技大学软件学院软件工程硕士");
      list.add("2013年9月-2017年6月山西大学计算机与信息技术学院软件工程专业学习");

      // map.put("list",);
       map.put("xiangmu","（1）2018.1—2018.3 参与华中科技大学软件学院实训，顺利完成offer100的系统获得二等奖的成绩。\n" +
               "工作职责：后端开发，框架搭建\n" +
               "应用技术：\n" +
               "1﹜\t基于spring boot搭建后端框架。\n" +
               "2﹜\t搜索引擎使用solr搜索引擎。\n" +
               "   3、缓存技术使用Cache高速缓冲存储器\n" +
               "（2）2017.10—2017.11 参与华中科技大学软件学院实验室项目—三维嘴型匹配汉字。\n" +
               "  项目职责：使用c++完成嘴形匹配。\n" +
               "应用技术：\n" +
               "1﹜\topencv视觉库。\n" +
               "2﹜\t3D模型开发。\n（1）2018.1—2018.3 参与华中科技大学软件学院实训，顺利完成offer100的系统获得二等奖的成绩。\\n\" +\n" +
               "               \"工作职责：后端开发，框架搭建\\n\" +\n" +
               "               \"应用技术：\\n\" +\n" +
               "               \"1﹜\\t基于spring boot搭建后端框架。\\n\" +\n" +
               "               \"2﹜\\t搜索引擎使用solr搜索引擎。\\n\" +\n" +
               "               \"   3、缓存技术使用Cache高速缓冲存储器\\n\" +\n" +
               "               \"（2）2017.10—2017.11 参与华中科技大学软件学院实验室项目—三维嘴型匹配汉字。\\n\" +\n" +
               "               \"  项目职责：使用c++完成嘴形匹配。\\n\" +\n" +
               "               \"应用技术：\\n\" +\n" +
               "               \"1﹜\\topencv视觉库。\\n\" +\n" +
               "               \"2﹜\\t3D模型开发。\\n");
        Map<String,String> map2 = new HashMap();
        map2.put("img","/Users/liyue/Downloads/WechatIMG6.jpeg");

        Map<String,Object> o=new HashMap();
        o.put("datemap",map);
        o.put("imgmap",map2);
        pdfout(o);
    }
}  