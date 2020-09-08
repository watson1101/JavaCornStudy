package com.hong.toolbox.pdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfCopy;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfReader;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PdfSplit {

    public static void main(String[] args) {
        String inputFile = "D:\\temp\\1.pdf";
//        splitFile(inputFile, 1, 1);//第1页为一个文件
//        splitFile(inputFile, 2, 2);//第2页为一个文件
//        splitFile(inputFile, 3, 4);//第3，4页为一个文件
//        splitFile(inputFile, 5, 8);//以下类似
//        splitFile(inputFile, 9, 12);
//        splitFile(inputFile, 13, 13);
//        splitFile(inputFile, 14, 18);

        // 1,278,635,1204,1746,2066,2568,3227,3599,3868,4563,5014,5423,5966,6237,6706,7173,7469,7902,8310,8585,9072,9397,9756
        int[] pageNum = {1, 278, 635, 1204, 1746, 2066, 2568, 3227, 3599, 3868, 4563, 5014, 5423,
            5966, 6236, 6706, 7173, 7469, 7902, 8310, 8585, 9072, 9396, 9756};
        for (int i = 0; i < pageNum.length - 1; i++) {
            splitFile(inputFile, pageNum[i]+1, pageNum[i + 1]);
        }
    }

    public static String splitFile(String pdfFile, Integer from, Integer end) {

        Document document = null;
        PdfCopy copy = null;
        try {
            PdfReader reader = new PdfReader(pdfFile);
            int n = reader.getNumberOfPages();
            if (end == 0) {
                end = n;
            }
            List<String> savepaths = new ArrayList<String>();
            int a = pdfFile.lastIndexOf(".pdf");
            String staticpath = pdfFile.substring(0, a);
            String savepath = staticpath + "_from_" + from + "_to_" + end + "_.pdf";
            savepaths.add(savepath);
            document = new Document(reader.getPageSize(1));
            copy = new PdfCopy(document, new FileOutputStream(savepaths.get(0)));
            document.open();
            for (int j = from; j <= end; j++) {
                document.newPage();
                PdfImportedPage page = copy.getImportedPage(reader, j);
                copy.addPage(page);
            }
            document.close();
            return new File(savepath).getName();
        } catch (IOException e) {
            return null;
        } catch (DocumentException e) {
            return null;
        }
    }

}
