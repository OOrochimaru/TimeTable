package com.generator.timetable;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class EcxelWorkSheet {
    public static void main(String[] args) throws IOException {
        JFileChooser file = new JFileChooser();
        int returnValue = file.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION){
            try {
                Workbook workbook = new HSSFWorkbook(new FileInputStream(file.getSelectedFile()));
                Sheet sheet = workbook.getSheetAt(0);
                for (Iterator<Row> rit = sheet.rowIterator();rit.hasNext();){
                    Row row = rit.next();
                    for (Iterator<Cell> cit = row.cellIterator();cit.hasNext();){
                        Cell cell = cit.next();
                        cell.setCellType(Cell.CELL_TYPE_STRING);
                        System.out.print(cell.getStringCellValue()+"\t");
                    }
                }
            }catch (Exception e){
                e.getMessage();
            }

        }

        /*Workbook workbook = new HSSFWorkbook();
        Sheet cseIV = workbook.createSheet("CSE IVth Year");
        Sheet cseIII = workbook.createSheet("CSE III year");
        Cell c1 = cseIV.createRow(0).createCell(3);
        cseIV.addMergedRegion(new CellRangeAddress(0,4,1,5));
        CellStyle cs = c1.getCellStyle();
        c1.getRow().setHeightInPoints(80);
        cseIV.setColumnWidth(0,8000);
        Font font = workbook.createFont(); //fonts are created for whole workbook;
        font.setFontHeightInPoints((short) 80);
        c1.setCellValue("Hello");
        System.out.println(c1.getRichStringCellValue().toString());
        try {
            FileOutputStream file = new FileOutputStream("TimeTable.xls");
            workbook.write(file);
            file.close();
        }catch (Exception e){
            e.getMessage();
        }*/
    }
}
