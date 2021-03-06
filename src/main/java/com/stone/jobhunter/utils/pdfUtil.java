package com.stone.jobhunter.utils;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import com.stone.jobhunter.pojo.*;


import java.io.*;
import java.nio.charset.Charset;
import java.util.List;

public class pdfUtil {




    public static void createPdf(String url, List<Resume> resumeList,
                                 List<ResumeScience> resumeScienceList,
                                 List<ResumeSchool> resumeSchoolList,
                                 List<ResumeEnterprise> resumeEnterpriseList, List<ResumeCertificate> resumeCertificateList) {
        try {
            BaseFont bfChinese = BaseFont.createFont("STSongStd-Light", "UniGB-UCS2-H", false);
            Font font = new Font(bfChinese, 12, Font.NORMAL);

            Document document = new Document(PageSize.A4, 10, 10, 10, 10);
            PdfWriter mPdfWriter = PdfWriter.getInstance(document, new FileOutputStream(url+"/"+resumeList.get(0).getUserName()+".pdf"));
            document.open();
            String s = getHtml(resumeList, resumeScienceList, resumeSchoolList, resumeEnterpriseList,resumeCertificateList);

            ByteArrayInputStream bin = new ByteArrayInputStream(s.getBytes("UTF-8"));
            XMLWorkerHelper.getInstance().parseXHtml(mPdfWriter, document, bin, Charset.forName("UTF-8"), new ChinaFontProvide());
            document.close();
            mPdfWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getHtml(List<Resume> resumeList,
                                 List<ResumeScience> resumeScienceList,
                                 List<ResumeSchool> resumeSchoolList,
                                 List<ResumeEnterprise> resumeEnterpriseList,List<ResumeCertificate> resumeCertificateList) {


        String url = resumeList.get(0).getUserPhoto();
        StringBuffer html = new StringBuffer();


        html.append(
                "<html >\n" +
                        "<head>\n" +
                        "<meta http-equiv=”Content-Type” content=”text/html; charset=UTF-8″/>\n"+
                        "<style type=\"text/css\">\n" +
                        " body {font-family: SimSun; background:none;margin-left: auto;margin-right: auto;}\n" +
                        ".lay3{ width:90px; height:20px; border:1px solid #FF6699; float:left} \n " +
                        ".lay1{ float:left}   \n" +
                        ".lay2{  float:left}   \n" +
                        //	".lay3{float:left} \n "+
                        " .personal-img{\n" +
                        "            width:120px;\n" +
                        "            height:160px;\n" +
                        "        }\n" +
                        " .header {\n" +
                        "            text-align: center;\n" +
                        "        }\n" +


                        "</style>\n" +
                        "</head>" +
                        "<body>\n" +
                        " <div class=\"header\">\n" +
                        "        <!---->\n" +
                        "        <h1 >" + resumeList.get(0).getUserName()+ "简历</h1>\n" +
                        "    </div>\n" +
                        "<div>\n" +
                        "    <div class=\"sub-header\" > 个人信息</div>\n" +
                        "    <div class=\"lay3\" >" +
                        "    </div >" +
                        "    <div class=\"lay2\" >" +
                        "<table>\n" +
                        "            <tr>\n" +
                        "                <td class=\"personal-info-td-title\">性别：</td>\n" +
                        "                <!---->\n" +
                        "                <td class=\"person-info-td-content\">" + resumeList.get(0).getUserGender() + "</td>\n" +
                        "                <td class=\"personal-info-td-title\"></td>\n" +
                        "                <td class=\"person-info-td-content\"></td>\n" +
                        "                <td class=\"personal-info-td-title\">专业：</td>\n" +
                        "                <!---->\n" +
                        "                <td class=\"person-info-td-content\">" + resumeSchoolList.get(0).getMajor() + "</td>\n" +
                        "            </tr>\n" +
                        "            <tr>\n" +
                        "                <td class=\"personal-info-td-title\">籍贯：</td>\n" +
                        "                <!---->\n" +
                        "                <td class=\"person-info-td-content\">" + resumeList.get(0).getAdress() + "</td>\n" +
                        "                <td class=\"personal-info-td-title\"></td>\n" +
                        "                <td class=\"person-info-td-content\"></td>\n" +
                        "                <td class=\"personal-info-td-title\">院校：</td>\n" +
                        "                <!---->\n" +
                        "                <td class=\"person-info-td-content\">" + resumeSchoolList.get(0).getSchool() + "</td>\n" +
                        "            </tr>\n" +
                        "            <tr>\n" +
                        "                <td class=\"personal-info-td-title\">出生日期：</td>\n" +
                        "                <!---->\n" +
                        "                <td class=\"person-info-td-content\">" + resumeList.get(0).getUserBirth() + "</td>\n" +
                        "                <td class=\"personal-info-td-title\"></td>\n" +
                        "                <td class=\"person-info-td-content\"></td>\n" +
                        "                <td class=\"personal-info-td-title\">微信号：</td>\n" +
                        "                <!---->\n" +
                        "                <td class=\"person-info-td-content\">" + resumeList.get(0).getWechat() + "</td>\n" +
                        "            </tr>\n" +

                        "            <tr>\n" +
                        "                <td class=\"personal-info-td-title\">联系电话：</td>\n" +
                        "                <!---->\n" +
                        "                <td class=\"person-info-td-content\">" + resumeList.get(0).getUserPhone() + "</td>\n" +
                        "                <td class=\"personal-info-td-title\"></td>\n" +
                        "                <td class=\"person-info-td-content\"></td>\n" +
                        "                <td class=\"personal-info-td-title\">电子邮件：</td>\n" +
                        "                <!---->\n" +
                        "                <td class=\"person-info-td-content\">" + resumeList.get(0).getUserEmail() + "</td>\n" +
                        "            </tr>\n" +
                        "            <tr>\n" +
                        "                <td class=\"personal-info-td-title\">qq：</td>\n" +
                        "                <!---->\n" +
                        "                <td class=\"person-info-td-content\">" + resumeList.get(0).getQq() + "</td>\n" +
                        "                <td class=\"personal-info-td-title\"></td>\n" +
                        "                <td class=\"person-info-td-content\"></td>\n" +
                        "                <td class=\"personal-info-td-title\">个人定位：</td>\n" +
                        "                <!---->\n" +
                        "                <td class=\"person-info-td-content\">" + resumeList.get(0).getSelfPosition() + "</td>\n" +
                        "            </tr>\n" +
                        "        </table>\n" +
                        "</div>\n" +
                        "    <div class=\"lay2\">" +
                        " <img src=\"" + url + "\" class=\"personal-img\"/>\n" +
                        "</div>\n" +
                        "</div>");
        html.append("<hr/>\n");

        html.append("<div>\n");
        html.append("<div>\n");
        html.append("        <div class=\"lay2\">\n" +
                "            学习经历\n" +
                "        </div>\n");

        html.append("<div class=\"lay2\">\n");
        for (int i = 0; i < resumeSchoolList.size(); ++i) {
            html.append(
                    "        <div >\n" +
                            "        <pre>\n" +
                            "    " + resumeSchoolList.get(i).getExperience() + "\n" +
                            "        </pre>\n" +

                            "</div>\n");

        }
        html.append("</div>\n");
        html.append("</div>\n");
        html.append("</div>\n");

        html.append("    <hr/>\n");

        html.append("<div>\n");
        html.append("<div>\n");
        html.append("    <div class=\"lay2\">\n" +
                "            项目经历\n" +
                "        </div>\n");

        html.append("<div class=\"lay2\">\n");
        for (int i = 0; i < resumeScienceList.size(); ++i) {
            html.append(
                    "      <div >\n" +
                            "    <pre>\n" +
                            "    " + resumeScienceList.get(i).getScienceName() + "\n" +
                            "    项目职责：" + resumeScienceList.get(i).getContext() + "\n" +
                            "    应用技术：\n" +
                            "       " + resumeScienceList.get(i).getScienceText() + "" +
                            "    </pre>\n" +
                            "        </div>\n"
            );
        }
        html.append("</div>\n");
        html.append("</div>\n");
        html.append("</div>\n");


        html.append(" <hr/>\n");

        html.append("<div>\n");
        html.append(" <div>\n");
        html.append("        <div class=\"lay2\">\n" +
                "            实习经历\n" +
                "        </div>\n");

        html.append("<div class=\"lay2\">\n");
        for (int i = 0; i < resumeEnterpriseList.size(); ++i) {
            html.append(
                    "        <div >\n" +
                            "    <pre>\n" +
                            "   " + resumeEnterpriseList.get(i).getEnterpriseName() + "\n" +
                            "        工作职责：\n" +
                            "        " + resumeEnterpriseList.get(i).getPosition() + "\n" +
                            "    " + resumeEnterpriseList.get(i).getContext() + "\n" +
                            "    </pre>\n" +
                            "        </div>\n");
        }
        html.append("</div>\n");
        html.append("</div>\n");
        html.append("</div>\n");

        html.append(" <hr/>\n");

        html.append(" <div>\n");
        html.append(" <div>\n");
        html.append("        <div class=\"lay2\">\n" +
                "            自我评价\n" +
                "        </div>\n");

        html.append("<div class=\"lay2\">\n");
        html.append(
                "        <div >\n" +
                        "    <pre>\n" +
                        ""+resumeList.get(0).getSelfAssessment()+"\n"+
                        "    </pre>\n" +
                        "        </div>\n");

        html.append("</div>\n");
        html.append("</div>\n");
        html.append("</div>\n");

        html.append("    <hr/>\n");

        html.append("<div>\n");
        html.append("<div>\n");
        html.append("    <div class=\"lay2\">\n" +
                "            证书\n" +
                "        </div>\n");

        html.append("<div class=\"lay2\">\n");
        for (int i = 0; i < resumeCertificateList.size(); ++i) {
            html.append(
                    "      <div >\n" +
                            "    <pre>\n" +
                            "    " + resumeCertificateList.get(i).getName() + "  " +
                            "       " + resumeCertificateList.get(i).getGrade() + "" +
                            "    </pre>\n" +
                            "        </div>\n"
            );
        }
        html.append("</div>\n");
        html.append("</div>\n");
        html.append("</div>\n");


        html.append(
                "</body>\n" +
                        "</html>\n");

        return html.toString();
    }

    public static String getURLSource(File url) throws Exception {
        InputStream inStream = new FileInputStream(url);
        // 通过输入流获取html二进制数据
        byte[] data = readInputStream(inStream); // 把二进制数据转化为byte字节数据
        String htmlSource = new String(data);

        inStream.close();
        return htmlSource;
    }

    /**
     * 把二进制流转化为byte字节数组
     *
     * @param instream
     * @return byte[]
     * @throws Exception
     */
    public static byte[] readInputStream(InputStream instream) throws Exception {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1204];
        int len = 0;
        while ((len = instream.read(buffer)) != -1) {
            outStream.write(buffer, 0, len);
        }
        instream.close();
        return outStream.toByteArray();
    }

    /**
     * 提供中文
     */
    public static final class ChinaFontProvide implements FontProvider {

        @Override
        public Font getFont(String arg0, String arg1, boolean arg2, float arg3,
                            int arg4, BaseColor arg5) {
            BaseFont bfChinese = null;
            try {
                bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H",
                        false);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Font FontChinese = new Font(bfChinese, 12, Font.NORMAL);
            return FontChinese;
        }

        @Override
        public boolean isRegistered(String arg0) {
            return false;
        }
    }
}

