package com.another.backConnection.common;

import com.itextpdf.text.DocumentException;

import java.io.FileNotFoundException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * Created by Administrator on 2017/3/16 0016.
 */
public class Test {
    /**
     * @param args
     * @throws DocumentException
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException,
            DocumentException {
        /*// TODO Auto-generated method stub
        Document document = new Document(PageSize.A4, 50, 50, 50, 50);// 是用于生成

        PdfWriter writer = PdfWriter.getInstance(document,
                new FileOutputStream("D:\\pdftest.pdf"));
        document.open();
        BaseFont baseFontChinese = null;
        try {
            baseFontChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Font fontChinese =  new  Font(baseFontChinese , 12 , Font.NORMAL);
        Paragraph par = new Paragraph("你好asdasdasdasdasdasdsdasd",fontChinese);// 此类表示段落。
        par.add("这是我们第一个pdftext。");
        document.add(par);
        document.close();*/



/*        //1.创建Document对象
        Document document = new Document();
        FileOutputStream fos = new FileOutputStream("D:\\pdftest.pdf");
        //2.创建一个PdfWriter实例
        PdfWriter.getInstance(document, fos);
        //3.打开文档
        document.open();
        Paragraph graph = new Paragraph("sajhdajsdasjhdaskjdhs");
        //4.加入段落
        document.add(graph);
        //5.关闭文档
        document.close();*/




    }

}

class PDFParagraph extends Paragraph {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public PDFParagraph(String content) {
        super(content, getChineseFont());
    }

    private static final Font getChineseFont() {

        Font FontChinese = null;
        try {
            BaseFont bfChinese = BaseFont.createFont("STSong-Light",
                    "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
            FontChinese = new Font(bfChinese, 12, Font.NORMAL);
        } catch (DocumentException de) {
            System.err.println(de.getMessage());
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
        return FontChinese;
    }
}
