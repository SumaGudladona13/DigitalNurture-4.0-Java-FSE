package com.p2;
import factories.*;
import documents.Document;

public class Main 
{
    public static void main(String[] args) 
    {
        DocumentFactory word=new WordDocumentFactory();
        Document w1=word.createDocument();
        w1.open();
        DocumentFactory pdf=new PdfDocumentFactory();
        Document p1= pdf.createDocument();
        p1.open();
        DocumentFactory excel=new ExcelDocumentFactory();
        Document e1 = excel.createDocument();
        e1.open();
    }
}
