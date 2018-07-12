package com.stone.jobhunter.controller.sys;


import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.stone.jobhunter.basic.ResponseCode;
import com.stone.jobhunter.basic.ReturnMessage;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * liyue 2018/7/8
 */
@RestController
@RequestMapping("/weixin/resume")
public class SysResumeController {



    @ApiOperation(value = "导出pdf", notes = "导出pdf")
    @RequestMapping(value = "/getResumePDF", method = RequestMethod.POST)
    public ReturnMessage getResumePDf(String url) throws IOException, DocumentException {
        Document document = new Document();
        // 第二步，设置要到出的路径
        FileOutputStream out = new  FileOutputStream(url);
        //如果是浏览器通过request请求需要在浏览器中输出则使用下面方式
        //OutputStream out = response.getOutputStream();
        // 第三步,设置字符
        BaseFont bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", false);
        Font fontZH = new Font(bfChinese, 12.0F, 0);
        // 第四步，将pdf文件输出到磁盘
        PdfWriter writer = PdfWriter.getInstance(document, out);
        // 第五步，打开生成的pdf文件
        document.open();
        // 第六步,设置内容
        String title = "标题";
        document.add(new Paragraph(new Chunk(title, fontZH).setLocalDestination(title)));
        document.add(new Paragraph("\n"));
        // 创建table,注意这里的2是两列的意思,下面通过table.addCell添加的时候必须添加整行内容的所有列
        PdfPTable table = new PdfPTable(2);
        table.setWidthPercentage(100.0F);
        table.setHeaderRows(1);
        table.getDefaultCell().setHorizontalAlignment(1);
        table.addCell(new Paragraph("序号", fontZH));
        table.addCell(new Paragraph("结果", fontZH));
        table.addCell(new Paragraph("1", fontZH));
        table.addCell(new Paragraph("出来了", fontZH));

        document.add(table);
        document.add(new Paragraph("\n"));
        // 第七步，关闭document
        document.close();
        System.out.println("导出pdf成功~");

        return new ReturnMessage(ResponseCode.OK, 0);
    }
}