package com.stone.jobhunter.controller.weixin;


import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.stone.jobhunter.pojo.*;
import com.stone.jobhunter.service.weixin.*;
import com.stone.jobhunter.service.weixinimpl.ReusmeEnterpriseServiceImpl;
import com.stone.jobhunter.utils.JsonUtil;
import com.stone.jobhunter.utils.QiNiuUtil;
import net.sf.json.JSONArray;
import com.stone.jobhunter.basic.PageInfo;
import com.stone.jobhunter.basic.ResponseCode;
import com.stone.jobhunter.basic.ReturnMessage;
import com.stone.jobhunter.utils.PageUtil;
import com.stone.jobhunter.vo.ListResumeVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.List;


/**
 * liyue 2018/7/8
 */
@RestController
@RequestMapping("/weixin/resume")
public class WeixinResumeController {

@Autowired
private ResumeService resumeService;
@Autowired
private DeliverJobService deliverJobService;
@Autowired
private ResumePurposeService resumePurposeService;
@Autowired
private ResumeScienceService resumeScienceService;
@Autowired
private ResumeSchoolService resumeSchoolService;
@Autowired
private ResumeEnterpriseService resumeEnterpriseService;

    @ApiOperation(value = "添加简历", notes = "添加简历")
    @RequestMapping(value = "/insertResume", method = RequestMethod.POST)
    public ReturnMessage insertResume(@RequestBody  String obj) throws ParseException, UnsupportedEncodingException {
        int insert[]=new int[5];
        obj = new String(obj.getBytes("ISO-8859-1"), "UTF-8");
        Resume resume=JsonUtil.checkJson(obj);
        insert[0]=resumeService.insert(resume);
        List<ResumePurpose> resumePurposeList =JsonUtil.checkJson1(obj);
        for(ResumePurpose resumePurpose : resumePurposeList)
        insert[1]=resumePurposeService.insert(resumePurpose);

        List<ResumeSchool>resumeSchoolList =JsonUtil.checkJson2(obj);
        for(ResumeSchool resumeSchool: resumeSchoolList)
        insert[2]=resumeSchoolService.insert(resumeSchool);

        List<ResumeScience> resumeScienceList=JsonUtil.checkJson3(obj);
        for(ResumeScience resumeScience : resumeScienceList)
            insert[3]=resumeScienceService.insert(resumeScience);

       List<ResumeEnterprise> resumeEnterpriseList=JsonUtil.checkJson4(obj);
        for(ResumeEnterprise resumeEnterprise : resumeEnterpriseList)
            insert[3]=resumeEnterpriseService.insert(resumeEnterprise);
        return new ReturnMessage(ResponseCode.OK,insert);
    }
    @RequestMapping(value = "/insertResumePicture", method = RequestMethod.POST)
    @ApiOperation(value = "存储图片信息")
    @ResponseBody
    public ReturnMessage insertResumePicture(@RequestParam("resumeId") Integer resumeId, @RequestParam(value = "flyfile", required = false) MultipartFile flfile) {
        String picture = "";
      Resume resume=new Resume();
       resume.setId(resumeId);
        if (flfile != null)
            picture = QiNiuUtil.manageFile(flfile);
        resume.setUpdateTime(Calendar.getInstance().getTime());
        int insert = resumeService.updateByPrimaryKeySelective(resume);

        return new ReturnMessage(ResponseCode.OK, insert);
    }
    @ApiOperation(value = "简历列表", notes = "简历列表")
    @RequestMapping(value = "/ListResume", method = RequestMethod.POST)
    public ReturnMessage ListResume(@RequestParam("userId")Integer userId,@RequestParam(required = false) Integer pageSize, @RequestParam(required = false) Integer pageNumber) {

        PageInfo<ListResumeVo> pageInfo=resumeService.getResumeList(userId,PageUtil.setPage(pageNumber));
        return new ReturnMessage(ResponseCode.OK, 0);
    }
    @ApiOperation(value = "简历投递", notes = "简历投递")
    @RequestMapping(value = "/PostResume", method = RequestMethod.POST)
    public ReturnMessage PostResume(@RequestParam("userId") Integer userId,@RequestParam("resumeId") Integer resumeId,@RequestParam("enterpriseId") Integer enterpriseId) {
        DeliverJob deliverJob=new DeliverJob();
        deliverJob.setResumeId(resumeId);
        deliverJob.setUserId(userId);
        deliverJob.setEnterpriseId(enterpriseId);
        int insert=deliverJobService.insert(deliverJob);
        return new ReturnMessage(ResponseCode.OK, insert);
    }
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